<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee Info</h2>
<form:form action="saveSensor" modelAttribute="sensor">
 <form:hidden path="id"/>
   Name * <form:input path="name"/>
    <br><br>
    Model * <form:input path="model"/>
    <br><br>
    Type * <form:input path="type"/>
    <br><br>
    Unit * <form:input path="unit"/>
    <br><br>
    Ranges from <form:select path="ranges">
        <form:option value="-10" label="-10"/>
        <form:option value="-25" label="-25"/>
         <form:option value="-35" label="-35"/>
    <form:option value="10" label="10"/>
    <form:option value="25" label="25"/>
    <form:option value="35" label="35"/>
</form:select>

    <br><br>

    Location <form:input path="location"/>
    <br><br>
    Description <form:input path="description"/>
    <br><br>
 <input type="submit" value="OK"/>
</form:form>
</body>

</html>