<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>body1</title>
</head>
</head>
<body>
	
	<%
		String sampleData1 = request.getParameter("sampleData1");
	%>
	
	<h1 align="center">화면 본문에서 보여질 페이지 예시2</h1>
	<h3>전달된 데이터 : <%=sampleData1 %></h3>
	
</body>
</html>