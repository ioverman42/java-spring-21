package java112.project4;

import java.io.*;
import java.sql.*;

/**
 * @author iaoverman
 */
public class JDBCInsertEmployee {
    /**
     * main program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        JDBCInsertEmployee employee = new JDBCInsertEmployee();

        String firstName = args[0];
        String lastName = args[1];
        String ssn = args[2];
        String dept = args[3];
        String room = args[4];
        String phone = args[5];

        employee.run(firstName, lastName, ssn, dept, room, phone);
    }

    /**
     * [run description]
     * @param firstName [description]
     * @param lastName  [description]
     * @param ssn       [description]
     * @param dept      [description]
     * @param room      [description]
     * @param phone     [description]
     */
    public void run(String firstName, String lastName, String ssn, String dept, String room, String phone) {
        Connection connection = null;
        Statement statement = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/student",
                    "student", "student");

            statement = connection.createStatement();

            String queryString = "INSERT INTO employees (first_name, last_name, ssn, dept, room, phone) VALUES ("
                    + "'" + firstName + "', '" + lastName + "', '" + ssn + "', '" + dept + "', '"
                    + room + "', '" + phone + "')";

            System.out.println("queryString: " + queryString);

            int rowsAffected = statement.executeUpdate(queryString);

        } catch (ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
