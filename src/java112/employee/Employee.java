package java112.employee;

/**
 * Represents an employee.
 * @author iaoverman
 */
public class Employee {

    /** Id of employee */
    private String employeeId;

    /** First name of employee  */
    private String firstName;

    /** Last name of employee  */
    private String lastName;

    /** Social security number of employee  */
    private String ssn;

    /** Department of employee  */
    private String department;

    /** Phone number of employee  */
    private String phone;

    /** Room number of employee  */
    private String roomNumber;

    /**
     * Getter for employee id
     * @return employee id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Setter for employee id
     * @param employeeId employee id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Getter for employee's first name
     * @return first name of employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for employee's first name
     * @param firstName first name of employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter of employee's last name
     * @return last name of employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for employee's last name
     * @param lastName last name of employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for employee's social security number
     * @return ssn of employee
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Setter for employee's social security number
     * @param ssn ssn of employee
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Getter for employee's department
     * @return department of emplopyee
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter for employee's department
     * @param department department of employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter for employee's phone number
     * @return phone number of employee
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for employee's phone number
     * @param phone phone number of employee
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Getter for employee's room number
     * @return room number of employee
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Setter for employee's room number
     * @param roomNumber room nuber of employee
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Returns employee details
     * @return employee's name, ssn, dept, phone, and room.
     */
    public String toString() {
        return "Employee \nname: " + firstName + " " + lastName +
                "\nssn: " + ssn +
                "\ndepartment: " + department +
                "\nphone: " + phone +
                "\nroom: " + roomNumber + "\n";
    }
}
