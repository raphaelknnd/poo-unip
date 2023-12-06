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
}
