<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Insert title here</title>
   </head>
   <body>
      <h1>Login</h1>
     
      <form action = "registration">
      <table>
         <tr>
            <td>UserId:</td>
            <td><input type ='text' name = 'userId' value = ''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type ='password' name = 'password'/></td>
         </tr>
         
         <tr>
            <td>First Name:</td>
            <td><input type ='text' name = 'firstName'/></td>
         </tr>
         
         <tr>
            <td>Last Name:</td>
            <td><input type ='text' name = 'lastName'/></td>
         </tr>
         
          <tr>
            <td>Email:</td>
            <td><input type ='text' name = 'email'/></td>
         </tr>
         
          <tr>
            <td>Date of Birth:</td>
            <td><input type ='text' name = 'dob'/></td>
         </tr>
         
           <tr>
           
            <td><input type = "submit"/></td>
         </tr>
      </table>
      </from>
   </body>
</html>