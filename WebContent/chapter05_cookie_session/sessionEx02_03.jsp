<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>다음 페이지</h2>
	
	<%
		request.setCharacterEncoding("utf-8");
	
		//세션객체는 반환 타입이 String이 아니므로 형변환하여 사용
		String id = (String)session.getAttribute("id");
		String passwd = (String)session.getAttribute("passwd");
	%>
	
	아이디 : <%= id %> <br>
	비밀번호 : <%= passwd %><br>

</body>
</html>