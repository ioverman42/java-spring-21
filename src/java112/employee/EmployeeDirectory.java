package java112.employee;

import java.io.*;
import java.util.*;
import java.sql.*;

/**
 * Main methods of the webapp. Searching for/adding new employees.
 * @author iaoverman
 */
public class EmployeeDirectory {

    /** properties instance variable */
    private Properties properties;

    /**
     * Empty constructor with properties param
     * @param properties properties
     */
    public EmployeeDirectory(Properties properties) {
        this.properties = properties;
        //System.out.println("PROPERTIES TEST EMPTY CONSTRUCTOR: " + properties.getProperty("driver")); //works
    }

    /**
     * Connect to the database
     * @return connection
     */
    private Connection connectToDatabase() {
        Connection connection = null;
        //System.out.println("PROPERTIES TEST CONNECTTODATABASE: " + properties.getProperty("driver")); //null pointer exception
        try {
            //System.out.println("PROPERTIES TEST CONNECTTODATABASE 2: " + properties.getProperty("driver"));
            Class.forName(properties.getProperty("driver"));

            connection = DriverManager.getConnection(properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
        } catch (ClassNotFoundException classNotFound) {
            System.out.println("Class not found exception");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println("SQL Exception");
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {

        }

        return connection;
    }

    /**
     * Add new employee to database
     * @param firstName  first name
     * @param lastName   last name
     * @param ssn        social security number
     * @param department department
     * @param phone      phone number
     * @param roomNumber room number
     */
    public void addNewEmployee(String firstName, String lastName, String ssn,
            String department, String roomNumber, String phone) {

        Statement statement = null;
        Connection connection = connectToDatabase();

        String queryString = "INSERT INTO employees (first_name, last_name, ssn, dept, room, phone) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            statement = connection.createStatement();

            PreparedStatement addStatement = connection.prepareStatement(queryString);

            addStatement.setString(1, firstName);
            addStatement.setString(2, lastName);
            addStatement.setString(3, ssn);
            addStatement.setString(4, department);
            addStatement.setString(5, roomNumber);
            addStatement.setString(6, phone);
            //for debugging
            System.out.println("queryString: " + addStatement);

            int rowsAffected = addStatement.executeUpdate();
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

    /**
     * Search databse for employee info using given term and type.
     * @param  searchTerm [description]
     * @param  searchType [description]
     * @return            [description]
     */
    public Search searchEmployeeDatabase(String searchTerm, String searchType) {

        Search searchResults = new Search();
        ArrayList<Employee> resultsArray = new ArrayList<>();
        searchResults.setResultsList(resultsArray);

        searchResults.setSearchTerm(searchTerm);
        searchResults.setSearchType(searchType);

        Connection connection = connectToDatabase();
        Statement statement = null;
        ResultSet resultSet = null;

        //String sqlSelect = "SELECT * FROM employees WHERE ? LIKE ?";
        String sqlSelect = getColumnTypeName(searchType);
        System.out.println("SQL with col name: " + sqlSelect);

        try {
            PreparedStatement selectStatement = connection.prepareStatement(sqlSelect);

            System.out.println("searchType: " + searchResults.getSearchType());

            //String column = getColumnTypeName(searchType);
            //System.out.println("column: " + column);

            String likeWhat = addPercents(searchTerm);
            System.out.println("like " + likeWhat);

            selectStatement.setString(1, likeWhat);

            //for debugging
            System.out.println("queryString: " + selectStatement);

            resultSet = selectStatement.executeQuery();
            System.out.println("Results: " + resultSet);

            //set boolean to true
            searchResults.setEmployeesFound(true);
            //if query doesn't return rows set boolean to false
            if (!resultSet.next()) {
                searchResults.setEmployeesFound(false);
            }
            resultSet.previous(); //resest to beginning of results list
            while (resultSet.next()) {
                Employee newEmployee = new Employee();

                newEmployee.setEmployeeId(resultSet.getString("emp_id"));
                newEmployee.setFirstName(resultSet.getString("first_name"));
                newEmployee.setLastName(resultSet.getString("last_name"));
                newEmployee.setSsn(resultSet.getString("ssn"));
                newEmployee.setDepartment(resultSet.getString("dept"));
                newEmployee.setRoomNumber(resultSet.getString("room"));
                newEmployee.setPhone(resultSet.getString("phone"));

                //for debugging
                newEmployee.toString();

                searchResults.addFoundEmployee(newEmployee);
                //System.out.println("employee: " + newEmployee.toString());
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

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


        //for debugging
        System.out.println("getEmployeesFound: " + searchResults.getEmployeesFound());

        //return Search results
        return searchResults;
    }

    /**
     * Generates SQL column based on search type and returns it
     * @param  searchType search type
     * @return            SQL statement
     */
    private String getColumnTypeName(String searchType) {
        String statement = "default";

        switch (searchType) {
            case "id" :
                statement = "SELECT * FROM employees WHERE emp_id LIKE ?";
                break;
            case "firstName" :
                statement = "SELECT * FROM employees WHERE first_name LIKE ?";
                break;
            case "lastName" :
                statement = "SELECT * FROM employees WHERE last_name LIKE ?";
                break;
        }

        return statement;
    }

    /**
     * Adds the % symbols around the search term
     * @param  searchTerm original search term
     * @return            new search term
     */
    private String addPercents(String searchTerm) {
        String newTerm = "%" + searchTerm + "%";

        return newTerm;
    }

    //private ArrayList parseResults(ResultSet results) {

    //}

}
