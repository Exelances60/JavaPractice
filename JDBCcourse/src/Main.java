import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/demo";
            String uname = "postgres";
            String pass = "karizma34";
            String query = "SELECT * FROM student";
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);



            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getString("sid"));
                System.out.println("Name: " + resultSet.getString("sname"));
                System.out.println("Marks: " + resultSet.getString("marks"));
            }
            System.out.println("Connected to the PostgreSQL server successfully.");
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}