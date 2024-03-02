
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../../common/admin.jsp" %>
<html>
<head>
    <title>Product List</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<body>
<div class="container">

    <div class="container">
        <h1 class="mt-5">Product Details</h1>
        <div class="card mt-3">
            <div class="card-body">
                <h5 class="card-title">ID: ${product.id}</h5>
                <p class="card-text">Name: ${product.prodName}</p>
                <p class="card-text">Description: ${product.description}</p>
                <p class="card-text">Date Of Manf: ${product.dateOfManf}</p>
                <p class="card-text">Price: ${product.price}</p>
            </div>
        </div>

        <h1 class="mt-5">List Sale</h1>
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Salesman Id</th>
                <th scope="col">Salesman Name</th>
                <th scope="col">DOS</th>
                <th scope="col" style="width: 20%;">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${saleList}">
                <tr>
                    <th scope="row">${item.id}</th>
                    <td>${item.salesmanId}</td>
                    <td>${item.salesmanName}</td>
                    <td>${item.dos}</td>
                    <td>
                        <div class="flex-content">
                            <a href="" class="btn btn-outline-primary">Detail</a>
                            <a href="" class="btn btn-outline-warning">Edit</a>
                            <a href="" class="btn btn-outline-danger">Delete</a>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <div class="mt-3 mb-3">
            <a href="/products" class="btn btn-outline-primary">Back to list</a>
        </div>
    </div>
</div>
</body>
</html>
