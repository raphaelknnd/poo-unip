import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudProfessor {
    Connection connection = null;

    public void inserir(Professor professor) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO professor (id, nome, disciplina) VALUES (?, ?, ?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, professor.getId());
        preparedStatement.setString(2, professor.getNome());
        preparedStatement.setString(3, professor.getDisciplina());
        preparedStatement.executeUpdate();
        System.out.println("Professor cadastrado");

        connection.close();
        preparedStatement.close();
    }

    public void listarTodos() throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM professor";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("========================" + "\nId: " + resultSet.getInt("id") + "\nNome: " + resultSet.getString("nome") + "\nDisciplina: " + resultSet.getString("disciplina") + "\n ");
        }

        connection.close();
        resultSet.close();
        preparedStatement.close();
    }

    public void buscarPorNome(String nome) throws SQLException{
        connection = DatabaseConnector.connectionWithDatabase();
        String sql = "SELECT * FROM professor WHERE nome = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nome);
        ResultSet resultSet = preparedStatement.executeQuery();


        if (resultSet.next()) {
            // Se existirem resultados, obtenha os dados
            System.out.println("Id: " + resultSet.getInt("id") + "\nNome: " + resultSet.getString("nome") + "\nDisciplina: " + resultSet.getString("disciplina"));
        } else {
            // Caso contrário, imprima uma mensagem informando que não há resultados
            System.out.println("Nenhum resultado encontrado para o NOME: " + nome);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
