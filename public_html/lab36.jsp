<!DOCTYPE html>

<%!
    public void jspInit() {
        ServletConfig sConfig = getServletConfig();

        ServletContext sc = sConfig.getServletContext();

        sc.setAttribute("attrOne", "frog");
    }
%>

<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Lab 3-6</title>
    </head>
    <body>
        <p>
            My Attribute: <%= request.getServletContext().getAttribute("attrOne") %>
        </p>
        <p>
            Another My Attribute: <%= getServletConfig().getServletContext().getAttribute("attrOne") %>
        </p>
    

    </body>
</html>
