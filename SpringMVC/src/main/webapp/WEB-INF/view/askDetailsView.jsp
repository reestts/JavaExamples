<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>
    Enter your details:
</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/></form:select>
    <br>
    <br>
    Experience <form:select path="yearsOfExperience">
    <form:options items="${employee.experience}"/></form:select>
    <br>
    <br>
    Your favourite car?
    <br>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    <br>
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    <br>
    Mercedes <form:radiobutton path="carBrand" value="Mercedes"/>
    <br>
    <br>
    Languages what you know?
    <br>
    EN <form:checkbox path="languages" value="English"/>
    <br>
    FI <form:checkbox path="languages" value="Suomi"/>
    <br>
    SP <form:checkbox path="languages" value="Spanish"/>
    <br>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>

    <input type="submit" value="OK">

</form:form>

</body>

</html>