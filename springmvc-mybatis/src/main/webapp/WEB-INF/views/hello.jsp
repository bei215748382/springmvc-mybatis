<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
hello , <input type="text" value="${name}"/>;
<form action="hello.do" method="post" >
name:<input type="text" name="name"/>
role:<input type="text" name="roleId"/>
<br/>
<button>submit</button>
</form>
</body>
</html>