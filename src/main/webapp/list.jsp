<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
<tr>
    <th>编号</th>
    <th>姓名</th>
    <th>密码</th>
</tr>

<c:forEach items="${users}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.password}</td>
    </tr>
</c:forEach>

</table>
