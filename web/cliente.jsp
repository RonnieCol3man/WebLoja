<%-- 
    Document   : cliente
    Created on : 12/09/2017, 11:34:43
    Author     : 31614957
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Client area</h1>
        <h2>Hello, ${user.username}</h2>
        <table>
            <thead>
                <tr>
                    <th>IMAGEM</th>
                    <th>NOME</th>
                    <th>DESCRIÇÃO</th>
                    <th>PREÇO</th>
                </tr>
            </thead>
            <tbody>
                <tr onclick="location.href = 'https://www.bestgamers.com.br/razer-kraken-7-1-chroma';">
                    <td><img src="images/razer.jpeg"</td>
                    <td>Fone de Ouvido Razer</td>
                    <td>Fone de ouvido Gamer</td>
                    <td>R$495,00</td>
                </tr>
                <tr onclick="location.href = 'https://www.fastshop.com.br/loja/tv-e-video/fone-de-ouvido-bluetooth-jbl-in-preto-e25bt-fast';">
                    <td><img src="images/jbl.jpg"</td>
                    <td>Fone de Ouvido JBL</td>
                    <td>Fone de ouvido de alta qualidade sonora</td>
                    <td>R$218,94</td>
                </tr>
            </tbody>
        </table>
        <br><br>
    </body>
</html>
