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
	$(function() {//初始化
		    $("#youeryuan_div").hide();  //隐藏幼儿园
 			$("#fslytable").hide();    //隐藏老师园长条件表单
			$("#fsjztable").hide();   //隐藏家长条件表单
			 $("#lylongin_tr").hide();//隐藏老师园长登陆条件表单
			 $("#jzlogin_tr").hide();//隐藏家长登陆条件表单
			 
			//初始化城市选择后的级联县区的事件.
		    $('#city').combobox({  
		        onHidePanel:function(){  
 		        	var cityid= $('#city').combo('getValues') ;
 		        	  var url = "getcounty.action?cityid="+cityid+"&t_="+Math.round(Math.random() * 10000);
                        $('#county').combobox({               
                            url : url 
						});
                    //  $('#county').combobox('reload',url);  
		        	
 		        }  
		    });  
			
	 
	});
	 function countyquaxuan(){
 	  // var countyid= $('#county').combo('getValues') ;
	   
	    $.messager.alert('提示',"暂未开发");  
		// $('#county').combobox('setValues', countyid);
 	 }
 	 
    function countyfanxuan(){
 	  // var countyid= $('#county').combo('getValues') ;
	    $.messager.alert('提示',"暂未开发"); 
		// $('#county').combobox('setValues', countyid);
 	 }
 

