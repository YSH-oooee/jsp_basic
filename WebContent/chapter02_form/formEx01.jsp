<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 기초1</title>
<script>
	function sendData() {
		document.f.submit();	//submit()메서드를 통해서 전송한다.
	}
</script>
</head>
<body>

	<form method="post" action="formEx01Pro.jsp" name="f">	<!-- action속성에 데이터를 전송할 페이지를 작성한다. -->
		<fieldset>
			<!-- form태그 안에 있는 name속성 값이 서버로 전송된다. -->
			<p><label> 좋아하는 언어 : <input type="text" name="language"></label></p>
			<p><label> 좋아하는 이유 : </label><textarea name="reason"></textarea></p>
			<p><label> 나이 : <input type="text" name="age"></label></p>
			
			<!-- 방법1) submit 타입을 이용하여 데이터를 전송한다. (가장 일반적으로 사용되는 방법) -->
			<input type="submit" value="입력완료">
			
			<!-- 방법2) 자바스크립트를 이용하여 전송한다. (form태그의 name값이 설정되어있어야만 한다.) -->
			<input type="button" value="입력완료" onclick="sendData()">
		</fieldset>
	</form>
</body>
</html>