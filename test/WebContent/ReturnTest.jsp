<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- パッケージのインポートは下の --%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>
<% String str = (String) request.getAttribute("returnValue"); %>
<h1><%=str %></h1>
<form name="testform" method="POST" action="test">
<input type="text"  name="textValue" value="もう一度何か入れますか？"/>
<input type="submit" name="submit_button" value="送信"/>
</form>
</body>
</html>