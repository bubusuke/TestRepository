<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>
<%-- formタブでmethodはPOST固定。actionはweb.xmlのurl_patternに紐付く --%>
<form name="testform" method="POST" action="test">

<input type="text"  name="textValue" value="ここに何か入れてください"/>
<input type="submit" name="submit_button" value="送信"/>
</form>
</body>
</html>