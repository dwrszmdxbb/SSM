<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="content">
    <h2>产品列表</h2>
    <table border="1">
        <tr>
            <td>产品名称</td>
            <td>产品描述</td>
            <td>类别</td>
            <td>状态</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${productList}" var="product" varStatus="status" >
            <tr>
                <td>${product.productname}</td>
                <td>${product.descs}</td>
                <td>${product.name}</td>
                <c:if test="${product.statusIn==1}">
                    <td>可用</td>
                </c:if>
                <c:if test="${product.statusIn!=1}">
                    <td>不可用</td>
                </c:if>
                <td><a href="delProduct?id=${product.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <a>第 ${currentPageNo }/${totalPageCount}页</a>
    <div class="page">
        <c:if test="${pages.currentPageNo > 1}">
            <a href="proInList">首页</a>
            <a href="proInList?pageIndex=${pages.currentPageNo-1}">上一页</a>
        </c:if>
        <c:if test="${pages.currentPageNo <pages.totalPageCount}">
            <a href="proInList?pageIndex=${pages.currentPageNo+1 }">下一页</a>
            <a href="proInList?pageIndex=${pages.totalPageCount}">最后一页</a>
        </c:if>
    </div>
    <a href="addProduct">新增</a>
</div>
</body>
</html>
