<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>
    Employee, you are welcome!
</h2>

<br>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your grade: ${employee.yearsOfExperience}
<br>
Your favourite car: ${employee.carBrand}
<br>
Your languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
                ${lang}
        </li>
    </c:forEach>
</ul>
<br>
Your phone number: ${employee.phoneNumber}
<br>

</body>

</html>