<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<c:set var="name" value="Fred" />
<html>
  <head>
    <title>Demo</title>
  </head>
  <body>
    <p>
      Hi, ${name}!
    </p>

    <c:forEach var="flower" items="${flowersList}">
        <li>${flower}</li>
    </c:forEach>

  </body>
</html>
