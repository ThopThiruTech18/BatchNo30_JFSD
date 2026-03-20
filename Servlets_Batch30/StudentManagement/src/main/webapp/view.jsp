<%@ page import="java.util.List" %>
<%@ page import="in.thiru.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>
</head>
<body>

<h2>Student List</h2>

<table border="1" cellpadding="10">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Course</th>
    <th>Actions</th>
</tr>

<%
    List<Student> list = (List<Student>) request.getAttribute("studentList");

    if(list != null){
        for(Student s : list){
%>

<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getEmail() %></td>
    <td><%= s.getCourse() %></td>
    <td>
        <a href="edit?id=<%= s.getId() %>">Edit</a> |
        <a href="delete?id=<%= s.getId() %>">Delete</a>
    </td>
</tr>

<%
        }
    }
%>

</table>

<br>
<a href="add.jsp">Add New Student</a>

</body>
</html>
