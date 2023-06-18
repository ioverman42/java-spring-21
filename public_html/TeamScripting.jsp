<html>
  <head>
    <title>Expressions - Isabel</title>
  </head>

  <body>
    <h2>Concept Name</h2>
        Expressions<br />
    <h2>Description</h2>
        Expressions are bits of Java code in a JSP that are evaluated,
        the output of which is translated into a string and output on the page.
        <br />
    <h2>Syntax</h2>
        The symbols <\%= and %> are placed before and after respectively
        of the Java code you want executed. <br /><br />
        <b><\%= new java.util.Date() %></b>
        <br /><br />
        Note the lack of semicolon at the end of the expression.<br />
    <h2>Example</h2>
        <%= new java.util.Date() %>
        <br />
    <h2>JSP Translator</h2>
        Here's how the JSP Translator handles expressions...<br />
        <img src="images/javatranslation.png" />
        <br />
    <h2>Best Practices</h2>
        Expressions are best for inserting small, usually dynamic, snippets
        of code into your page.<br />
    <h2>Drawbacks</h2>
        Expressions are not for longer, more complex pieces of code. <br />

  </body>
</html>
