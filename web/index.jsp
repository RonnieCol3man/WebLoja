<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style><%@include file="/WEB-INF/style.css"%></style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
        <div class="container">
            <div class="row">
                <div class="form-register">
                    <h4>Register Client</h4>
                    <form action="FrontController" method="POST">
                        <input type="hidden" name="control" value="ClienteController.register">
                        <p>
                            <label for="nameID">Full name:</label><br>
                            <input type="text" name="nome" id="nameID"/>
                        </p>
                        <p>
                            <label for="addressID">Address:</label><br>
                            <input type="text" name="address" id="addressID"/>
                        </p>
                        <p>
                            <label for="telID">Tel:</label><br>
                            <input type="text" name="tel" id="telID"/>
                        </p>
                        <p>
                            <label for="usernameID">Username:</label><br>
                            <input type="text" name="username" id="usernameID"/>
                        </p>
                        <p>
                            <label for="pwdID">Password:</label><br>
                            <input type="password" name="password" id="pwdID"/>
                        </p>
                        <p>
                            <label for="pwd2ID">Confirm Password:</label><br>
                            <input type="password" name="password2" id="pwd2ID"/>
                        </p>
                        <p>
                            <input type="submit" value="REGISTER" class="submit"/>
                        </p>
                    </form>
                </div>
                <br>
                <div class="form">
                    <h4>Login Cliente</h4>
                    <form action="FrontController" method="POST">
                        <input type="hidden" name="control" value="ClienteController.login">
                        <p>
                            <label for="usernameID">Username:</label><br>
                            <input type="text" name="username" id="usernameID"/>
                        </p>
                        <p>
                            <label for="pwdID">Password:</label><br>
                            <input type="password" name="password" id="pwdID"/>
                        </p>
                        <p>
                            <input type="submit" value="LOGIN" class="submit"/>
                        </p>
                    </form>
                <br>

                    <h4>Login Admin</h4>
                    <form action="FrontController" method="POST">
                        <input type="hidden" name="control" value="Admin1Controller.login">
                        <p>
                            <label for="usernameID">Username:</label><br>
                            <input type="text" name="username" id="usernameID"/>
                        </p>
                        <p>
                            <label for="pwdID">Password:</label><br>
                            <input type="password" name="password" id="pwdID"/>
                        </p>
                        <p>
                            <input type="submit" value="LOGIN" class="submit"/>
                        </p>
                    </form>
                </div>
            </div>
    </body>
</html>
