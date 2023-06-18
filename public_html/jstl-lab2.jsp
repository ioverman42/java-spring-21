<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <c:forEach var="dinosaur" items="${dinosaurList}">
            <li>${dinosaur}</li>
        </c:forEach>
    </body>
</html>
