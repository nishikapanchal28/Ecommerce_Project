<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE </title>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
</head>
<body>
<h3>REGISTRATION PAGE</h3>
<form action="Myservlet" method="get">
<div class="container">
    <label><b>FIRST NAME</b></label>
<input type="text" name="firstname" required="true" pattern=".{20}" placeholder="enter first name ">
<label><b>LAST NAME</b></label>
<input type="text" name="lastname" required="true" pattern=".{20}" placeholder="enter last name ">

 <label><b>E-MAIL</b></label>
<input type="text" name="email" required="true" pattern=".{20}" placeholder="enter your email ">
<label><b>CREATE A PASSWORD</b></label>
<input type="password" name="password" required="true" pattern=".{5,10}" placeholder="password should 5-10 chars long">
 <label><b>CONFIRM PASSWORD</b></label>
<input type="password" name="password" required="true" pattern=".{5,10}" placeholder="password should 5-10 chars long">
 <label><b>MOBILE</b></label>
<input type="text" name="mobile" required="true" pattern="[7|8|9][0-9]{9}" placeholder="enter your 10 digit mobile number starts from 7/8/9">

<button type="submit">OK
</button>
</div>
</form>
</body>
</html>