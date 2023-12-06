import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudDatashow {
    Connection connection = null;

    public void inserir(Datashow datashow) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO datashow (id, descricao) VALUES (?, ?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, datashow.getId());
        preparedStatement.setString(2, datashow.getDescricao());
        preparedStatement.executeUpdate();
        System.out.println("Cliente inserido com sucesso!");

        connection.close();
        preparedStatement.close();
    }

    public void listarTodos() throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM datashow";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("========================" + "\nId: " + resultSet.getInt("id") + "\nDescricao: " + resultSet.getString("descricao") + "\n ");
        }

        connection.close();
        resultSet.close();
        preparedStatement.close();
    }

    public void buscarPorId(int id) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM datashow WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();


        if (resultSet.next()) {
            // Se existirem resultados, obtenha os dados
            System.out.println("Id: " + resultSet.getInt("id") + "\nDescricao: " + resultSet.getString("descricao"));
        } else {
            // Caso contrário, imprima uma mensagem informando que não há resultados
            System.out.println("Nenhum resultado encontrado para o ID: " + id);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
