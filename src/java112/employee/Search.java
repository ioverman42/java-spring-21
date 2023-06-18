package java112.employee;

import java.util.*;

/**
 *
 * @author iaoverman
 */
public class Search {
    /** search type eg. search by last name */
    private String searchType;

    /** search term */
    private String searchTerm;

    /** list of results of employees */
    private ArrayList resultsList;

    /** whether or not any employees were found as a result of the search */
    private Boolean employeesFound;

    /**
     * No arguments constructor for search
     */
    public Search() {

    }

    /**
     * Getter for search type
     * @return search type
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Setter for search type
     * @param searchType searchType
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    /**
     * Getter for search term
     * @return search term
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * Setter for search term
     * @param searchTerm search term
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * Getter for array list of results
     * @return results array list
     */
    public ArrayList getResultsList() {
        return resultsList;
    }

    /**
     * Setter for array list of results;
     * @param resultsList results array list
     */
    public void setResultsList(ArrayList resultsList) {
        this.resultsList = resultsList;
    }

    /**
     * Getter for whether employees were found
     * @return whether employees were found boolean
     */
    public Boolean getEmployeesFound() {
        return employeesFound;
    }

    /**
     * Setter for whether employees were found
     * @param employeesFound whether employees were found boolean
     */
    public void setEmployeesFound(Boolean employeesFound) {
        this.employeesFound = employeesFound;
    }

    /**
     * Adds found employee to results array list
     * @param employee employee matching search
     */
    public void addFoundEmployee(Employee employee) {
        resultsList.add(employee);
    }
}
