<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>


<h2>Sensor Table</h2>
<br>


<table>
    <tr>
        <th>Name</th>
        <th>Model</th>
        <th>Type</th>
        <th>Ranges</th>
        <th>Unit</th>
        <th>location</th>
    </tr>

    <c:forEach var="snr" items="${allSnr}">
<c:url var="updateButton" value="/updateInfo">
<c:param name="snId" value="${snr.id}"></c:param>
</c:url>
        <c:url var="deleteButton" value="/deleteSensor">
        <c:param name="snId" value="${snr.id}"></c:param>
        </c:url>

        <tr>
            <td>${snr.name}</td>
            <td>${snr.model}</td>
            <td>${snr.type}</td>
            <td>${snr.ranges}</td>
            <td>${snr.unit}</td>
            <td>${snr.location}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'">
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<input type="button" value="Add"
onclick="window.location.href='addNewSensor'">


</body>
</html>