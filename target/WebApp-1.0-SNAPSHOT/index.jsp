<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Aadhaar Details</title>
</head>
<body>
<form action="MyServlet" method="post">
    <table>
        <tr>
            <td> First Name</td>
            <td><input type="text" name="Firstname"></td>
        </tr>
        <tr>
            <td> Second Name</td>
            <td><input type="text" name="Secondname"></td>
        </tr>
        <tr>
            <td>Aadhaar No.</td>
            <td><input type="text" name="Aadhaar"></td>
        </tr>
        <tr>
            <td>Pan Number</td>
            <td><input type="text" name="Pan"></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit"
                       value="register"></td>
        </tr>
    </table>
</form>
</body>
</html>