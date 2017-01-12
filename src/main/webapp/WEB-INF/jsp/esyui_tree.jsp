<%@page import="com.module.test.pojo.Console"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!doctype html>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<meta charset="utf-8">
<title>外勤企业级服务后台简版</title>

<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<base href="<%=basePath%>">



 <script type="text/javascript"
	src="js/jquery-easyui-1.4.5/jquery.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.4.5/jquery.easyui.min.js"></script></head>

</head>
<link rel="stylesheet"
	href="js/jquery-easyui-1.4.5/themes/default/easyui.css" type="text/css"></link>
<script type="text/javascript" src="js/layer-v2.3/layer/layer2.js"></script>
 <ul id="tt"></ul>
 <script type="text/javascript">
     $('#tt').tree({
        url:'ModulemanagerController/getjqueryeasyuiVIDPID_T_MODULES.action'
    });
 </script>
</body>
</html>
