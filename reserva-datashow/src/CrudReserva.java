import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudReserva {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    
    public void reservar(int id, int id_datashow, int id_professor, String data) throws SQLException{
        
        if(!possuiReserva(id_professor)){
            connection = DatabaseConnector.connectionWithDatabase();
            String sql = "INSERT INTO reserva (id, id_professor, id_datashow, data) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, id_professor);
            preparedStatement.setInt(3, id_datashow);
            preparedStatement.setString(4, data);
            preparedStatement.executeUpdate();
            System.out.println("Reserva feita");

            connection.close();
            preparedStatement.close();
        }else{
            System.out.println("Professor possui reserva.");
        }
    }

    public boolean possuiReserva(int id_professor) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT reservado FROM professor WHERE id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id_professor);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.getInt("reservado") == 1){
            return true;
        }

        return false;
    }

    public void cancelar(int id) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "DELETE FROM reserva WHERE id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        // ResultSet resultSet = preparedStatement.executeQuery();
        preparedStatement.executeUpdate();
        // if(resultSet.getString("data") == curDate()){
        //     System.out.println("Nao e possivel cancelar datas retorativas");
        // }
        
        /*Ainda não consegui desenvolver a lógica para comparar as datas. Pensei em usar essa função abaixo para devolver uma string mas só teria como saber se são iguais e não maior ou menor que. */

        connection.close();
        preparedStatement.close();
    }

    // public String curDate() throws SQLException{
    //     connection = DatabaseConnector.connectionWithDatabase();
    //     String sql = "SELECT curdate()";
    //     preparedStatement = connection.prepareStatement(sql);
    //     ResultSet resultSet = preparedStatement.executeQuery();

    //     return resultSet.getString("curdate()");
    // }

    public void buscarPorData(String data) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM reserva WHERE data = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, data);
        ResultSet resultSet = preparedStatement.executeQuery();


        if (resultSet.next()) {
            // Se existirem resultados, obtenha os dados
            while(resultSet.next()){
                System.out.println("Id: " + resultSet.getInt("id") + "\nProfessor: " + resultSet.getInt("id_professor") + "\nDatashow: " + resultSet.getInt("id_datashow") + "\nData " + resultSet.getString("data"));
            }
        } else {
            // Caso contrário, imprima uma mensagem informando que não há resultados
            System.out.println("Nenhum resultado encontrado para a data: " + data);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public void listarTodasReservas() throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM reserva";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("Id: " + resultSet.getInt("id") + "\nProfessor: " + resultSet.getInt("id_professor") + "\nDatashow: " + resultSet.getInt("id_datashow") + "\nData " + resultSet.getString("data"));
        }

        connection.close();
        resultSet.close();
        preparedStatement.close();
    }
}
