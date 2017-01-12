
$(function() {
	//初始化表格
 		$('#list_data').datagrid({
			//title : '应用系统列表',
			iconCls : 'icon-edit',//图标 
			width : 'auto',
			height : '400',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			//  fit: true,//自动大小 
			// url:'../ModuleMtController/getT_MT_MODULES.action', 
			//sortName: 'code', 
			//sortOrder: 'desc', 
			remoteSort : false,
			idField : 'm_id',//唯一标识
			singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			columns:[[
                       {field:'m_id',title:'模块id',width:100,align:'center'},
                      {field:'m_name',title:'模块名称',width:100},
                      {field:'m_parent_id',title:'模块父id',width:100,sortable:true},
                      {field:'m_file_path',title:' 模块路径',width:100},
                       {field:'is_leaf',title:'节点类型',width:100,
                          formatter:function(value, record, index){
                              if(value == 1){
                                  return '<span>功能</span>'
                              }else{
                                  return '<span>菜单</span>'
                              }
                          }},
                      {field:'insert_time',title:'插入时间',width:100},
                      {field:'i_order_id',title:'排序',width:100},
                      {field:'m_iconcls',title:'图标路径',width:100},
                      {field:'i_del_tag',title:'是否删除',width:100}
                      ]],
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ],
			 toolbar: [{ 
		            text: '添加', 
		            iconCls: 'icon-add', 
		            handler: function() { 
		            	project_list_addFun();
		               // openDialog("add_dialog","add"); 
		            } 
		        }, '-', { 
		            text: '修改', 
		            iconCls: 'icon-edit', 
		            handler: function() { 
		             // openDialog("add_dialog","edit"); 
		            	project_list_updateFun();
		            } 
		        }, '-',{ 
		            text: '删除', 
		            iconCls: 'icon-remove', 
		            handler: function(){ 
		                delAppInfo(); 
		            } 
		        }]
		});
  		
		//初始化设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 10,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
			beforePageText : '第',//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
			/*onBeforeRefresh:function(){
			    $(this).pagination('loading');
			    alert('before refresh');
			    $(this).pagination('loaded');
			}*/
		});
		 
	});
