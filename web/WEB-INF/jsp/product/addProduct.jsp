<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 超级无敌小段段
  Date: 2019/10/15
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .ff{
            width: 350px;
            height: 200px;
            margin: 0px auto;
        }
    </style>
</head>
<body>
<div class="ff">
    <form action="addSave" method="post">
    <h2>新增产品信息</h2>
    <table border="1">
        <tr><td>产品名称：</td><td><input type="text" name="productname"></td></tr>
        <tr rowspan="3"><td >产品描述：</td><td><textarea name="descs"></textarea></td></tr>
        <tr><td>商品类别：</td>
            <td>
            <select name="cid">
                <option>-请选择-</option>
                <c:forEach items="${infoList}" var="info" varStatus="status">
                    <option value="${info.id}">${info.name}</option>
                </c:forEach>
            </select>
            </td>
        </tr>
        <tr><td>状态：</td><td><input type="checkbox" value="1" name="statusIn"></td></tr>
        <tr><td></td><td><input type="submit" value="提交"></td></tr>
    </table>
</form>
</div>
</body>
</html>