//幼儿园选择面板的隐藏与显示
	function onclickyeyfangshi(value) {
		if (value == 1) {
			$("#youeryuan_div").hide();
		} else {
			$("#youeryuan_div").show();
		}
	}
	//老师选择条件点击
	function islytj(){
 		var objs = document.getElementsByName('lyrole');
 		if(objs[0].checked) {
		   $("#fslytable").show();
		}
 		 if(!objs[0].checked) {
		   $("#fslytable").hide();
		}
 	}
	
	
	//家长选择条件点击
	function isjztj(){
 	     if ( $("#jzrole")[0].checked ){ 
 			 $("#fsjztable").show();
		 } else{
		 	$("#fsjztable").hide();
		 }
	}
	
	//查询检索幼儿园
	function getSchoollist(){
 		 	var val=$('input:radio[id="yeyfangshi"]:checked').val();
            if(val==null||1==val){
                     $.messager.alert('提示',"选择错误!"); 
                return false;
            }
 	    var name =$("#youeryuan_nametext").textbox('getText');//查询名称
	    var cityid= $('#city').combobox('getValues') ;
	    var countyid= $('#county').combobox('getValues') ;
 	    
	   $('#youeryuan_table').datagrid("options").url= "getSchoollist.action";
	// serializeObject 在util.js中 将form表单元素的值序列化成对象
	   $('#youeryuan_table').datagrid('load', {"name":name,"cityid":cityid+"","countyid":countyid+""});
	}
	
	
	
	function moveIn(){
    var checkeds = $('#youeryuan_table').datagrid('getChecked');
    var idStr = '';
     if(checkeds.length == 0){
      $.messager.alert("提示","请选择要移入的幼儿园!"); 
       return;
	 }
    for(var i = 0; i < checkeds.length; i++){
     // idStr += checkeds[i].id + ",";
    // alert( checkeds[i].schoolid);
         var isid=true;
         var checkedsxz = $('#youeryuan_xz_table').datagrid('getRows');
         for(var j = 0; j < checkedsxz.length; j++){
            if(checkedsxz[j].schoolid==checkeds[i].schoolid){
              isid=false;
              break;
            }
         }
          if(isid){
           $('#youeryuan_xz_table').datagrid('appendRow',checkeds[i]);
          }
    }
   
    
  }
  //移除选择的幼儿园
  function moveOut(){
       var checkeds = $('#youeryuan_xz_table').datagrid('getChecked');
   
     if(checkeds.length == 0){
        $.messager.alert("提示","请选择要移出的幼儿园!"); 
      return;
	 }
	  for(var i = 0; i < checkeds.length; i++){
	     var b = $("#youeryuan_xz_table").datagrid("getRowIndex", checkeds[i]);
         $("#youeryuan_xz_table").datagrid('deleteRow',b);
       }
    }
	
	//幼儿园登陆条件 如果安装 展开登陆条件  否则隐藏
	function lylongin_tris(isvar){
		if(isvar==2){
		 $("#lylongin_tr").show(); 
		}else{
		  $("#lylongin_tr").hide();
		}
	}
	
	//家长登陆条件 如果安装展开 否则隐藏
	function jzlogin_tris(isvar){
		if(isvar==2){
		 $("#jzlogin_tr").show(); 
		}else{
		  $("#jzlogin_tr").hide();
		}
	}
	var mapresult;
	/***提交按钮***/
	function smssubmit(){
 
    $('#smssubmitid').linkbutton('disable');
	
	    // var jzrole=      $("input[name='jzrole']:checked").map(function () {
   		
           $("#smscustomsendForm").form('submit', {  
            url : 'smssubmit_count.action',  
        //    dataType : 'text',  
            onSubmit: function(param){  
               var pm=getparam(param);
		   		 if(pm==false){
		   		   return false;
		   		 } 
		   		 param=pm;
 		   }  ,
            success : function(result) {  
              $('#smssubmitid').linkbutton('enable');
                 mapresult = $.parseJSON(result);  
                   $('#smssubwin').window('open');
                $("#smssubwin").panel("move",{top:$(document).scrollTop() + ($(window).height()-350) * 0.5}); //居中
                   $('#smssubwin_text').html("老师园长筛选后共"+mapresult.lycount+"人. 家长筛选后共:"+mapresult.jzcount+"人");
              /*****  
	            $.messager.confirm('确认','老师园长筛选后共'+map.lycount+"人. 家长筛选后共:"+map.jzcount+"人.  确认要发送短信吗?",
	            
	            function(r){    
				    if (r){    
				      $.messager.progress({
					        title:'短信发送,请等待...',
					        msg:'短信发送进度：',
					        interval: 0
					    });
				       //正式开始发送短信
					        $("#smscustomsendForm").form("submit", {    
							    url:"smssubmit.action",    
							    onSubmit: function(param){   
							        param.city= $('#city').combobox('getValues');
							        param.county= $('#county').combobox('getValues');
							        param.jzrole = jzrole.checked;    //家长
							        param.lyrole = lyrole.checked;  //是否发送老师
							        param.youeryuan_xz_id=youeryuan_xz_id;//幼儿园选择
							        param.lycount=map.lycount;
							        param.jzcount=map.jzcount;
							    } ,
						       success : function(result) {  
             				        map = $.parseJSON(result);  
             				       if(map.state==-1){
             				           alert(map.msg);
             				           $.messager.progress('close');
             				           clearInterval(timer);//关闭定时器
             				       }
             				   }   
						});  
						//定时器,定时查询发送进度
						 var timer = setInterval(function(){
			         $.ajax({
			                url: 'smssubmit_msg.action?id='+Math.random(),
			                success: function(data){
			                   // console.log(data);
			                  // var map = $.parseJSON(data);
 			                    if(data.msgstate != 0){
			                        $.messager.progress('bar').progressbar('setValue','100');
			                        clearInterval(timer);//关闭定时器
			                        $.messager.progress('close');
			                        alert("发送完毕."+data.msg);
			                    }else{
			                   //   alert(data.smssubmit_baifenbi);
 			                       $.messager.progress('bar').progressbar('options').text="{value}%"+data.msg;
			                       $.messager.progress('bar').progressbar('setValue',data.smssubmit_baifenbi);
  			                       //$.messager.progress.msg=data.smssubmit_baifenbi;
			                    }
			                },
			                error:function(e){
			                   clearInterval(timer);//关闭定时器
			                    //console.log(e.responseText);
			                    alert(e.responseText);
 			                }
			            }); 
			          }, 1000);  
				    }    
				}); 
      **/
            }  
        });  
            
  		
 	}
 	/**验证发送短信信息. 并且封装参数**/
 	function getparam(param){
 	   	  if(!$("#smscustomsendForm").form('validate')){
			  $('#smssubmitid').linkbutton('enable');
			   return false;
			}
	if(!$("#lyrole")[0].checked&&!$("#jzrole")[0].checked){
 	   $.messager.alert("提示","请选择发送老师园长,还是家长!"); 
	   $('#smssubmitid').linkbutton('enable');
	  return false;
	}
	   var youeryuan_xz_id='';//存储幼儿园选择数据的ID组 ,号分割
	   
 	   if(!$("#yeyfangshi")[0].checked){
	   	   var checkedsxz = $('#youeryuan_xz_table').datagrid('getRows');//获得幼儿园选择数据
 		   if(checkedsxz.length>300){
 		      $.messager.alert("提示","程序暂未做幼儿园大数据条件分割查询,暂不支持300个以上幼儿园的条件发送短信!");
		      $('#smssubmitid').linkbutton('enable');
		     return false;
		   }
		   if(checkedsxz.length<1){
 		      $.messager.alert("提示","请至少选择一个幼儿园!");
		      $('#smssubmitid').linkbutton('enable');
		     return false;
		   }
		   for(var  i=0; i<checkedsxz.length;i++){//拼接幼儿园数据
		    if(i+1==checkedsxz.length){
		      youeryuan_xz_id+=checkedsxz[i].schoolid
		    }else{
		      youeryuan_xz_id+=checkedsxz[i].schoolid+",";
		     }
		   }
 	   }
	  
		 var lyrole = document.getElementsByName('lyrole');//得到是否发送老师园长复选
 	           if(lyrole[0].checked==true){
	                	var lyapp=document.getElementsByName('lyAPP');
	                //	alert(lyapp[1].checked+"APP安装");
					  	   if(lyapp[1].checked){//选择的已安装
						      var lylogin=document.getElementsByName('lylogin');
 	 //  alert(lylogin[1].checked);
 					 	      if(lylogin[1].checked){
 					  //     alert($("#lylogintext1").numberbox('getValue'));
					  	        if($("#lylogintext1").numberbox('getValue')==''){
 					 	          $.messager.alert("提示","请填写老师园长最近登陆天数!");
					 	           $('#smssubmitid').linkbutton('enable');
					 	          return false;
						        }
						      }
						      if(lylogin[2].checked){
						        if($("#lylogintext2").numberbox('getValue')==''){
						          $.messager.alert("提示","请填写老师园长超过多少登陆天数!");
 					 	           $('#smssubmitid').linkbutton('enable');
					 	          return false;
						        }
						      }
						   }
	           }
	           //家长条件验证
	            var jzrole = document.getElementsByName('jzrole');//得到是否发送老师园长复选
	             if(jzrole[0].checked==true){
	                	var jzapp=document.getElementsByName('jzAPP');
	                //	alert(lyapp[1].checked+"APP安装");
					  	   if(jzapp[1].checked){//选择的已安装
						      var jzlogin=document.getElementsByName('jzlogin');
 	 //  alert(lylogin[1].checked);
 					 	      if(jzlogin[1].checked){
 					  //     alert($("#lylogintext1").numberbox('getValue'));
					  	        if($("#jzlogintext1").numberbox('getValue')==''){
 					 	           $.messager.alert("提示","请填写家长最近登陆天数!");
					 	           $('#smssubmitid').linkbutton('enable');
					 	          return false;
						        }
						      }
						      if(jzlogin[2].checked){
						        if($("#jzlogintext2").numberbox('getValue')==''){
 					 	          $.messager.alert("提示","请填写家长超过多少登陆天数!");
					 	           $('#smssubmitid').linkbutton('enable');
					 	          return false;
						        }
						      }
						   }
	           }
 	           var pm=param;
	             pm.city= $('#city').combobox('getValues');
				 pm.county= $('#county').combobox('getValues');
				 pm.jzrole = jzrole.checked;    //家长
				 pm.lyrole = lyrole.checked;  //是否发送老师
				 pm.youeryuan_xz_id=youeryuan_xz_id;//幼儿园选择
				 return pm;
	           
 	}
 	
 	/***确认发送短信***/
 	function smssubmityes(){
			 	var smsvalidation_text=  $("#smsvalidation_text").textbox('getText');	
			 	if(smsvalidation_text==null){
 			 	    $.messager.alert("提示","请输入验证码!");
			 	}
  	   				  
				       //正式开始发送短信
					        $("#smscustomsendForm").form("submit", {    
							    url:"smssubmit.action",    
							    onSubmit: function(param){ //提交验证
 							    	var pm=getparam(param);
								 	if(pm==false){
								 	 $.messager.alert("提示","发生数据参数错误.终止发送.!");
 								 	 $('#smssubwin').window('close');
								 	  return false;
								 	}  
							        param=pm;
							        param.lycount=mapresult.lycount;
							        param.jzcount=mapresult.jzcount;
							        param.smsvalidation_text=smsvalidation_text;
							         $.messager.progress({
								        title:'短信发送,请等待...',
								        msg:'短信发送进度：',
								        interval: 0
								    });
 							        
							    } ,
						       success : function(result) {  
						              clearInterval(timer);//关闭定时器
             				          map = $.parseJSON(result);  
             				          $.messager.progress('close');
              				       if(map.state==-1){
                				             $.messager.alert("异常",map.msg);
             				       }else{
               				            $.messager.alert("提示","发送结束:"+map.msg);
              				            $('#smssubwin').window('close');
             				       }
             				   }   
						});  
						//定时器,定时查询发送进度
						 var timer = setInterval(function(){
			         $.ajax({
			                url: 'smssubmit_msg.action?id='+Math.random(),
			                success: function(data){
			                   // console.log(data);
			                  // var map = $.parseJSON(data);
 			                    if(data.msgstate != 0){
			                      //  $.messager.progress('bar').progressbar('setValue','100');
			                       // $('#smssubwin').window('close');
			                      //  clearInterval(timer);//关闭定时器
 			                       // alert("发送完毕."+data.msg);
			                    }else{
			                   //   alert(data.smssubmit_baifenbi);
 			                       $.messager.progress('bar').progressbar('options').text="{value}%"+data.msg;
			                       $.messager.progress('bar').progressbar('setValue',data.smssubmit_baifenbi);
  			                       //$.messager.progress.msg=data.smssubmit_baifenbi;
			                    }
			                },
			                error:function(e){
			                   clearInterval(timer);//关闭定时器
			                    //console.log(e.responseText);
			                    alert(e.responseText);
 			                }
			            }); 
			          }, 1000); 
 	}
 	
