<%-- below is page directive used to imports and set content type --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- comment --%>

<html>
<head>

    <title>Welcome</title>
</head>
<body>
    <h1>Welcome to JSP Tags</h1>
        <%! int age= 22; %>
        <%! private void incrementAge(){
        age++;
        }%>

        <%= "age and incrementAge() was declared inside class using declaration tage :"+age +" \n"%>

    <%  out.println("this is written using scriplets to write java code that goes inside service method "+" \n");
       incrementAge();
       out.println("age was incremented inside service method :"+age+" \n");

     %>
    <%= "this is written using expression date:"+new java.util.Date()+" \n" %>

</body>
</html>
