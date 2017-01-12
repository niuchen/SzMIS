<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页  - </title>
  <jsp:include page="/inc1.4.5.jsp"></jsp:include>
    <style type="text/css">
	     body {
		    font-family:helvetica,tahoma,verdana,sans-serif;
		    padding:20px;
		    font-size:13px;
		    margin:0;
		}
       input  {width:150px}
    </style>
    <script>
 	 
   function login(){
     $('#login_loginForm').form("submit",{
				url : 'Userlogin.action',
				dataType:"json",
				success : function(result) {
  					var r = $.parseJSON(result);
 					if (r.success) {
					//	login_loginDialog.dialog('close');
						window.location.href = 'main.action';//main.html 配置失效
 					} else {
						$.messager.show({
							title : '提示',
							msg : r.msg
							});
					}
 				}
			});
       
       
   }
       $(function(){
	    // alert("启动运行");
       });
		
    </script>
  </head>
  
  <body>
  <br><br><br><br><br><br><br>
    <div class="easyui-dialog"  title="登陆系统" id="user_login_loginDialog" style="width:510px;height:200px;padding:10px"  >
     	<form method="post" id="login_loginForm">
					<table border="0" align="center">
					<tr><th colspan="2"></th></tr>
						<tr>
							<th>登录名</th>
							<td><input name="username" class="easyui-validatebox" data-options="required:true,validType:'length[1,32]'"/></td>
						</tr>
						<tr>
							<th>密码</th>
							<td><input type="password" name="userpwd" class="easyui-validatebox" data-options="required:true,validType:'length[1,16]'"/></td>
						</tr>
						<tr>
						<td><input type="button" value="登陆" onClick="login();"></td>
						</tr>
					</table>
				</form>
  </div>
  </body>
</html>
