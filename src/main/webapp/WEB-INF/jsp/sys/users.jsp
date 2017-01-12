<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
	<title>系统设置-用户管理</title>
	<link rel="stylesheet" href="<%=basePath %>/staticv3/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=basePath %>/staticv3/css/main.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>easyui1/themes/gray/easyui.css?v=20160121" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>easyui1/themes/icon.css">
<style type="text/css">
.form-control {
  height: 24px;
}
.panel-body {
    padding: 1px;
}
.Wdate {
  width: 100px !important;
  height: 23px !important; 
}
.form-inline .form-group {
    display: inline-block;
    margin-bottom: 0;
    vertical-align: middle;
    *display:inline;
	*zoom:1;
}

 .datagrid .panel-body{
 	padding: 1px;
 }
 
 .ui-nav {
    width: 100%;
    margin-bottom: 5px;
    margin-top:1px;
}

a.pushBtn {
    text-decoration: none;
    height: 24px;
    margin: 0 5px 0 0;
    outline: none;
    background: url("<%=basePath%>images/buttonLeft.gif") no-repeat left top;
    _display: inline;
    float: left;
    -moz-user-select: none;
}

a.pushBtn b {
    cursor: pointer;
    white-space: nowrap;
    color: #666;
    font-weight: normal;
    height: 24px;
    line-height: 24px;
    font-size: 12px;
    padding: 0 13px 0 13px;
    background: url("<%=basePath%>images/buttonRight.gif") no-repeat right top;
    display: inline-block;
}

