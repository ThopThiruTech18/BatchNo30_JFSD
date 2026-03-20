<%@ page import="in.thiru.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>

<%
    Student s = (Student) request.getAttribute("student");
%>

<h2>Edit Student</h2>

<form action="update" method="post">

    <input type="hidden" name="id" value="<%= s.getId() %>">

    Name:<br>
    <input type="text" name="name" value="<%= s.getName() %>" required><br><br>

    Email:<br>
    <input type="email" name="email" value="<%= s.getEmail() %>" required><br><br>

    Course:<br>
    <input type="text" name="course" value="<%= s.getCourse() %>" required><br><br>

    <input type="submit" value="Update Student">

</form>

<br>
<a href="view">Back to List</a>

</body>
</html>
