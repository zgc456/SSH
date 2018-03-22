<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/21
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:iterator id="list" value="#session.list">
   <s:property value="#list.answercount"></s:property>
</s:iterator>

</body>
</html>