//页面初始化结束


  
	/**
	 * 展开与关闭更多查询条件
	 * **/
	function selectmore() {
		// javascript:$('#p').panel('open')
		// javascript:$('#p').panel('close')
		// alert($('#selectmord').linkbutton("options").zhankai);
		if ($('#selectmord').linkbutton("options").zhankai == 1) {
			$('#selectmord').linkbutton({
				iconCls : 'icon-filter',
				text : '关闭更多条件',
				zhankai : 2
			});
			$('#selectmordpanel').panel('open');
		} else if ($('#selectmord').linkbutton("options").zhankai == 2) {
			$('#selectmord').linkbutton({
				iconCls : 'icon-filter',
				text : '展开更多条件',
				zhankai : 1
			});
			$('#selectmordpanel').panel('close');
		} else {
			alert("请确认button设置了zhankai参数.");
		}

	}
	
	/**
	 * 查询方法
	 * **/
	function project_list_searchFun(){
	 //	$('#list_data').datagrid('loader')
		//验证表单是否验证通过
			if(!$('#selectform').form('validate')){
			return $('#selectform').form('validate');
		}
	 $('#list_data').datagrid("options").url= "../ModuleMtController/getT_MT_MODULES.action";
	// serializeObject 在util.js中 将form表单元素的值序列化成对象
	 $('#list_data').datagrid('load', serializeObject($('#selectform')));
//        var queryParams = $('#list_data').datagrid('options').queryParams;   //获取参数
//        queryParams.state = 1;  //追加参数
//        $('#list_data').datagrid('options').queryParams=queryParams;        //重设参数
//        $("#list_data").datagrid('reload'); //重新加载 
 	}
 
 
	/**
	 * 清空方法
	 * **/
	function MTfrom_clear(){
		 
		$('#selectform').form("clear");
	}
	
	
	/**
	 * 增加项目
	 */
		function project_list_addFun() {
			
		   // project_list_datagrid.datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
			$('<div/>').dialog({
				href : '../ModuleMtController/moduleMT_add_index.action',
				width : 700,
				height : 420,
				modal : true,
				title : '项目添加',
				buttons : [{
					text : '增加',
					iconCls : 'icon-add',
					handler : function() {
						//验证表单是否验证通过
 						if(!$('#t_mt_module_addForm').form('validate')){
							return $('#t_mt_module_addForm').form('validate');
						}
						var d = $(this).closest('.window-body'); 
  						$('#t_mt_module_addForm').form('submit', {    
							url : '../ModuleMtController/moduleMT_add.action',
							onSubmit: function(param){
								 
 						    	try{//提交前额外传参  传递数文本值  没有实际意义
						    	 var t=$('#i_parent_id').combotree('tree');	// 获取树对象
						         var n = t.tree('getSelected');		// 获取选择的节点
  						     	  param.i_parent_text=n.text;
						    	}catch(e){
						    		alert(e);
						    	}
  						    },    
						    success:function(data){    
						    	try {
							    //    alert(data)    
  						        var data = $.parseJSON(data);
//									if (r.success) {
////										project_list_datagrid.datagrid('insertRow', {
////											index : 0,
////											row : r.obj
////										});
						    		var d = $(this).closest('.window-body'); 
						    		  d.dialog('destroy');
							        if(data.OperateState.result==1){
							        	 alert( "增加成功");
							             project_list_searchFun();
							        }else if(data.OperateState.result==2){
							        	 alert( "增加失败:"+data.OperateState.reuslt_hint);
							        }else{
							        	 alert( "增加异常:"+data.OperateState.reuslt_hint+" "+data.OperateState.reuslt_err);
							        }
							      
									 
 						    	} catch (e) {
 									 alert(e);
 								}
						    } ,
 	 						error:function(result){
 	 							 alert("访问异常:"+result);
	 						}
						});    
					//	$('#t_mt_module_addForm').submit();  
 					}
				}],
				onClose : function() {
					$(this).dialog('destroy');
				}
			});
		}
		
		
	 function project_list_updateFun(id){
		 /*
			if (id != undefined) {
				project_list_datagrid.datagrid('selectRow', id);
			}
			var rows = project_list_datagrid.datagrid('getChecked');
			console.info(rows);
			if(rows.length > 0){
			  $.messager.show({title : '提示',msg : '请选中一条记录进行修改!'});
			  */
		  project_list_datagrid.datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
			/*
			  return;
			}
			*/
			$('<div/>').dialog({
				href : '${pageContext.request.contextPath}/f/project_edit.html',
				width : 700,
				height : 420,
				modal : true,
				title : '项目修改',
				buttons : [ {
					text : '修改',
					iconCls : 'icon-edit',
					handler : function() {
						var d = $(this).closest('.window-body');
						$('#project_edit_editForm').form('submit', {
							url : '${pageContext.request.contextPath}/editprojectAction.html',
							
							success : function(result) {
								try {
									var r = $.parseJSON(result);
									if (r.success) {
										project_list_datagrid.datagrid('updateRow', {
											index : project_list_datagrid.datagrid('getRowIndex', id),
											row : r.obj
										});
										d.dialog('destroy');
									}
									$.messager.show({
										title : '提示',
										msg : r.msg
									});
								} catch (e) {
									$.messager.alert('提示', result);
								}
							}
						});
					}
				} ],
				onClose : function() {
					$(this).dialog('destroy');
				},
				onLoad : function() {
					var index = project_list_datagrid.datagrid('getRowIndex', id);
					var rows = project_list_datagrid.datagrid('getRows');
					var o = rows[index];
					$('#project_edit_editForm').form('load', o);
				}
			});
		 
	 }