a.pushBtn:hover{text-decoration:none;background:url(<%=basePath%>images/bt_over_left.gif) no-repeat left top;}
a.pushBtn:hover b{color:#147;font-size:12px;background:url(<%=basePath%>images/button_over_right.gif) no-repeat right top;}

.card-body {
    position: relative;
    padding: 20px 5px 20px 5px ;
}


.form-table_tab {
    width: 100%;
    border-collapse: collapse;
    white-space: normal;
    word-wrap: break-word;
    word-break: break-all;
    table-layout: fixed;
}

.form-table_tab tbody .tdcls {
    background-color: #f6f6f6;
    text-align: right;
}

.form-table_tab th, .form-table_tab td {
    padding: 0px 10px;
    border: 1px solid #ddd;
    height: 30px;
    text-align: left;
}


</style>
<script src="<%=basePath %>/front/scripts/jquery-1.8.3.min.js"></script>
<script src="<%=basePath %>/plugins/moment.js"></script>
<script src="<%=basePath %>/plugins/date97/WdatePicker.js"></script>

<script type="text/javascript">
document.write("<scr"+"ipt src=\"<%=basePath%>easyui1/jquery.easyui.min.js?v=20160121\"></sc"+"ript>");
document.write("<scr"+"ipt src=\"<%=basePath%>easyui/easyui-lang-zh_CN.js?v=20160121\"></sc"+"ript>");
</script>
<script src="<%=basePath %>plugins/layer/layer.js"></script>
		<script type="text/javascript">
			var webPath  = '<%=basePath%>';
			var is_manager = '${user.is_area_manager}';
			var i_admin_tag = '${user.i_admin_tag}';
			function formatCountNum(v,row){
				v = v == null ?'':v;
				return '<div title="'+v+'">'+v+'</div>'; 
			}
			
			var queryparams = {};
			function queryList(){
				var i_city_id = $("#assentSelect21").combobox('getValue');
				var i_user_state = $("#assentSelect22").combobox('getValue') == -1?'':$("#assentSelect22").combobox('getValue');
				var v_login_name = $("#reLoginName1").combogrid('getValue');
				var v_real_name = $("#reLoginName2").combogrid('getValue');
				queryparams.tag=1;
				queryparams.i_subcomp_id=i_city_id == 0 ?'': i_city_id;
				queryparams.v_login_name=v_login_name;
				queryparams.v_real_name=v_real_name;
				queryparams.i_user_state=i_user_state;
				$('#tt').datagrid({
				   url:'<%=basePath%>ump/selUser.action',
	               pageNumber:1,
	               queryParams: queryparams
	            });
			}
			
			
			function exportExcel(){
		    	if($('#tt').datagrid('getRows').length == 0){
		    		alert('导出的数据不能为空！');
		    		return ;
		    	}
	            var param = "&v_year_month="+queryparams.v_year_month;
		        var columnArray = getFiedStr('tt');
				window.location.href = "<%=basePath%>anym/smlvExp.action?columnArray="+columnArray + param ;
	  		}
	  		
	  		function selectCompLoadLR(){
		  		var i_subcomp_id = $('#assentSelect21').combobox('getValue');
	       		$('#reLoginName1').combogrid('clear');
				var g = $('#reLoginName1').combogrid('grid');
				g.datagrid('load',{
					i_subcomp_id: i_subcomp_id==0?'':i_subcomp_id
				});
				
				$('#reLoginName2').combogrid('clear');
				var g = $('#reLoginName2').combogrid('grid');
				g.datagrid('load',{
					i_subcomp_id: i_subcomp_id==0?'':i_subcomp_id
				});
	  		}
	  		
	  		
	  		$.extend($.fn.validatebox.defaults.rules, {
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
			
			
			function commitAddUser(){
				try{
					layer.load();
					var tag = $('#addUserForm').form('validate');
					if(tag){
						$('#addUserForm').form('submit',{
								url:'<%=basePath%>ump/insertU.action',
								onSubmit: function(param){
									param.i_user_status =1;
									param.i_roles = $('#addUserRole').combobox('getValues').join(",");
									param.v_subcomp_name = $('#addUserCompany').next(".textbox").find(".textbox-text").val();
									param.v_role_name = $('#addUserRole').combobox('getText');
								},
								success: function(result){
									if(result == "1"){
										layer.closeAll();
										layer.msg('添加成功！');
										$('#addUserForm').form('reset');
										$('#addSiteWin').window('close');
										queryList();
									}else if(result == "2"){
										layer.closeAll();
										layer.msg('添加失败');
									}
								}						
						});
					}else{
						layer.closeAll();
					}
					
				}catch(e){
					alert(e);
				}
			
			}
			
			function openAddUser(){
				$('#addSiteWin').window('open');
			}
			
			function modifyPwd(){
				var row = validateGridRow();
				if(!row){
					return;
				}
				$('#modifyPwdWin').window('open');
			}
			
			function closeWindow(){
				$('#modifyPwdWin').window('close');
			}
			
			
			function modifyPwdCommit(){
				var row = validateGridRow();
				layer.load();
				var i_user_id  = row.i_user_id;
				var newpwd =  $('#modifyPwd_div .textbox-value').val();
  				var conpwd = $('#modifyConfPwd').textbox('getValue');
				var tag = $('#modifyPwdForm').form('validate');
				if(tag){
					$('#modifyPwdForm').form('submit',{
						url:'<%=basePath%>mdf/upwd.action',
						onSubmit:function(param){
							param.i_user_id = i_user_id;
							param.v_pwd=newpwd;
						},
						success: function(result){
							if(result == "1"){
								layer.closeAll();
								layer.msg('修改密码成功！');
								$('#modifyPwdForm').form('reset');
								$('#modifyPwdWin').window('close');
							}else if(result == "2"){
								layer.closeAll();
								layer.msg('修改密码失败');
							}
						
						}
					});
				}
			}
			
			function modifyUser(){
				if($('#tt').datagrid('getRows').length == 0){
		    		layer.msg('请先进行数据查询！');
		    		return ;
		    	}
		    	var row = $('#tt').datagrid('getSelected');
		    	if(!row){
		    		layer.msg('请选择一条记录！');
		    		return ;
		    	}
		    	$('#modifyUserIdInput').val(row.i_user_id);
				$('#modifySiteWin').window('open');
				$('#modifyUserForm').form('load',{
					i_subcomp_id:row.i_subcomp_id,
					v_user_name:row.v_login_name,
					v_real_name:row.v_real_name,
					v_tel_phone:row.v_user_tel ,
					v_user_email:row.v_user_email,
					is_manager:row.is_area_manager,
					i_user_state:row.i_user_state
				});
				$('#modifyUserRole').combobox('setValues',row.i_role_ids);
			}
			
			function validateGridRow(){
				if($('#tt').datagrid('getRows').length == 0){
		    		layer.msg('请先进行数据查询！');
		    		return false;
		    	}
		    	var row = $('#tt').datagrid('getSelected');
		    	if(!row){
		    		layer.msg('请选择一条记录！');
		    		return false;
		    	}
		    	return row;
			}
			
			function deleteUser(){
				if($('#tt').datagrid('getRows').length == 0){
		    		layer.msg('请先进行数据查询！');
		    		return ;
		    	}
		    	var row = $('#tt').datagrid('getSelected');
		    	if(!row){
		    		layer.msg('请选择一条记录！');
		    		return ;
		    	}
				
				layer.confirm('确定要删除此用户吗？', {
				  btn: ['确定','取消'] 
				}, function(){
					$.ajax({
		  				url:'<%=basePath%>users/UpdateState.action',
		  				dataType:'html',
		  				data:{
		  					i_user_id:row.i_user_id
		  				},
		  				type:'POST',
		  				success:function(data){	
		  					if(data){
		  						queryList();
		  						layer.msg('删除成功!', {icon: 1});
		  					}else{
								layer.msg('删除失败!', {icon: 1});  		  					
		  					}
		  				}
		  			});
				});
			
			}
			
			function modifyUserCommit(){
				layer.load();
				var tag = $('#modifyUserForm').form('validate');
				
				if(tag){
					$('#modifyUserForm').form('submit',{
						url:'<%=basePath%>ump/upUser.action',
						onSubmit: function(param){
							param.i_roles = $('#modifyUserRole').combobox('getValues').join(",");
							param.v_subcomp_name = $('#modifyUserCompany').next(".textbox").find(".textbox-text").val();
						},
						success: function(result){
							if(result == "1"){
								layer.closeAll();
								layer.msg('修改成功！');
								$('#modifyUserForm').form('reset');
								$('#modifySiteWin').window('close');
								queryList();
							}else if(result == "2"){
								layer.closeAll();
								layer.msg('添加失败');
							}
						}
					})
				
				}else{
					layer.closeAll();
				}
				
				
			}
	  	
		</script>
</head>
<body >
<div id="tb" class="card-body">
    <div class="section-header">
        <div class="page-title"><h3 class="text-danger">查询条件</h3></div>
        <div class="selector">
            <form class="form-inline">
                <div class="sl-wrap">
                    <!-- 日期条件 -->
                    <div class="sl-inner clearfix">
                        <div class="sl-key"><span>基本信息：</span></div>
                        <div class="sl-value">
                            <div class="form-group">
                                <label>地市：</label>
                                <input id="assentSelect21"  class="easyui-combobox" 
						        data-options="valueField:'i_city_id',textField:'v_city_name',
						        onSelect:function(ridx,row){
						        	selectCompLoadLR();	
						        },
						        onLoadSuccess:function(){
						        	selectCompLoadLR();
						        },
						        editable:false,value:${i_subcomp_id} ,width:'120px',url:'<%=basePath%>dict/selCity.action'">
                            </div>
                            <div class="form-group">
                                <label>用户状态：</label>
                                <input id="assentSelect22"  class="easyui-combobox" 
						        data-options="valueField: 'label',
							    		textField: 'value',
							    		width:'120px',
							    		editable:false,
							    		value:'-1',
							    		data:[{label:'-1',value:'全部'},{label:'1',value:'正常'},{label:'2',value:'锁定'}
							    		,{label:'3',value:'禁用'}],editable:false">
                            </div>
                        </div>
                    </div>
                    
                    <div class="sl-inner clearfix">
                        <div class="sl-key"><span>其他条件：</span></div>
                        <div class="sl-value">
                            <div class="form-group">
                                <label>登录名：</label>
                                <input id="reLoginName1" class="easyui-combogrid"  data-options="
							    		idField: 'v_login_name',
										textField: 'v_login_name',
										url:'<%=basePath%>ump/fuzz.action?i_type=1',
										method: 'post',
										mode: 'remote',
										width:'120px',
										onBeforeLoad:function(param){
											param.i_subcomp_id = $('#assentSelect21').combobox('getValue') ==0?'':$('#assentSelect21').combobox('getValue');
										},
										panelWidth: 500,
										loadMsg:'正在加载数据...',
										columns: [[
											{field:'v_login_name',title:'登录名',width:80},
											{field:'v_real_name',title:'真实姓名',width:120},
											{field:'v_subcomp_name',title:'地市',width:80}
										]],
										fitColumns: true,
										pagination:true
						    		" />
                            </div>
                            <div class="form-group">
                                <label>真实姓名：</label>
                                <input id="reLoginName2" class="easyui-combogrid"  data-options="
							    		idField: 'v_real_name',
										textField: 'v_real_name',
										url:'<%=basePath%>ump/fuzz.action?i_type=2',
										method: 'post',
										mode: 'remote',
										width:'120px',
										onBeforeLoad:function(param){
											param.i_subcomp_id = $('#assentSelect21').combobox('getValue') ==0?'':$('#assentSelect21').combobox('getValue');
										},
										panelWidth: 500,
										loadMsg:'正在加载数据...',
										columns: [[
											{field:'v_login_name',title:'登录名',width:80},
											{field:'v_real_name',title:'真实姓名',width:120},
											{field:'v_subcomp_name',title:'地市',width:80}
										]],
										fitColumns: true,
										pagination:true
						    		" />
                            </div>
                        </div>
                    </div>
                </div>
				 
                <!-- 操作 -->
                <div class="form-submit">
	                <c:if test="${selectBtn ==1 }">
	                    <div class="form-group">
	                        <button type="button" onClick="queryList()" class="btn btn-danger">查询</button>
	                    </div>
	                </c:if>
                </div>
            </form>
            <div class="ui-nav">
           			<c:if test="${addBtn == 1 }">
           				<a data-mode="sign" class="pushBtn "  id="addUserButton" href="javascript:openAddUser();"><b>新增</b></a>
                    </c:if>
					<c:if test="${modifyBtn == 1 }">
						<a data-mode="sign" class="pushBtn "  id="modifyUserButton"   href="javascript:modifyUser();"><b>修改</b></a>
					</c:if>
					<c:if test="${modifyPwd == 1 }">
						<a data-mode="sign" class="pushBtn "  id="modifyUserPwdButton"   href="javascript:modifyPwd();"><b>修改密码</b></a>
					</c:if>
					<c:if test="${deleteBtn == 1 }">
						<a data-mode="sign" class="pushBtn "  id="deleteUserButton"   href="javascript:deleteUser();"><b>删除</b></a>
					</c:if>
				</div>
        </div>
    </div>
    	
   </div> 
		<table id="tt" class="easyui-datagrid" style="display: none;"
			data-options="
				fit:true,
				fitColumns:false,
				singleSelect:true,
				pagination:true,
				pageNumber:0,
				pageSize:20,
				loadMsg:'正在加载，请稍候',
				onSelect:function(idx,row){
					var is_admin = row.v_admin;
					
					if(is_admin == '是' && i_admin_tag == 0){
						$('#modifyUserButton').hide();
						$('#modifyUserPwdButton').hide();
						$('#deleteUserButton').hide();
					}else{
						$('#modifyUserButton').show();
						$('#modifyUserPwdButton').show();
						$('#deleteUserButton').show();
					}
					
				},
				toolbar:'#tb'">
			<thead>
				<tr>
					<th data-options="field:'v_subcomp_name',align:'center',width:80">
						地市
					</th>
					<th data-options="field:'i_subcomp_id',hidden:true,width:100">
						i_subcomp_id
					</th>
					<th data-options="field:'i_city_id',hidden:true,width:100">
						i_user_id
					</th>
					<th data-options="field:'i_user_state',hidden:true,width:100">
						i_user_state
					</th>
					<th data-options="field:'i_role_ids',hidden:true,width:100">
						i_role_ids
					</th>
					<th data-options="field:'i_user_state',hidden:true,width:100">
						is_area_manager
					</th>
					<th data-options="field:'v_login_name',align:'center',width:120,formatter:formatCountNum">
						登录名
					</th>
					<th
						data-options="field:'v_real_name',width:120,align:'center',formatter:formatCountNum">
						真实姓名
					</th>
					<th
						data-options="field:'v_area_manager',width:100,align:'center'">
						是否区域经理
					</th>
					<th
						data-options="field:'v_admin',width:100,align:'center'">
						是否超级管理员
					</th>
					<th
						data-options="field:'v_role_name',width:160,align:'center'">
						角色
					</th>
					<th
						data-options="field:'v_user_state',width:80,align:'center'">
						状态
					</th>
					<th
						data-options="field:'v_user_tel',width:160,align:'center'">
						电话
					</th>
					<th
						data-options="field:'v_user_email',width:210,align:'center'">
						电子邮件
					</th>
					<th
						data-options="field:'insert_time',width:160,align:'center'">
						添加时间
					</th>
				</tr>
			</thead>
		</table>
		
		<div id="addSiteWin" class="easyui-window" title="新增用户"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,modal:true,minimizable:false,closed:true,maximizable:false,border:false,collapsible:false" style="display: none;width:460px;height:445px; padding: 0px; ">
			<div  class="easyui-panel"   style="width:100%;height:365px;">
				<form id="addUserForm" class=easyui-form" method="post" >
			    	<table  class="form-table_tab" cellpadding="5"  width="100%" >
			    		<colgroup>
					            <col style="width:30%">
			                	<col style="width:70%">
	                	</colgroup>
			    		<tbody>		
			    		<tr>
	                        	<td class="tdcls">地市<font color="red">*</font>：</td>
	                        	<td>
	                        	   <input id="addUserCompany"  name="i_subcomp_id" class="easyui-combobox" 
							        data-options="valueField:'i_city_id',textField:'v_city_name',
							        editable:false,value:${i_subcomp_id} ,width:'120px',url:'<%=basePath%>dict/selCity.action'">
	                        	</td>
	                       </tr>
						  <tr>
	                        	<td  class="tdcls">登录名<font color="red">*</font>：</td>
	                        	<td><input id="jfgx1jfWidget4" name="v_user_name" class="easyui-textbox" data-options="required:true,validType:'renames'" /></td>
	                     </tr>
						<tr>
	                        	<td class="tdcls">真实姓名<font color="red">*</font>：</td>
	                        	<td><input type="text" class="easyui-textbox"  name="v_real_name" id="" style="width:50%;" data-options="required:true" /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">密码<font color="red">*</font>：</td>
	                        	<td id="addusePwdTd"><input type="password" id="addusePwd" class="easyui-textbox" name="v_password" style="width:165px;" validType="pwdVl" data-options="required:true"  style=""  /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">确认密码<font color="red">*</font>：</td>
	                        	<td><input type="password" class="easyui-textbox" name="v_password1" style="width:165px;"  validType="isEqsAdd" data-options="required:true" style="width:'165px';"  /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">手机号码<font color="red">*</font>：</td>
	                        	<td><input  name="v_tel_phone" class="easyui-textbox" data-options="required:true,validType:'valiNum'" /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">电子邮箱<font color="red">*</font>：</td>
	                        	<td><input   class="easyui-textbox" name="v_user_email"
						        data-options="width:'160px',required:true,validType:'email'"></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">是否区域经理<font color="red">*</font>：</td>
	                        	<td><input  name="is_manager"  class="easyui-combobox" data-options="
						    		valueField: 'value',
						    		textField: 'label',
						    		width:'165px',
						    		required:true,
						    		panelHeight:'100px',
						    		editable:false,
						    		value:'0',
						    		data:[{label:'是',value:'1'},{label:'否',value:'0'}]"/></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">角色<font color="red">*</font>：</td>
	                        	<td>
	                        	   <input id="addUserRole" class="easyui-combobox" 
							        data-options="valueField:'i_role_id',textField:'v_role_name',
							        editable:false,width:'160px',required:true,onShowPanel:function(){
							        	$('#addUserRole').combobox('reload');
							        },multiple:true,url:'<%=basePath%>ump/selectRoleList.action'">
	                        	</td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">备注：</td>
	                        	<td><textarea  name="note" style="height:70px;width:100%;"></textarea></td>
	                       </tr>
			             </tbody>
			    	</table>
		    	</form>
	    	</div>
			<div  style="text-align:right;padding:1px 5px 0 0;margin-top:5px;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:commitAddUser()" style="width:80px">提交</a>
			</div>
		</div>
		
		
		<div id="modifySiteWin" class="easyui-window" title="修改用户"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,modal:true,minimizable:false,closed:true,maximizable:false,border:false,collapsible:false" style="display: none;width:460px;height:445px; padding: 0px; ">
			<div  class="easyui-panel"   style="width:100%;height:365px;">
				<form id="modifyUserForm" class=easyui-form" method="post" >
			    	<table  class="form-table_tab" cellpadding="5"  width="100%" >
			    		<colgroup>
					            <col style="width:30%">
			                	<col style="width:70%">
	                	</colgroup>
			    		<tbody>		
			    		<tr>
	                        	<td class="tdcls">地市<font color="red">*</font>：</td>
	                        	<td>
	                        	   <input id="modifyUserCompany"  name="i_subcomp_id" class="easyui-combobox" 
							        data-options="valueField:'i_city_id',textField:'v_city_name',
							        editable:false,value:${i_subcomp_id} ,width:'120px',url:'<%=basePath%>dict/selCity.action'">
	                        	</td>
	                       </tr>
						  <tr>
	                        	<td  class="tdcls">登录名<font color="red">*</font>：</td>
	                        	<td><input id="jfgx1jfWidget4" name="v_user_name" class="easyui-textbox" validType="renamesModify['modifyUserIdInput']" data-options="required:true" />
	                        	<input id="modifyUserIdInput" name="i_user_id" type="hidden"   />
	                        	</td>
	                     </tr>
						<tr>
	                        	<td class="tdcls">真实姓名<font color="red">*</font>：</td>
	                        	<td><input type="text" class="easyui-textbox"  name="v_real_name" id="" style="width:50%;" data-options="required:true" /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">手机号码<font color="red">*</font>：</td>
	                        	<td><input  name="v_tel_phone" class="easyui-textbox" data-options="required:true,validType:'valiNum'" /></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">电子邮箱<font color="red">*</font>：</td>
	                        	<td><input   class="easyui-textbox" name="v_user_email"
						        data-options="width:'160px',required:true,validType:'email'"></td>
	                       </tr>
	                        <tr>
	                        	<td class="tdcls">状态<font color="red">*</font>：</td>
	                        	<td><input  name="i_user_state"  class="easyui-combobox" data-options="
						    		valueField: 'value',
						    		textField: 'label',
						    		width:'165px',
						    		required:true,
						    		panelHeight:'100px',
						    		editable:false,
						    		value:'0',
						    		data:[{label:'正常',value:'1'},{label:'锁定',value:'2'},{label:'禁用',value:'3'}]"/></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">是否区域经理<font color="red">*</font>：</td>
	                        	<td><input  name="is_manager"  class="easyui-combobox" data-options="
						    		valueField: 'value',
						    		textField: 'label',
						    		width:'165px',
						    		required:true,
						    		panelHeight:'100px',
						    		editable:false,
						    		value:'0',
						    		data:[{label:'是',value:'1'},{label:'否',value:'0'}]"/></td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">角色<font color="red">*</font>：</td>
	                        	<td>
	                        	   <input id="modifyUserRole" class="easyui-combobox" 
							        data-options="valueField:'i_role_id',textField:'v_role_name',
							        editable:false,width:'160px',required:true,onShowPanel:function(){
							        	$('#addUserRole').combobox('reload');
							        },multiple:true,url:'<%=basePath%>ump/selectRoleList.action'">
	                        	</td>
	                       </tr>
	                       <tr>
	                        	<td class="tdcls">备注：</td>
	                        	<td><textarea  name="note" style="height:70px;width:100%;"></textarea></td>
	                       </tr>
			             </tbody>
			    	</table>
		    	</form>
	    	</div>
			<div  style="text-align:right;padding:1px 5px 0 0;margin-top:5px;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:modifyUserCommit()" style="width:80px">提交</a>
			</div>
		</div>
		
			<!-- 修改密码窗口 -->
		<div id="modifyPwdWin" class="easyui-window" title="修改密码"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,close:true,modal:true,minimizable:false,maximizable:false,closed:true,border:false,collapsible:false" style="display: none;width:300px;height:210px; padding: 0px; ">
		<form id="modifyPwdForm" method="post">
			<div style="padding:5px;">
			<div id="modifyPwd_div" style="padding:5px 10px">
				<div>新密码:</div>
				<input class="easyui-textbox" id="modifyPwd" required="required"  data-options="validType:['pwdVl','maxLen']"  type="password" style="width:100%;height:28px;">
			</div>
			<div style="padding:5px 10px">
				<div>确认密码:</div>
				<input class="easyui-textbox"  id="modifyConfPwd"  type="password"  required="required" validType="isEqs['#modifyPwd']"  style="width:100%;height:28px;">
			</div>
		</form>
			<div  style="text-align:right;padding:15px 5px 0 0;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:modifyPwdCommit()" style="width:80px">提交</a>
				<a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="javascript:closeWindow()" style="width:80px">关闭 </a>
			</div>
		</div>
		<script type="text/javascript" src="<%=basePath%>js/uicommon.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				var startDate  = moment().format('YYYY-MM');
			});
		</script>
	</body>
</html>
