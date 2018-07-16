<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!---->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	--> 
	
	<script src="http://upcdn.b0.upaiyun.com/libs/jquery/jquery-2.0.2.min.js">
	</script>
	<script>
		$(document).ready(function(){
        $("#p1").click(function(){
          	var sid = $("#sid").val();
            $.post("/MysqlTset/search",
            	    {
            	        id: sid
            	    },
            	        function(data,status){
            	        //alert("数据: \n" + data + "\n状态: " + status);
            	        $("#result").text(data);
            	    });
        });
       

    });
	</script>
  </head>
  
  <body>
  输入学号<input type="text" id="sid">
  <button id="p1">查询</button>
  <h3>结果</h3>
  <h3 id = "result"> </h3>
  </body>
</html>
