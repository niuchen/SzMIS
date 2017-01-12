
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="favicon.ico"> 
 <meta name="author" content="">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="<%=basePath%>js/jquery-easyui-1.4.5/jquery.min.js" charset="utf-8"></script>
<!-- jquery Cookie插件 -->
<script type="text/javascript" src="<%=basePath%>js/jquery.cookie.js" charset="utf-8"></script>
<!-- easyui相关库 -->
<link id="easyuiTheme" rel="stylesheet" href="<%=basePath%>js/jquery-easyui-1.4.5/themes/<c:out value="${cookie.easyuiThemeName.value}" default="default"/>/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="<%=basePath%>js/jquery-easyui-1.4.5/themes/icon.css" type="text/css"></link>
<link rel="stylesheet" href="<%=basePath%>style/common.css" type="text/css"></link>
<script type="text/javascript" src="<%=basePath%>js/jquery-easyui-1.4.5/jquery.easyui.min.js" charset="utf-8"></script>
 <script type="text/javascript" src="<%=basePath%>js/jquery-easyui-1.4.5/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>js/util.js" charset="utf-8"></script>

<script>
//自定义验证规则.  验证两个日期空间时间 起与止 
$.extend($.fn.validatebox.defaults.rules,{
   TimeCheck:{
    validator:function(value,param){  
      var s = $("#"+param[0]).datebox("getValue"); 
 	    if(param[1]==2){
	      //因为日期是统一格式的所以可以直接比较字符串 否则需要Date.parse(_date)转换
	         if(s==''||s==null){
	             var curr_time = new Date(value);
				   var strDate = curr_time.getFullYear()+"-";
				   strDate += curr_time.getMonth()+1+"-";
				   strDate += curr_time.getDate()+" ";
				   strDate += curr_time.getHours()+":";
				   strDate += curr_time.getMinutes()-1+":";
				   strDate += curr_time.getSeconds();
				   alert(strDate);
 	         	   $("#"+param[0]).datetimebox("setValue", strDate); 
	          	   return true;
	         }
	     return value>=s;
	    }  else if(param[1]==1){
		    if(s==''||s==null){
	 		   $("#"+param[0]).datetimebox("setValue", value); 
		      return true;
		    }
	       return value<s;
	    }else{
	       return false;
	    }
     },
    message:'非法数据'
   },
   pwdVl: {
				        validator: function(value, param){
				        	//var pwdTest = /[^A-Za-z0-9_~@#$\^]/;
				        	var pwdTest = /^[\d_a-zA-Z]{6,10}$/;
				            return pwdTest.test(value);
				        },
				        message: '数字、字母、不能有空格、长度不能少于6位'
				    },
			    maxLen:{
			    	validator:function(value,param){
			    		if(value.length < 6){
			    			return false;
			    		}
			    		return true
			    	},
			    	message: '数字、字符组合，长度不能少于6位'
			    },
			    isEqs:{
			     	validator:function(value,param){
			     		return value == $('#modifyPwd_div .textbox-value').val();
			     	},
			    	message: '两次输入密码不一致'
			     },
			    isEqsAdd:{
			     	validator:function(value,param){
			     		return value == $('#addusePwdTd .textbox-value').val();
			     	},
			    	message: '两次输入密码不一致'
			     },
			    renames: {
			        validator: function(value,param){
			         var res = $.ajax({
					  url: "<%=basePath%>users/invalidateUser.action",
					  ype: "POST",
					  data:{
					  	v_user_name:value,
					  	handler:'add'
					  },
					  async: false
					 }).responseText;
					 if(res == "true"){
					 	return false;
					 }else{
					 	return true;
					 }
			        },
			        message: '登录名已经被占用!'
			    },
			    renamesModify: {
			        validator: function(value,param){
			       	 var i_user_id = $('#modifyUserIdInput').val();
			         var res = $.ajax({
					  url: "<%=basePath%>users/invalidateUser.action",
					  ype: "POST",
					  data:{
					  	v_user_name:value,
					  	handler:'modify',
					  	i_user_id:i_user_id
					  },
					  async: false
					 }).responseText;
					 if(res == "true"){
					 	return false;
					 }else{
					 	return true;
					 }
			        },
			        message: '登录名已经被占用!'
			    },
			    valiNum:{
			    	 validator: function(value,param){
			    	 	var regex = /^1[\d]{10}$/;
			    	 	return regex.test(value);
			    	 },
			    	message:'手机号码必须以1开头,后面跟10位数字！'
			    }
   });
  
  
 
</script> 
  