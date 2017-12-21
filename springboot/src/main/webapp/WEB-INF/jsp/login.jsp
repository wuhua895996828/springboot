<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login page</h1>
	<form action="">
		<input type="text" name="username" id="username" /><br /> <input
			type="text" name="password" id="password" /><br /> <input
			type="button" value="submit" id="submitBtn" />
	</form>
</body>
<script src="/js/jquery-3.2.1.min.js"></script>
<script>
	$(function() {
		$("#submitBtn").click(function() {
			$.ajax({
				type : "POST",
				url : "/login",
				data : {
					username : $("#username").val(),
					password : $("#password").val()
				},
				dataType : "json",
				success : function(data) {
					if (data.code == 0) {
						location.href = "/success";
					} else {
						alert("error");
					}
				}
			});
		})
	})
</script>
</html>