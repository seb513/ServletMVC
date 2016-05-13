<%-- 
    Document   : contact
    Created on : Feb 24, 2016, 10:58:09 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="row">
        <div class="col-xs-4">
            <form action="" method="post">
            <div class="form-group">
             <label for="exampleInputEmail1">First Name</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="first_name" required="required" placeholder="Name"/>
            </div>
            
          
            <div>
                <label>Last Name</label>
                <input type="text" name="last_name" required="required" placeholder="Enter the last name"/>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" required="required" placeholder="Enter the email"/>
            </div>
            <div>
                <label>Subject</label>
                <input type="text" name="subject" required="required" placeholder="Enter the subject"/>
            </div>
            <div>
                <label>Message</label>
                <textarea name="message" required="required" ></textarea>
            </div>
            <button name="submit" type="submit">Send</button>
        </form>
        </div>
        </div>
        </body>
</html>