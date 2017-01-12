<%@page import="com.SzMIS.sys.user.pojo.UserLogVo"%>
  <%@page import="java.util.Enumeration"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <title></title>
<jsp:include page="/inc1.4.5.jsp"></jsp:include>
	
	<% 
	//Enumeration e=  request.getSession().getAttributeNames(); 
	//UserLogVo u=(UserLogVo) request.getSession().getAttribute("user");
	// System.out.println(u.getV_login_name());	
	//while(e.hasMoreElements()){
	//	System.out.println("--------------------");
	//    System.out.println(e.nextElement());
   //  }
	%>
	<script type="text/javascript" charset="utf-8"> 
 	$(document).ready(function(){
		//debugger;
		//alert(${sessionScope.user.v_login_name});
		if('${sessionScope.user}' == null||'${sessionScope.user}'=="")
		{
			$.messager.show({title:'提示',msg:'您还未登录!请登录后操作...'});
			   setTimeout(function(){
			     window.location.href = 'login.action';
			   }, 1000);
		}
		else
		{
			$.messager.show({
				title : '提示',
				width:230,
				height:150,
				msg : function(){
				    var msg ='${sessionScope.user.v_real_name}'+' 您好!<br/>';
				     if('${sessionScope.user.maxlogdate}' != null && '${sessionScope.user.maxlogdate}' != ''){
				       msg += '上次登陆时间: '+ '${sessionScope.user.maxlogdate}' + '<br/>';
				     }else{
				    	 msg += '欢迎你首次登陆系统!~'+'<br/>';
				     }
				     if('${sessionScope.user.maxlogip}' != null && '${sessionScope.user.maxlogip}' != ''){
				        msg += '上次登陆IP: ' + '${sessionScope.user.maxlogip}' + '<br/>';
				     }
				     msg += '本次登陆IP：' + '${sessionScope.user.ip}' + '<br/>';
				     if('${sessionScope.user.maxlogip}' != null && '${sessionScope.user.maxlogip}' != '' && '${sessionScope.user.maxlogip}' != '${sessionScope.user.ip}'){
				    	 msg += '<font color="red">两次登陆IP不一致!</font>';
				     }
				     return msg;
				  }
				});
		}
		}
	); 
	 
	
	</script>
  </head>
 
  <body class="easyui-layout">
    <div data-options="region:'north',href:'${pageContext.request.contextPath}/Layout.action?type=layout_north'" style="height: 70px;overflow: hidden;"></div>
	<div data-options="region:'west',title:'功能导航',href:'${pageContext.request.contextPath}/Layout.action?type=layout_menu'" style="width: 200px;overflow: hidden;"></div>
	<div data-options="region:'center',title:'欢迎使用本系统',href:'${pageContext.request.contextPath}/Layout.action?type=layout_center'" style="overflow: hidden;"></div>
	<div data-options="region:'south',href:'${pageContext.request.contextPath}/Layout.action?type=layout_south'" style="height: 25px;overflow: hidden;"></div>
  </body>
 
</html>
