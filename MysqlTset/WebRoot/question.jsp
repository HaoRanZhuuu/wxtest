<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'question.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script src="http://upcdn.b0.upaiyun.com/libs/jquery/jquery-2.0.2.min.js"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        #div-btn{
           text-align: center;
        }
        #btn-ans{
            text-align: center;
            width: 150px;
        }
    </style>
    <script type="text/javascript">
     $.ajaxSetup({  
     		async : false  
 			});
        $(document).ready(function(){
        $.post("/MysqlTset/question",
            	        function(data,status){
            	        	var d = eval('('+data+')');
        					var q1 = d.question1;
        					var q2 = d.question2;
        					var q3 = d.question3;
        					var q4 = d.question4;
        					
        					//alert(q1.question);
            	        //$("#result").text(data);
            	    
       //alert(q1.question);
        	    /////////////
        	    //var t = q1.question;
        	    var standard= "cccc";
        	    $("#t1").text(q1.question);
        		$("#a11").html(q1.opA);
        		$("#a12").html(q1.opB);
        		$("#a13").html(q1.opC);
        		$("#a14").html(q1.opD);
        		
        		$("#t2").text(q2.question);
        		$("#a21").html(q2.opA);
        		$("#a22").html(q2.opB);
        		$("#a23").html(q2.opC);
        		$("#a24").html(q2.opD);
        		
        		$("#t3").text(q3.question);
        		$("#a31").html(q3.opA);
        		$("#a32").html(q3.opB);
        		$("#a33").html(q3.opC);
        		$("#a34").html(q3.opD);
        		
        		$("#t4").text(q4.question);
        		$("#a41").html(q4.opA);
        		$("#a42").html(q4.opB);
        		$("#a43").html(q4.opC);
        		$("#a44").html(q4.opD);
        		
        		
        		  //alert("1")
        		  $("#btn-ans").click(function(){
        			var s1 = $("input[name=radiobutton1]:checked").val();
        			var s2 = $("input[name=radiobutton2]:checked").val();
        			var s3 = $("input[name=radiobutton3]:checked").val();
        			var s4 = $("input[name=radiobutton4]:checked").val();
        			var score = 0;
        			if(s1==q1.answer){
        			score += 25;
        			}
        			if(s2==q2.answer){
        			score += 25;
        			}
        			if(s3==q3.answer){
        			score += 25;
        			}
        			if(s4==q4.answer){
        			score += 25;
        			}
                alert("已交卷\n我的作答是:" + s1+s2+s3+s4 + "\n我的得分是: "+score+"分" +"\n正确答案为"+q1.answer+q2.answer+q3.answer+q4.answer+"\n谢谢");
                ////////
                
                $.post("/MysqlTset/search?id=1",
        		 function(data,status){
        		  alert(data);
        		 
        		 });
        		 
        		});
        		
        		
        		 
        	 
            });
        });
    </script>
    
  </head>
  
  <body>
  <div class="container">
<h3 align="center">第一题</h3>
<p id="t1"> 题目有待从数据库读取 </p>
    <input type="radio" name="radiobutton1" value="A" checked><span id="a11">选项有待从数据库读取</span><br>
    <input type="radio" name="radiobutton1" value="B"><span id="a12">法兰克王国</span><br>
    <input type="radio" name="radiobutton1" value="C"><span id="a13">拜占庭帝国</span><br>
    <input type="radio" name="radiobutton1" value="D"><span id="a14">奥斯曼帝国</span><br>
<h3 align="center">第二题</h3>
<p id="t2">一个文弱书生最终成为驾驭干军万马的最高统帅，成就了“无湘不成军”的传奇，被誉为“中兴第一名臣”和“洋务派之父”。此人是</p>
    <input type="radio" name="radiobutton2" value="A" checked><span id="a21">曾国藩</span><br>
    <input type="radio" name="radiobutton2" value="B"><span id="a22">李鸿章</span><br>
    <input type="radio" name="radiobutton2" value="C"><span id="a23">奕</span><br>
    <input type="radio" name="radiobutton2" value="D"><span id="a24">左宗棠</span><br>
<h3 align="center">第三题</h3>
<p id="t3">被称为中国历史上“开天辟地的大事变”，从此“中国革命的面貌焕然一新”的重要事件是</p>
    <input type="radio" name="radiobutton3" value="A" checked><span id="a31">辛亥革命胜利</span><br>
    <input type="radio" name="radiobutton3" value="B"><span id="a32">五四运动爆发</span><br>
    <input type="radio" name="radiobutton3" value="C"><span id="a33">中国共产党诞生</span><br>
    <input type="radio" name="radiobutton3" value="D"><span id="a34">中华人民共和国成立</span><br>
<h3 align="center">第四题</h3>
<p id="t4">有学者认为河南偃师二里头文化遗址是传说中的夏朝都邑。以下考古发现中，最有力的证据是</p>
    <input type="radio" name="radiobutton4" value="A" checked><span id="a41">石制农具</span><br>
    <input type="radio" name="radiobutton4" value="B"><span id="a42">青铜礼器</span><br>
    <input type="radio" name="radiobutton4" value="C"><span id="a43">宫殿遗址</span><br>
    <input type="radio" name="radiobutton4" value="D"><span id="a44">家畜遗骨</span><br>
          
    <br>
    <div id="div-btn">
    <button id="btn-ans" type="button" class="btn btn-success">交 卷</button>
    </div>
    <br>
    <br>
</div>
</body>
  </body>
</html>
