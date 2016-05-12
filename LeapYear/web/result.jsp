<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 16/5/12
  Time: 上午11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>结果</title>
</head>
<%
    Boolean flagStr = (Boolean)request.getAttribute("flag");
    String year = request.getParameter("year");
    pageContext.setAttribute("flag", flagStr);
%>
<body>

<c:if test="${flag}"><%=year%>年是闰年</c:if>
<c:if test="${!flag}"><%=year%>年不是闰年</c:if>
</body>
</html>
