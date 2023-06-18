/*
import java.util.*;

public class SimpleBean {
    private String name;
    private Integer count;
    private List notes;

    public SimpleBean {
        name = "New Name";
        notes = new ArrayList();
    }
        // Getters and Setters not shown
       ...
}

1. Set and display the name property
2. Display and set the count property
3. Display the elements in the notes property as an HTML ordered list
4. Remove the JavaBean from the session

 */

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="name" value="Angelica" />
<h1>${name}</h1>

<h1>${count}</h1>
<c:set var="count" value="${count + 1}" />

<ol>
    <c:forEach var="note" items="${notes}">
        <li>${note}</li>
    </c:forEach>
</ol>

<% session.removeAttribute("SimpleBean"); %>
