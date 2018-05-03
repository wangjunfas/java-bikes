<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success</title>
</head>
<body>
	<div>
		欢迎您，<s:property value="username" />
		  <s:if test="%{gender==1}">
		      <span>先生</span>
		  </s:if>
		  <s:else>
		      <span>女士</span>
		  </s:else>
	</div>
	<div>
		<ul>
			 <s:iterator value="courses">
			   <li><s:property /></li>
			 </s:iterator>
		</ul>
		<ul>
			<s:iterator value="books">
			   <li><s:property /></li>
			 </s:iterator>
		</ul>
	</div>
</body>
</html>