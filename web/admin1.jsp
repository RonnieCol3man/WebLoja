<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update Products</h1>
        <h2>Hello, ${user.nome}</h2>
        <br>
         <div class="container">
            <div class="row">
                <div class="form">

            <legend>UPDATE PRODUCT</legend>
            <form action="FrontController" method="POST">
                <input type="hidden" name="control" value="ProdutoController.create">
                <p>
                    <label for="nomeID">Name:</label><br>
                    <input type="text" name="nome" id="nomeID"/>
                </p>
                <p>
                    <label for="preco">Price:</label><br>
                    <input type="text" name="price" id="preco"/>
                </p>
                <p>
                    <label for="regiao">Region:</label><br>
                    <input type="text" name="region" id="regiao"/>
                </p>
                <p>
                    <label for="cod_Produto">Product code:</label><br>
                    <input type="text" name="cod" id="cod_Produto"/>
                </p>
                <p>
                    <input type="submit" value="UPDATE"/>
                </p>
            </form>
            
            <legend>ADD PRODUCT</legend>
            <form action="FrontController" method="POST">
                <input type="hidden" name="control" value="ProdutoController.create">
                <p>
                    <label for="nomeID">Name:</label><br>
                    <input type="text" name="nome" id="nomeID"/>
                </p>
                <p>
                    <label for="preco">Price:</label><br>
                    <input type="text" name="price" id="preco"/>
                </p>
                <p>
                    <label for="regiao">Region:</label><br>
                    <input type="text" name="region" id="regiao"/>
                <p>
                    <label for="cod_Produto">Product code:</label><br>
                    <input type="text" name="cod" id="cod_Produto"/>
                </p>
                </p>
                    <input type="submit" value="CREATE"/>
                </p>
            </form>

    </body>
</html>
