<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>AllEmployees</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Sername</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">

<tr>
    <td>${emp.name}</td>
    <td>${emp.surname}</td>
    <td>${emp.department}</td>
    <td>${emp.salary}</td>

</tr>
    </c:forEach>
</table>


</body>
</html>