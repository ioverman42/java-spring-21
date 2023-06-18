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
        <form action="results" method="GET">
            <label for="searchTerm">Search Term:</label>
            <input type="text" id="searchTerm" name="searchTerm"><br>

            <input type="radio" id="id" name="searchType" value="id">
            <label for="id">ID</label><br />

            <input type="radio" id="firstName" name="searchType" value="firstName">
            <label for="firstName">First Name</label><br />

            <input type="radio" id="lastName" name="searchType" value="lastName">
            <label for="lastName">Last Name</label><br />

            <br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</div>

<c:import url="footer.jsp" />

</body>
</html>
