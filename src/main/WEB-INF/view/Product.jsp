<%@ page language="java" contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>products list</title>
    </head>

    <body>
        <h1>Products list</h1>

        <ul>
            <c:forEach var="product" items="${products}">
                <li>Id : ${product.id}; Title : ${product.title}; Price : ${product.price}</li>
            </c:forEach>
        </ul>

    </body>
</html>