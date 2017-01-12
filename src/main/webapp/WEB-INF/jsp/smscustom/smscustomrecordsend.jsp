<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<jsp:include page="/inc1.4.5.jsp"></jsp:include>
 <script type="text/javascript">

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
			idField : 'smsid',//唯一标识
			singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			columns:[[
			          {field:'smsid',title:'序列ID',width:100,align:'center'},
                       {field:'city',title:'城市',width:100,align:'center'},
                       {field:'county',title:'区县',width:100,align:'center'},
                        {field:'yeyfangshi',title:'幼儿园发送选择1全部 2自选 3排除',width:100,align:'center'},
                         {field:'youeryuan_xz_id',title:'选择幼儿园ID,号分割',width:100,align:'center'},
                          {field:'lyrole',title:'是否发送老师与园长 ',width:100,align:'center'},
                           {field:'lyshenfen',title:'发送老师园长身份.  1.老师与园长. 2.园长. 3.老师(剔除园长)',width:100,align:'center'},
                            {field:'lylogin',title:'老师园长 登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆',width:100,align:'center'},
                             {field:'lylogintext1',title:'老师园长已登陆天数',width:100,align:'center'},
                              {field:'lylogintext2',title:'老师园长超过登陆天数',width:100,align:'center'},
                               {field:'lyAPP',title:'老师园长是否安卓APP 1不限  2安装  3未安装',width:100,align:'center'},
                                {field:'lyiszx',title:'用户状态 1 不限  2正常  3退订',width:100,align:'center'},
                                 {field:'jzrole',title:'是否发送家长',width:100,align:'center'},
                                  {field:'jzrtj',title:'发送联系人 1全部 2第一 3第二',width:100,align:'center'},
                                   {field:'jzlogin',title:'家长登陆条件 1不限   2多少天已登陆天数   3超过多少天登陆',width:100,align:'center'},
                                    {field:'jzlogintext1',title:'已登陆天数',width:100,align:'center'},
                                     {field:'jzlogintext2',title:'超过登陆天数',width:100,align:'center'},
                                      {field:'jzAPP',title:'是否安装app',width:100,align:'center'},
                                       {field:'jziszx',title:'用户状态1正常 2退订市',width:100,align:'center'},
                                        {field:'jzrzsc',title:'入驻时长:',width:100,align:'center'},
                                        
                                        {field:'smscontent',title:'/短信内容',width:100,align:'center'},
                                        {field:'tfhaoma',title:'特服号码 1免费  2收费',width:100,align:'center'},
                                        {field:'fstype',title:'发送类型 1立即 2延时',width:100,align:'center'},
                                        
                                        {field:'lyissend',title:'是否发送完毕 1 完毕  2没有 老师',width:100,align:'center'},
                                        {field:'jzissend',title:'是否发送完毕 1 完毕  2没有 家长',width:100,align:'center'},
                                        {field:'lysendcount1',title:'预估发送总条数 老师',width:100,align:'center'},
                                        {field:'jzsendcount1',title:'预估发送总条数 家长',width:100,align:'center'},
                                        {field:'lysendcount2',title:'已发送总条数 老师',width:100,align:'center'},
                                        {field:'jzsendcount2',title:'已发送总条数 家长',width:100,align:'center'},
                                        {field:'lyExcmsg',title:'老师发送时异常内容',width:100,align:'center'},
                                        {field:'jzExcmsg',title:'家长发送时异常内容',width:100,align:'center'}
                                        
                      ]],
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ]
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
	 $('#list_data').datagrid("options").url= "../SmsCustomRecordController/getSmsCustomRecord.action";
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
	
	 
</script>
 
<form id="selectform" method="post">   
 	<div id="p" class="easyui-panel" data-options=" " align="left">
 			<label  style="" for="m_name" >模块名称:</label>
			<input  style="" class="easyui-validatebox"  type="text"
				id="m_name" name="m_name"  invalidMessage="不能超过5个字符！"  validType="length[0,5]"  data-options="" />
 			<label for="is_leaf" style="">否功能节点:</label>
			<select id="is_leaf" class="easyui-combobox"  style="width:200px;" panelAlign="left" editable="false" value="" name="is_leaf"  >   
			    <option></option>   
			    <option value="0">全部</option>   
			    <option value="1">功能模块</option>   
			     <option value="2">菜单模块</option> 
 			</select>  
		<a id="selectmord" style="float: right;" href="javascript:void(0);"
			class="easyui-linkbutton"
			data-options="iconCls:'icon-filter',plain:true,zhankai:1"
			onclick="selectmore();"> 展开更多条件</a>
			
			<a href="javascript:void(0);"
			style="float: right;" class="easyui-linkbutton"
			data-options="iconCls:'icon-cancel',plain:true"
			onclick="MTfrom_clear();">清空</a>
			
			 <a
			href="javascript:void(0);" style="float: right;"
			class="easyui-linkbutton"
			data-options="iconCls:'icon-search',plain:true"
			onclick="project_list_searchFun();">查询</a>
			
		<!-- 折叠条件部分 -->
	<div id="selectmordpanel" class="easyui-panel"
		data-options="closed:true,openAnimation:'slide',border:false" align="left">
		<div>
			<label for="dtm_insert_time1" >插入时间起:</label>
			<input class="easyui-datetimebox" name="dtm_insert_time1"   id="dtm_insert_time1" 
        data-options=" showSeconds:false" 
       validType="TimeCheck['dtm_insert_time2',1]"  invalidMessage="时间起需小于止" editable="false"
        value="" style="width:150px">  
 
			<label for="dtm_insert_time2" >插入时间止:</label>
		<input class="easyui-datetimebox" name="dtm_insert_time2"    id="dtm_insert_time2" 
		 validType="TimeCheck['dtm_insert_time1',2]" invalidMessage="时间止需大于起" editable="false"
        data-options=" showSeconds:false" value="" style="width:150px">  
     		</div>
 		<div>
			<label for="name22" >Name:</label>
			<input class="easyui-validatebox"  type="text"
				name="nam22" data-options="" />
			<label for="emai22"  >Email:</label>
			<input class="easyui-validatebox"  type="text"
				name="email22" data-options="validType:'email'" />
 		</div>
	</div>
 	</div>
</form>  
  
 
 <!-- 数据展示列表 -->   
<table id="list_data" cellspacing="0" cellpadding="0">
 <!--  	<thead>
		<tr>
			<th field="i_mod_id" width="100">模块id</th>
			<th field="v_mod_name" width="100">模块名称</th>
			<th field="i_parent_id" width="100">模块父id</th>
			<th field="dtm_insert_time" width="100">插入时间</th>
			<th field="i_order_id" width="100">排序]</th>
			<th field="v_modfile_id" width="100">模块唯一标识</th>
			<th field="is_leaf" width="100">节点类型</th>
			<th field="v_mod_url" width="100">模块路径</th>
			<th field="v_icon_url" width="100">图标路径</th>
			<th field="i_del_tag" width="100">是否删除</th>
 		</tr>
	</thead>-->
</table>


