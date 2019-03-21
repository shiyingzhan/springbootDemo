<html>  
<title>hello</title>
<body>
  用户列表：
  <#list userList as user>
  	<div>id:${user.id}</div>
  	<div>name:${user.name}</div>
  	<div>age:${user.age}</div>
  </#list>
</body>  
</html> 