var InterValObj; //timer变量，控制时间
var count = 60; //间隔函数，1秒执行
var curCount;//当前剩余秒数

function sendMessage() {
    
    var gettextbox= $("#smscontent").textbox('getText');	 
  　curCount = count;
　　//设置button效果，开始计时
     $("#btnSendCode").attr("disabled", "true");
     $("#btnSendCode").val(" " + curCount + "秒后可以重新获取短信");
     InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
　　  //向后台发送处理数据
     $.ajax({
     　　type: "POST", //用POST方式传输    
     　　dataType: "text", //数据格式:JSON
     　　url: 'smsvalidation.action', //目标地址
    　　 data: "dealType=1&uid=1&lycount"+mapresult.lycount+"&jzcount="+mapresult.jzcount+"&smscontent="+gettextbox ,
    　　 error: function (XMLHttpRequest, textStatus, errorThrown) { },
     　　success: function (msg){ }
     });
}

//timer处理函数
function SetRemainTime() {
            if (curCount == 0) {                
                window.clearInterval(InterValObj);//停止计时器
                $("#btnSendCode").removeAttr("disabled");//启用按钮
                $("#btnSendCode").val("重新发送验证码");
            }
            else {
                curCount--;
                $("#btnSendCode").val(" " + curCount + "秒后可以重新获取短信");
            }
        }
