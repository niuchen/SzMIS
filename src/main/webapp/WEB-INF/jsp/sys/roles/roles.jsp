<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
     <jsp:include page="/inc1.4.5.jsp"></jsp:include>
     <script src="<%=basePath %>js/layer-v2.3/layer/layer.js"></script>
   <script type="text/javascript">
<!--
			var queryparams = {};
			//查询方法
			function queryList(){
				var v_role_name = $("#selectRoleSels").combobox('getValue');
			//	queryparams.tag=1;
			//	queryparams.q=v_role_name;
				  $('#list_data').datagrid("options").url= "<%=basePath%>rpg/fuzzyRoles.action?i_type=1";
				// serializeObject 在util.js中 将form表单元素的值序列化成对象
			 	 $('#list_data').datagrid('load', serializeObject($('#selectform')));
 			}
			
		
	  		//添加弹出框打开
	  		function openAddUser(){
				$('#addRoleWin').window('open');
			}
				//添加弹框提交
			function commitAddRole(){
				try{
					layer.load();
					var tag = $('#addRoleForm').form('validate');
					if(tag){
						$('#addRoleForm').form('submit',{
								url:'<%=basePath%>role/insertRole.action',
								onSubmit: function(param){
								},
								success: function(result){
									var reObj = $.parseJSON(result);
									if(reObj.i == 1){
										layer.closeAll();
										layer.msg('添加成功！');
										$('#addRoleForm').form('reset');
										$('#addRoleWin').window('close');
										queryList();
									}else if(result == -1){
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
			
			//修改角色
 	   function modifyRole(){
				if($('#list_data').datagrid('getRows').length == 0){
		    		layer.msg('请先进行数据查询！');
		    		return ;
		    	}
		    	var row = $('#list_data').datagrid('getSelected');
		    	if(!row){
		    		layer.msg('请选择一条记录！');
		    		return ;
		    	}
		    	//$('#upr_name').textbox("setText",row.v_role_name);
		      //  $('#upr_name').textbox("setValue",row.v_role_name);
		        
		      //  $('#upr_name').val(row.v_role_name);
		    	$('#upi_role_id').val(row.i_role_id);
//		    	$('#modifyRoleNameInput').val(row.v_role_name);
		    //	$('#upr_descri').val(row.v_role_desc);
				$('#modifyRoleForm').form('load',{
					upr_name:row.v_role_name,
					upr_descri:row.v_role_desc
				});
				$('#modifyRoleWin').window('open');
 			}
 			
 			//修改提交
 		function modifyRoleCommit(){
				layer.load();
				var tag = $('#modifyRoleForm').form('validate');
				if(tag){
					$('#modifyRoleForm').form('submit',{
						url:'<%=basePath%>role/updateRole.action',
						success: function(result){
 						var res=$.parseJSON(result);
 						// alert(res.OperateState.result);
 							if(res.OperateState.result==1){
								layer.closeAll();
								layer.msg('修改成功！');
 									var row = $('#list_data').datagrid('getSelected');
									var rowindex=$('#list_data').datagrid('getRowIndex',row);
 								     $('#list_data').datagrid('updateRow',{
										index: rowindex,
										row: {
											v_role_name: res.OperateState.reuslt_value.v_role_name,
											v_role_desc: res.OperateState.reuslt_value.v_role_desc
										}
									});
								$('#modifyRoleForm').form('reset');
  								$('#modifyRoleWin').window('close');
							}else {
								layer.closeAll();
								layer.msg('修改失败');
							}
						
						}
					});
				}
			}
 			
			//删除角色
            function deleteRole(){
				if($('#list_data').datagrid('getRows').length == 0){
		    		layer.msg('请先进行数据查询！');
		    		return ;
		    	}
		    	var row = $('#list_data').datagrid('getSelected');
		    	if(!row){
		    		layer.msg('请选择一条记录！');
		    		return ;
		    	}
				
				layer.confirm('确定要删除此角色吗？', {
				  btn: ['确定','取消'] 
				}, function(){
					$.ajax({
		  				url:'<%=basePath%>role/deleteRole.action',
		  				dataType:'json',
		  				data:{
		  					i_role_id:row.i_role_id
		  				},
		  				type:'POST',
		  				success:function(data){	
		  					if(data.i == 1){
		  						queryList();
		  						layer.msg('删除成功!', {icon: 1});
		  					}else if(data.i == 3){
		  						layer.msg('此角色已经被使用，不允许删除!', {icon: 1});
		  					}else{
								layer.msg('删除失败!', {icon: 1});  		  					
		  					}
		  				}
		  			});
				});
 			}
 			
 			var configParam = {};
 				//分配权限按钮生成
			function splitManger(v,row,idx){
	  			return '<input type=button value=\'分配权限\' onclick="openConfigTreeG('+row.i_role_id+')">';
	  		}
	  		//打开权限分配
	  		 function openConfigTreeG(i_role_id){
	  			configParam.i_role_id = i_role_id;
	  			loadTreeGrid(i_role_id);
	  			$('#configPeriWin').window('open');
	  		}
	  		//初始化权限的 角色模块数据
	  	 function loadTreeGrid(i_role_id){
	  	 /***
	  			var nodes = $('#roleTreeGrid').treegrid('getCheckedNodes');
	  			if(nodes && nodes.length > 0){
	  				for(var i = 0 ; i < nodes.length ;i++){
	  					$('#roleTreeGrid').treegrid('uncheckNode',nodes[i].id)
	  				}
	  			}***/
	  			$('#roleTreeGrid').treegrid('unselectAll');
	  			
				$('#roleTreeGrid').treegrid({
					queryParams:{
						r_id:i_role_id
					},
					url:'<%=basePath%>rpg/selectRoleById.action'
				});
			}
			//选中一个模块  权限他的按钮
	  	    function cascNodes(row,check){
			 		var id = row.id;
			 		var v_peri  = row.v_peri;
			 		if(!v_peri || v_peri ==  "" ){
					    var rows =  $('#roleTreeGrid').treegrid('getChildren',id);
					 	if(rows && rows.length > 0){
					 		var len = rows.length;
					 		for(var i = 0 ; i < len ;i++){
					 			cascNodes(rows[i],check);
					 		}
					 	}
				 	}else{
				 		initPeri(v_peri,id,check);
				 	}
			 }
			 
			 function initPeri(v_peri,id,check){
			 		if(check){
			 			$('#roleTreeGrid').treegrid('checkNode',id);
			 		}else{
			 			$('#roleTreeGrid').treegrid('uncheckNode',id);
			 		}
			 		var peris = v_peri.split(",");
			 		var len = peris.length;
			 		for(var i = 0 ; i < len ;i++){
			 			$("#btn_"+id+"_"+peris[i]).prop("checked",check)
			 		}
			 }
			
			 	//提交权限
			function commitPeri(){
				layer.load();
				var result = [];
				var i_role_id = configParam.i_role_id;
 				var tag = getSelectPeri(result,i_role_id);
 				var len = result.length;
				if(len>0){
					//提交
					var json = JSON.stringify(result);
					alert(json);
						$.ajax({
							   type: "POST",
							   url: "<%=basePath%>role/insertRolePri.action",
							   dataType:'text',
							   data: {
							   		i_role:i_role_id,
							   		info:json
							   },
							   success: function(msg){
							   	  layer.closeAll();
							   	  if(eval(msg)){
							   	  	layer.msg('提交成功！');
							   	  	$('#configPeriWin').window('close');
							   	  }else{
							   	  	layer.msg('提交失败');
							   	  }
							   }
						 });
					
					
					
				}else{
					layer.closeAll();
					layer.msg("没有分配权限，不允许提交");
				}
			}
			
		  function getSelectPeri(result,i_role_id){
				var rows = $('#roleTreeGrid').treegrid('getRoots');
				if(rows && rows.length > 0){
					var len = rows.length;
					for(var i = 0 ; i < len ;i++){
						var tag = forNodes(rows[i],result,i_role_id);
					}				
				}
			}
			
		 function forNodes(row,result,i_role_id){
				var id = row.id;
				var v_peri = row.v_peri;
				var tag  = false;
				if(!v_peri || v_peri =='' ){
						var rows = $('#roleTreeGrid').treegrid('getChildren',id);
						if(rows && rows.length > 0){
							var len = rows.length;
							for(var i = 0 ; i < len ;i++){
								var m_p_id = rows[i].m_parent_id;
								if(m_p_id == id){
									var resultTag = forNodes(rows[i],result,i_role_id);
									if(!tag && resultTag){
										tag = resultTag;
									}
								}
							}
							if(tag){
								var role_primis = new Object();
								role_primis.i_role_id = i_role_id;
								role_primis.m_id = id;
								role_primis.b_mark=null;
								result.push(role_primis);
							}	
							return tag;					
						}
				}else{
					var peris = v_peri.split(",");
					if(peris && peris.length > 0 ){
						var len = peris.length;
						for(var i = 0 ; i < len ;i++){
							
							if($("#btn_"+id+"_"+peris[i]).prop("checked")){
								var role_primis = new Object();
								role_primis.i_role_id = i_role_id;
								role_primis.m_id = id;
								role_primis.b_mark=peris[i];
								result.push(role_primis);
								tag = true;
							}						
						}
					}
					return tag;
				
				}
			}
			
//-->
</script>

   
 <form id="selectform" method="post">   
 	<div id="p" class="easyui-panel" data-options=" " align="left">
                                  <label>角色名称：</label>
                                <input id="selectRoleSels" name="selectRoleSels"  class="easyui-combogrid"  data-options="
							    		idField: 'v_role_name',
										textField: 'v_role_name',
										url:'<%=basePath%>rpg/fuzzyRoles.action?i_type=1',
										method: 'post',
										mode: 'remote',
										width:'120px',
										onBeforeLoad:function(param){
										},
										panelWidth: 500,
										loadMsg:'正在加载数据...',
										columns: [[
											{field:'v_role_name',title:'角色名称',width:80},
											{field:'v_role_desc',title:'角色描述',width:120}
										]],
										fitColumns: true,
										pagination:true
						    		" />
 			<a href="javascript:void(0);"
			style="float: right;" class="easyui-linkbutton"
			data-options="iconCls:'icon-cancel',plain:true"
			onclick="$('#selectform').form('clear');">清空</a>
			
			 <a
			href="javascript:void(0);" style="float: right;"
			class="easyui-linkbutton"
			data-options="iconCls:'icon-search',plain:true"
			onclick="queryList();">查询</a>
			
  	</div>
</form>  

     <div id="tb">
 	            	<c:if test="${addBtn != 1 }">
	            	 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'"   
        onclick="javascript:openAddUser();">新增</a>  
 					</c:if>
 					
					<c:if test="${modifyBtn != 1 }">
					 	 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'"   
        onclick="javascript:modifyRole();">修改</a>  
 					</c:if>
					<c:if test="${deleteBtn != 1 }">
						 	 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'"   
        onclick="javascript:deleteRole();">删除</a>  
 					</c:if>
	</div>

 
 <table id="list_data" class="easyui-datagrid"  
        data-options="	fit:false,
				fitColumns:true,
				singleSelect:true,
				pagination:true,
				pageNumber:0,
				pageSize:20,
				loadMsg:'正在加载，请稍候',
				width : 'auto',
			    height : '400',
				toolbar:'#tb'
 			">   
    <thead>   
        <tr>   
              <th data-options="field:'v_role_name',align:'center',width:80">角色名称</th>
             <th data-options="field:'i_role_id',hidden:true,width:100">i_role_id</th>
           <th data-options="field:'v_role_desc',align:'center',width:120">角色描述</th>
			<th data-options="field:'insert_time',width:120,align:'center'">添加时间</th>
 					<c:if test="${commonPermisBtn != 1 }">
						<th
							data-options="field:'f_ys_over',width:140,align:'center',formatter:function(v,row,idx){
								return splitManger(v,row,idx);
							}">
							操作
						</th>
					</c:if>
        </tr>   
    </thead>   
</table>  
  
  <!-- 新增角色层 -->
    <div id="addRoleWin" class="easyui-window" title="新增角色"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,modal:true,minimizable:false,closed:true,maximizable:false,border:false,collapsible:false" style="display: none;width:460px;height:225px; padding: 0px; ">
			<div  class="easyui-panel"   style="width:100%;height:145px;">
				<form id="addRoleForm" class=easyui-form" method="post" >
			    	<table  class="form-table_tab" cellpadding="5"  width="100%" >
			    		<colgroup>
					            <col style="width:30%">
			                	<col style="width:70%">
	                	</colgroup>
			    		<tbody>		
						  <tr>
	                        	<td  class="tdcls">角色名称<font color="red">*</font>：</td>
	                        	<td><input id="r_name" name="r_name" class="easyui-textbox" data-options="required:true,validType:'renames'" /></td>
	                     </tr>
	                       <tr>
	                        	<td class="tdcls">备注：</td>
	                        	<td>
	                         
	                        	<input id="r_descri" name="r_descri" class="easyui-textbox" 
	                        	data-options="multiline:true,iconCls:'icon-search'" style="height:100px;width:100%;"> 

 	                        	
	                        	</td>
	                       </tr>
			             </tbody>
			    	</table>
		    	</form>
	    	</div>
			<div  style="text-align:right;padding:1px 5px 0 0;margin-top:5px;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:commitAddRole()" style="width:80px">提交</a>
			</div>
		</div>

   <!-- 修改角色层 -->
   <div id="modifyRoleWin" class="easyui-window" title="修改角色"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,modal:true,minimizable:false,closed:true,maximizable:false,border:false,collapsible:false" style="display: none;width:460px;height:225px; padding: 0px; ">
			<div  class="easyui-panel"   style="width:100%;height:145px;">
				<form id="modifyRoleForm" class=easyui-form" method="post" >
			    	<table  class="form-table_tab" cellpadding="5"  width="100%" >
			    		<colgroup>
					            <col style="width:30%">
			                	<col style="width:70%">
	                	</colgroup>
			    		<tbody>		
						  <tr>
	                        	<td  class="tdcls">角色名称<font color="red">*</font>：</td>
	                        	<td>
	                        	    <input id="upr_name" name="upr_name" class="easyui-textbox" data-options="required:true,validType:'renamesModify'" />
	                        		<input type="hidden" name="upi_role_id" id="upi_role_id"/>
	                        		<input type="hidden" id="modifyRoleNameInput"/>
	                        	</td>
	                     </tr>
	                       <tr>
	                        	<td class="tdcls">备注：</td>
	                        	<td><textarea id="upr_descri" name="upr_descri" style="height:100px;width:100%;"></textarea></td>
	                       </tr>
			             </tbody>
			    	</table>
		    	</form>
	    	</div>
			<div  style="text-align:right;padding:1px 5px 0 0;margin-top:5px;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:modifyRoleCommit()" style="width:80px">提交</a>
			</div>
		</div>
   
 <!-- 权限分配层 -->  
   	<div id="configPeriWin" class="easyui-window" title="分配权限"  data-options="iconCls:'icon-save',
		draggable:false,resizable:false,modal:true,minimizable:false,closed:true,maximizable:false,border:false,collapsible:false" style="display: none;width:560px;height:315px; padding: 0px; ">
			<div  class="easyui-panel"  data-options="cache:false"  style="width:100%;height:215px;">
			
			<table id="roleTreeGrid" class="easyui-treegrid" 
			    data-options="idField:'id',onCheckNode:function(row,check){
			    	cascNodes(row,check);
			    },fit:true,cache:false,cascadeCheck:true,checkbox:true,treeField:'name'">
			    <thead>
					<tr>
						<th data-options="field:'name',width:180" >模块</th>
						<th data-options="field:'v_peri',hidden:true,width:180">按钮ID组</th>
						<th data-options="field:'m_parent_id',hidden:true,width:180">模块父ID</th>
						<th data-options="field:'v_periCheck',width:350,align:'center'">权限</th>
					</tr>
			    </thead>
			</table>
	    	</div>
			<div  style="text-align:right;padding:1px 5px 0 0;margin-top:5px;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:commitPeri()" style="width:80px">提交</a>
			</div>
		</div>