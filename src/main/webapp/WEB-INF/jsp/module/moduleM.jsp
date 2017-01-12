<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<jsp:include page="/inc1.4.5.jsp"></jsp:include>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/modulejs/module/moduleM.js"  charset="utf-8">
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


