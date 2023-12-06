import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudProduto {
    public static void inserir (Produto p){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(ConnectionParameters.getJdbcURL(), ConnectionParameters.getUser(), ConnectionParameters.getPassword());        	
            String sql = "INSERT INTO clientes (id_produto, nome, preco, quantidade) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.setString(2, p.getNome());
            preparedStatement.setFloat(1, p.getPreco());
            preparedStatement.setInt(1, p.getQuantidade());
            preparedStatement.executeUpdate();
            System.out.println("Produto inserido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(preparedStatement != null) {
                    preparedStatement.close();
                }
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

