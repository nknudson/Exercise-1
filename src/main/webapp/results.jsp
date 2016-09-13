<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="head.jsp"%>


<html><body>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <%--${users}--%>

    <table width= 100%; border= 15px solid grey>
        <tr>
            <th>User ID</th>
        <th>First Name</th>
        <th>Last Name</th>
       <%-- <th>Date of Birth</th> --%>
            <th>Age</th>
        </tr>
        <tr>
            <td>${user[0].userid}</td>
            <td>${user[0].firstName}</td>
            <td>${user[0].lastName}</td>
           <%-- <td>${user[0].dateOfBirth}</td>--%>
            <td>${user[0].age}</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
              <td>${user.userid}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
               <%-- <td>${user.dateOfBirth}</td> --%>
                <td>${user.age}</td>

            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
