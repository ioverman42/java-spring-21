<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<c:import url="/head-tag.jsp"/>


<body>

<c:import url="navbar.jsp" />

<c:import url="header.jsp" />

<div id="unit2" class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <!-- MAIN CONTENT HERE   -->
        <h2>Add New Employee</h2>

        <c:if test="${!empty sessionScope.project4AddMessage}">
            <h3>${sessionScope.project4AddMessage}</h3>
            <% session.removeAttribute("project4AddMessage"); %>
        </c:if>

        <form action="addNewEmployee" method="post">
            <label for="firstName">First name:</label><br>
            <input type="text" id="firstName" name="firstName" required><br>

            <label for="lastName">Last name:</label><br>
            <input type="text" id="lastName" name="lastName" required><br>

            <label for="ssn">Social security number:</label><br>
            <input type="text" id="ssn" name="ssn" required><br>

            <label for="department">Department:</label><br>
            <input type="text" id="department" name="department" required><br>

            <label for="roomNumber">Room number:</label><br>
            <input type="text" id="roomNumber" name="roomNumber" required><br>

            <label for="phone">Phone number:</label><br>
            <input type="text" id="phone" name="phone" required><br><br>

            <input type="submit" value="Submit">
        </form>

    </div>
</div>

<c:import url="footer.jsp" />

</body>
</html>
