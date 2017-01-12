<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div align="center">
<form id="t_mt_module_addForm" method="post">
<table width="98%" border="0" class="tableForm" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24">新增系统模块</td>
</tr>
</table>
<fieldset>
<legend align="left">模块主信息</legend>
<table width="98%" border="0" cellpadding="2" class="tableForm" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
	<tr align="left" bgcolor="#FAFAF1">
		<td width="15%">模块名称:</td>
		<td width="35%"><input type="text" name="v_mod_name" style="width:150px;"  class="easyui-validatebox" data-options="required:true" />&nbsp;</td>
		<td width="15%">模块父ID:</td>
		<td width="35%"><input type="text" id="i_parent_id" name="i_parent_id" style="width:150px;"  class="easyui-combotree" 
		data-options="url:'${pageContext.request.contextPath}/ModuleMtController/getmoudletree.action',method:'get',required:true" />&nbsp;</td>
	</tr>
	 <tr align="left" bgcolor="#FAFAF1">
		<td width="15%">是否功能节点:</td>
		<td width="35%">
			<select id="is_leaf" class="easyui-combobox" name="is_leaf" style="width:150px;">   
 			    <option value="1">功能模块</option>   
			     <option value="2">菜单模块</option> 
 			</select>  &nbsp;
		</td>
		<td width="15%">模块唯一标识:</td>
		<td width="35%"><input type="text" name="v_modfile_id" style="width:150px;"  class="easyui-validatebox" data-options="required:true" />&nbsp;</td>
	</tr>
		<tr align="left" bgcolor="#FAFAF1">
	   <td width="15%">模块排序:</td>
		<td width="35%"><input type="text" name="i_order_id" style="width:150px;"  class="easyui-numberbox" data-options="min:0,required:true" />&nbsp;</td>
 
		<td width="15%">模块URL:</td>
		<td width="35%"><input type="text" name="v_mod_url" style="width:150px;"  class="easyui-validatebox" data-options="required:true" />&nbsp;</td>
	</tr>
	
	<tr align="left" bgcolor="#FAFAF1">
		<td width="15%">备注:</td>
		<td width="80%" colspan="3"><textarea rows="3" style="width:400px;" name="v_remaker"></textarea>&nbsp;</td>
	</tr>
</table>
</fieldset>
<fieldset>
<legend align="left">模块辅助信息</legend>
<table width="98%" border="0" cellpadding="2" class="tableForm" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
 <tr align="left" bgcolor="#FAFAF1">
	<td width="15%">图标URL:</td>
	<td width="35%"><input type="text" name="v_icon_url" style="width:150px;"  class="easyui-validatebox" data-options="" />&nbsp;</td>
	<td width="15%">图片样式:</td>
	<td width="35%"><input type="text" name="v_mod_icons" style="width:150px;"  class="easyui-validatebox" data-options="" />&nbsp;</td>
</tr>
 </table>
</fieldset>
</form>
</div>