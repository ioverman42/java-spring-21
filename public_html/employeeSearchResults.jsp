<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Isabel's Advanced Java</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/myStyles.css">

        <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
        .w3-bar,h1,button {font-family: "Montserrat", sans-serif}
        .fa-anchor,.fa-coffee {font-size:200px}

        table,th,td {border: 1px solid black; border-collapse: collapse;}
        th {font-weight: bold;}
        </style>
    </head>


<body>

<c:import url="navbar.jsp" />

<c:import url="header.jsp" />

<div id="unit2" class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <!-- MAIN CONTENT HERE   -->
        <!--<h3>${searchResults.employeesFound}</h3>
        <h3>${searchResults.resultsList}</h3>-->
        <c:choose>
            <c:when test="${searchResults.employeesFound == true}">
                <table>
                    <tr>
                        <th>Employee ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>SSN</th>
                        <th>Department</th>
                        <th>Room</th>
                        <th>Phone</th>
                    </tr>

                    <c:forEach var="employee" items="${resultsList}">
                        <tr>
                            <td>${employee.employeeId}</td>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.ssn}</td>
                            <td>${employee.department}</td>
                            <td>${employee.roomNumber}</td>
                            <td>${employee.phone}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>

            <c:otherwise>
                <h3>No Employees matching your search were found.</h3>
            </c:otherwise>
        </c:choose>


    </div>
</div>

<c:import url="footer.jsp" />

</body>
</html>
