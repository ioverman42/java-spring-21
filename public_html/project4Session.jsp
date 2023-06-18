<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<c:import url="/head-tag.jsp"/>

<body>

<c:import url="navbar.jsp" />

<c:import url="header.jsp" />

<!-- First Grid -->
<div id="unit2" class="w3-row-padding w3-padding-64 w3-container">
    <div class="w3-content">
        <div class="w3-twothird">
            <h2>Session Count: ${project4SessionCounter}</h2>
        </div>

        <div class="w3-third w3-center">
        <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
        </div>
    </div>
</div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
    </div>
  </div>
</div>



<c:import url="footer.jsp" />

</body>
</html>
