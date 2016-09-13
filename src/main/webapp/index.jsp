<%@include file="head.jsp"%>
<html>
<body>
<h2>User Display Exercise - Week 1</h2>
<a href = "searchUser">Go to the User Search</a>
<form  method="post" action="/searchUser">
    <table>
        <tr>
        <td>Search student by last name:</td>
        <td><input id="studentLastName" name="studentLastName" /></td>
            </tr>
        <tr>
        <td><input type="submit"  value="Submit" /></td>
        </tr>
    </table>



</form>



</body>
</html>