</script>
</script>
<div align="center">
	<form id="smscustomsendForm" method="post">
		<table width="98%" border="0" class="tableForm" cellpadding="2"
			cellspacing="1" bgcolor="#D1DDAA" align="center"
			style="margin-top:8px">
			<tr bgcolor="#E7E7E7">
				<td height="24">自定义短信发送---</td>
			</tr>
		</table>
		
		
		<fieldset>
			<legend align="left">短信发送范围</legend>
			<fieldset>
			<legend align="left">区域</legend>
			<table width="98%" border="0" cellpadding="2" class="tableForm"
				cellspacing="1" bgcolor="#D1DDAA" align="center"
				style="margin-top:8px">
				<tr align="left" bgcolor="#FAFAF1">
					<td>城市:</td>
					<td><select id="city" class="easyui-combobox" multiple="true"
						style="width:250px;"
						data-options="    
	            panelWidth:450,   
	            valueField:'areaid' ,
 	            textField:'areaname', 
 	            editable:false,   
	            url:'getcity.action'   
	        "></select>
						&nbsp;</td>
					<td>县区:</td>
					<td><select id="county" class="easyui-combogrid"  multiple="true"
						style="width:250px;"
						data-options="    
          	      panelWidth:450,  
          	       editable:false,     
          		  valueField:'areaid' ,
 	              textField:'areaname' 
        "></select>
        	<a href="#" class="easyui-linkbutton" plain="true" onclick="countyquaxuan();">全选</a>
        	<a href="#" class="easyui-linkbutton" plain="true"  onclick="countyfanxuan();">反选</a>
						&nbsp;</td>
				</tr>

			</table>
		</fieldset>
			
			<fieldset>
			<legend align="left">幼儿园</legend>
			<table width="98%" border="0" cellpadding="2" cellspacing="1"
				bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr align="left" bgcolor="#FAFAF1">
					<td> <input type="radio" value="1" title="全部" checked="checked"
						id="yeyfangshi" name="yeyfangshi" onclick="onclickyeyfangshi(1)" />全部
						  <input type="radio" value="2" title="自选"
						id="yeyfangshi" name="yeyfangshi" onclick="onclickyeyfangshi(2)" />  自选
					  <input type="radio" value="3" title="排除"
						id="yeyfangshi" name="yeyfangshi" onclick="onclickyeyfangshi(3)" />  排除 
 				   </td>
 				</tr>
				<tr>
					<td colspan="3">
						<div id="youeryuan_div">
							<table>
								<tr>
									<td>
										<div>
											幼儿园名称:<input class="easyui-textbox" id="youeryuan_nametext"
												data-options="iconCls:'icon-search'" style="width:300px">
											<a href="#" class="easyui-linkbutton" plain="true" onclick="getSchoollist();">检索</a>
										</div>
										<div>
											<table id="youeryuan_table" class="easyui-datagrid"
												style="height: 300; width: 500"
												data-options="
											        fitColumns:true,
 													 pagination:true, <%-- 显示分页   --%>
													loadMsg:'正在加载，请稍候',
													rownumbers:true,
											 	 	fitColumns:false 
								 					  ">
												<thead>
													<tr>
														<th field="ck" checkbox="true" ></th>
														<th data-options="field:'schoolid',width:100,hidden:true" >幼儿园ID</th>
														<th data-options="field:'schoolname',width:150">幼儿园名称</th>
 														<th data-options="field:'uparname',width:100">城市</th>
														<th data-options="field:'areaname',width:100">区县</th>
														<th data-options="field:'address',width:150">幼儿园地址</th>
													</tr>
												</thead>
											</table>
										</div></td>
 									<td>
										<div>
											<a href="#" class="easyui-linkbutton" plain="true" onclick="moveIn();">选中-></a>
											 
										</div>
										<div>
											<a href="#" class="easyui-linkbutton" plain="true" onclick="moveOut()"><-清除</a>
 										</div></td>
									<td>
									<div>已选择的幼儿园数据</div>
									<table id="youeryuan_xz_table" class="easyui-datagrid"
												style="height: 300; width: 500"
												data-options="
											        fitColumns:true,
											       
													<%-- pagination:true,  显示分页   --%>
													loadMsg:'正在加载，请稍候',
													rownumbers:true,
											 	 	fitColumns:false 
								 					  ">
												<thead>
													<tr>
														<th field="ck" checkbox="true"></th>
														<th data-options="field:'schoolid',width:100,hidden:true">幼儿园ID</th>
														<th data-options="field:'schoolname',width:150">幼儿园名称</th>
 														<th data-options="field:'uparname',width:100">城市</th>
														<th data-options="field:'areaname',width:100">区县</th>
														<th data-options="field:'address',width:150">幼儿园地址</th>
													</tr>
												</thead>
											</table>
									<!-- 
									<select id="yeyfangshivalue" size="15" multiple name="yeyfangshivalue"
										style="width: 500;heigth:800">
										<option value="1">幼儿园1</option>
										<option value="2">幼儿园2</option>
										<option value="3">幼儿园3</option>
										<option value="4">幼儿园4</option>
										<option value="5">幼儿园5</option>
										<option value="6">幼儿园6</option>
  									</select> -->
 									</td>
								</tr>
 							</table>
 						</div></td>
				</tr>
			</table>
				</fieldset>
		</fieldset>
		
		
			<fieldset>
			<legend align="left">老师,园长条件(条件是'&与'的关系)</legend>
			     <input   type="checkbox" id="lyrole" name="lyrole" value="1" onclick="islytj();" />是否发送老师和园长
 			  <table width="98%" border="0" cellpadding="2" cellspacing="1"
				bgcolor="#D1DDAA" align="center" style="margin-top:8px"  id="fslytable">
		 	 <tr align="left" bgcolor="#FAFAF1">
				  <td> 
				     发送身份:
				     <input type="radio" value="1" id="lyshenfen" name="lyshenfen" checked="checked" />老师与园长
				     <input type="radio" value="2" id="lyshenfen" name="lyshenfen" />园长
				     <input type="radio" value="3" 	id="lyshenfen" name="lyshenfen"/>老师(剔除是园长角色的)
				  </td>
				</tr>
				
				 <tr align="left" bgcolor="#FAFAF1">
				  <td> 
				     APP是否安装:
				     <input type="radio" value="1" id="lyAPP" name="lyAPP" checked="checked" onclick="lylongin_tris(1);"/>不限(不使用此条件)
				     <input type="radio" value="2" id="lyAPP" name="lyAPP" onclick="lylongin_tris(2);"/>安装APP(登陆过至少1次)
				     <input type="radio" value="3" 	id="lyAPP" name="lyAPP" onclick="lylongin_tris(3);"/>没有安装APP(没有登陆过1次)
				  </td>
				</tr>
 				 <tr align="left" bgcolor="#FAFAF1" id="lylongin_tr">
					  <td> 
 					   登陆条件:  <input type="radio" value="1" id="lylogin" name="lylogin" checked="checked"/>
 					                  不限(不使用此条件)
 							<input type="radio" value="2" id="lylogin" name="lylogin"/>最近
							<input type="text" id="lylogintext1" name="lylogintext1" class="easyui-numberbox"  style="width: 50" data-options="min:0"></input>  
								天登陆过
							<input type="radio" value="3" id="lylogin" name="lylogin"/>超过
							<input type="text" id="lylogintext2"  name="lylogintext2"  class="easyui-numberbox" style="width: 50"  data-options="min:0"></input>  
								天未登陆过	
	 				  </td>
				</tr>
 				
					<tr align="left" bgcolor="#FAFAF1">
				  <td> 
				        是否订购乐贝通:
				      <input type="radio" value="1" id="lyiszx" name="lyiszx" />不限(不使用此条件)
 				      <input type="radio" value="2" id="lyiszx" name="lyiszx" checked="checked"/>订购(订购乐贝通集团业务)
				      <input type="radio" value="3" id="lyiszx" name="lyiszx" />注销(已退订乐贝通集团业务)
  				  </td>
				</tr>
			  </table>
		  </fieldset>
		  
		  
		  	<fieldset>
			<legend align="left">家长条件(条件是'&与'的关系)</legend>
 			   <input name="jzrole" type="checkbox" id="jzrole" value="1" onclick="isjztj();" />是否发送家长
			  <table width="98%" border="0" cellpadding="2" cellspacing="1" id="fsjztable"
				bgcolor="#D1DDAA" align="center" style="margin-top:8px">
 			<!--  
 				<tr align="left" bgcolor="#FAFAF1">
				  <td> 
				          联系人条件:
				      <input type="radio" value="1" id="jzrtj" name="jzrtj" checked="checked"/>不限(不使用此条件)
				      <input type="radio" value="2" id="jzrtj" name="jzrtj"/>第一联系人
				      <input type="radio" value="3" id="jzrtj" name="jzrtj"/>第二联系人
			 
 				  </td>
				</tr>--!>
				<!--  
				<tr align="left" bgcolor="#FAFAF1">
				  <td> 
				            业务条件:
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="1" />亲子视窗
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="2" />报平安
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="3" />平安成长
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="4" />健康档案
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="5" />童忆成长
				       <input name="jzywtj" type="checkbox" id="jzywtj" value="0" />未开通
 				  </td>
				</tr>-->
					<tr align="left" bgcolor="#FAFAF1">
				  <td> 
				     APP是否安装:
				      <input type="radio" value="1" id="jzAPP" name="jzAPP" checked="checked" onclick="jzlogin_tris(1)"/>不限(不使用此条件)
				      <input type="radio" value="2" id="jzAPP" name="jzAPP" onclick="jzlogin_tris(2)"/>安装APP(至少登陆过1次)
				      <input type="radio" value="3" id="jzAPP" name="jzAPP" onclick="jzlogin_tris(3)"/>没有安装APP(一次没有登陆过)
				  </td>
				</tr>
					<tr align="left" bgcolor="#FAFAF1" id="jzlogin_tr">
					  <td> 
 					   登陆条件:  <input type="radio" value="1" 
							id="jzlogin" name="jzlogin" checked="checked"/>不限(不使用此条件)
 							<input type="radio" value="2" id="jzlogin" name="jzlogin"/>最近
							<input type="text" id="jzlogintext1" name="jzlogintext1" class="easyui-numberbox"  style="width: 50" data-options="min:0"></input>  
								天登陆过
							<input type="radio" value="3" id="jzlogin" name="jzlogin"/>超过
							<input type="text" id="jzlogintext2" name="jzlogintext2" class="easyui-numberbox" style="width: 50"  data-options="min:0"></input>  
								天未登陆过	
	 				  </td>
				</tr>
			
 			  <tr align="left" bgcolor="#FAFAF1">
				  <td> 
				        用户订购状态:
				      <input type="radio" value="1" id="jziszx" name="jziszx" />不限(不使用此条件)
				      <input type="radio" value="2" id="jziszx" name="jziszx" checked="checked"/>订购正常,没有离园
				      <input type="radio" value="3" id="jziszx" name="jziszx" />订购正常,已经离园
				      <input type="radio" value="4" id="jziszx" name="jziszx" />已经退订,已经离园
  				  </td>
				</tr>
					<tr align="left" bgcolor="#FAFAF1">
				  <td> 
				       入驻时长:
				     <input type="text" id="jzrzsc" name="jzrzsc" class="easyui-numberbox"  style="width: 50" data-options="min:0"></input>天  (乐贝通手机号录入至今时长   不输入不做限制) 
  				  </td>
				</tr>
			  </table>
		  </fieldset>
		  
		  
		  	<fieldset>
			   <legend align="left">短信内容</legend>
			    <table width="98%" border="0" cellpadding="2" cellspacing="1"
				bgcolor="#D1DDAA" align="center" style="margin-top:8px">
					<tr align="left" bgcolor="#FAFAF1">
					  <td>  
					  	<input class="easyui-textbox" id="smscontent" name="smscontent" data-options="required:true,multiline:true,min:1,max:200" 
					  	 style="width:800px;height:100px">
 					   </td>
					</tr>
				</table>
		   </fieldset>
		   
		  	<fieldset>
			   <legend align="left">发送条件</legend>
			    <table width="98%" border="0" cellpadding="2" cellspacing="1"
				bgcolor="#D1DDAA" align="center" style="margin-top:8px">
					<tr align="left" bgcolor="#FAFAF1">
					  <td>  
					      特服号码选择:
					  	  <input type="radio" value="1" id="tfhaoma" name="tfhaoma" checked="checked"/>免费特服号码
				          <input type="radio" value="2" id="tfhaoma" name="tfhaoma" />收费特服号码选择
 					   </td>
					</tr>
						<tr align="left" bgcolor="#FAFAF1">
					  <td>  
					      发送类型:
					  	  <input type="radio" value="1" id="fstype" name="fstype" checked="checked"/>立即发送
				          <input type="radio" value="2" id="fstype" name="fstype" disabled="disabled" />延时发送
				          <input class="easyui-datetimebox" name="fstype_time"  disabled="disabled"    id="fstype_time" 
        data-options=" showSeconds:false" 
         editable="false"
        value="" style="width:150px">  
 					   </td>
					</tr>
					
						 
				</table>
		   </fieldset>
 		   <a href="#" id="smssubmitid" class="easyui-linkbutton" style="width:100" onclick="smssubmit();">提交</a>
		  
	</form>
 
 <div id="smssubwin" class="easyui-window" title="是否确定发送短信"   
        data-options="iconCls:'icon-save',modal:true,closed:true,minimizable:false,maximizable:false">   
        <div id="smssubwin_text"></div>
        <div>
          	 短信验证(发送给领导):
					  	  <input class="easyui-textbox" id="smsvalidation_text" data-options="" style="width:300px"> 
  						  <input id="btnSendCode" type="button" value="发送验证码" onclick="sendMessage()" /></p>
  						    <a href="#" id="smssubmitid" class="easyui-linkbutton" style="width:100" onclick="smssubmityes();">确定</a>
  						      <a href="#" id="smssubmitid" class="easyui-linkbutton" style="width:100" onclick="$('#smssubwin').window('close');">关闭</a>
        </div>
    
</div>  

 

	