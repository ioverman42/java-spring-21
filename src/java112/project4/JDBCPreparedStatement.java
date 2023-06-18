package java112.project4;

import java.io.*;
import java.sql.*;

/**
 *
 * @author iaoverman
 */
public class JDBCPreparedStatement {
    /**
     * [main description]
     * @param args command line args
     */
     public static void main(String[] args) {
         JDBCPreparedStatement employee = new JDBCPreparedStatement();

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
     */
    public void run(String firstName, String lastName, String ssn, String dept, String room, String phone) {
        Connection connection = null;
        Statement statement = null;

        String addEmployeeUpdate = "INSERT INTO employees (first_name, last_name, "
                + "ssn, dept, room, phone) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/student",
                    "student", "student");

            statement = connection.createStatement();

            PreparedStatement addEmployee = connection.prepareStatement(addEmployeeUpdate);

            addEmployee.setString(1, firstName);
            addEmployee.setString(2, lastName);
            addEmployee.setString(3, ssn);
            addEmployee.setString(4, dept);
            addEmployee.setString(5, room);
            addEmployee.setString(6, phone);

            int rowsAffected = addEmployee.executeUpdate();

            System.out.println("queryString: " + addEmployee);

            System.out.println("Rows affected: " + rowsAffected);

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
