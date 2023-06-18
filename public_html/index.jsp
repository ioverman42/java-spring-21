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
            <h1>Unit 2 Links</h1>
            <ul class="w3-padding-32">
                <li>Project 2 Links</li>
                <li> <a href="/java112/properties">Analyzer Project Properties</a> </li>
                <li> <a href="/java112/first">First 112 Servlet</a> </li>
            </ul>

            <ul class="w3-text-grey">
                <li>Unit 2 Work Links</li>
                <li> <a href="/java112/trivial">Right way to link</a> </li>
                <li> <a href="linkingDemo.html">Linking Demo</a> </li>
                <li> <a href="/java112/lab5">Lab 5</a> </li>
                <li> <a href="#"></a> </li>
            </ul>
        </div>

        <div class="w3-third w3-center">
        <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
        </div>
    </div>
</div>

<!-- Second Grid -->
<div id="unit3" class="w3-row-padding w3-light-grey w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-third w3-center">
      <i class="fa fa-coffee w3-padding-64 w3-text-red w3-margin-right"></i>
    </div>

    <div class="w3-twothird">
        <h1>Unit 3 Links</h1>
        <ul class="w3-padding-32">
            <li>Project 3 Links</li>
            <li> <a href="#"></a> </li>
            <li> <a href="#"></a> </li>
        </ul>

        <ul class="w3-text-grey">
            <li>Unit 3 Work Links</li>
            <li> <a href="/java112/firstJSP">My First JSP</a> </li>
            <li> <a href="/java112/httpreqdemo">HTTP Request Demo</a> </li>
            <li> <a href="/java112/httpreqdemo2">HTTP Request Demo 2</a> </li>
            <li> <a href="/java112/Lab32">Lab 3-2</a> </li>
            <li> <a href="/java112/Lab33">Lab 33 Servlet</a> </li>
            <li> <a href="/java112/TeamScripting.jsp">Team Scripting Exercise - Expressions</a> </li>
            <li> <a href="/java112/forward-demo">Forwarding Demo</a> </li>
            <li> <a href="/java112/redirect-demo">Redirection Demo</a> </li>
            <li> <a href="/java112/mvc-demo">MVC Demo</a>  </li>
        </ul>
    </div>
  </div>
</div>

<!-- Third Grid -->
<div id="unit4" class="w3-row-padding w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-twothird">
      <h1>Unit 4 Links</h1>

      <ul class="w3-padding-32">
          <li>Project 4 Links</li>
          <li> <a href="/java112/search-display">Employee Search</a> </li>
          <li> <a href="/java112/add-display">Employee Add</a> </li>
          
      </ul>

      <ul class="w3-text-grey">
          <li>Unit 4 Work Links</li>
          <li> <a href="/java112/jstlLab">JSTL Lab</a> </li>
          <li> <a href="/java112/sessionGettingAttribute.jsp">Getting Session Attribute JSP</a> </li>
          <li> <a href="/java112/getting-session-attribute">Getting Session Attribute Servlet</a> </li>
          <li> <a href="/java112/session-counter">Session Counter Lab</a> </li>
    </div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
    </div>
  </div>
</div>



<c:import url="footer.jsp" />

</body>
</html>
