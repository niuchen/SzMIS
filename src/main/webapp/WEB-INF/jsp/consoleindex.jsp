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

<script>
//显示层
function divshow(name){

var num = $(".divshow");
		for(i=0;i<num.length;i++)
		{
		//alert(num.eq(i).attr("style")="display: none");
		 
		 document.getElementById(num.eq(i).attr("id")).style.display="none";
 		}
document.getElementById(name).style.display="";
//document.getElementById(name).scrollIntoView();


}
/**
*提交执行
*id 存储的是执行的那个模块功能的标识.  普通文本 可以通过 自定义属性typesin 批量获得文本内容
  slectzu 如果使用的是Easyui的下拉框不能用普通选择器得到对象 所以使用slectzu字符串和 ID 拼接  通过对象ID得到下拉框.
  URL是执行到那个控制器
*/
 function requestpost(id,url,slectzu){
 
	var num = $("input[typesin="+id+"]");
	var par='';
		if(slectzu!=""){
		 var slectzuarr=slectzu.split(",");
		 
		if(slectzuarr.length>1){
			for(var suni=0;suni<slectzuarr.length-1;suni++){
			  par+=slectzuarr[suni]+"="+$("#"+slectzuarr[suni]+"-"+id).combobox('getValue')+"&";
			}
 		}
		
		 
		 
		}
		for(i=0;i<num.length;i++)
		{
  		
		par+=num.eq(i).attr("id")+'='+num.eq(i).val()+"&";
 		}
		 
 		  $.ajax({ 
            url:url+"?"+par, 
            type:'GET', 
          //  dataType:'JSONP', 
            success: function(data){ 
               // $('body').append( "Name: " + data ); 
               
               var data = $.parseJSON(data);
               if(data.list!=null){
                 // alert(data.list);
                 var json=data.list;
                  var divs="";
                  var header="";
                  divs+="<table border='1' bordercolor='#000000' cellpadding='2' cellspacing='0'>";
                
                //是LIST类型的数据集
                 if(json[0]!=null){
                 
                   divs+="<tr>"  
				   for(var key in json[0]){
				     divs+="<td>"+key+"</td>"  
 				   }
				   divs+="</tr> "  
	 				 for(var i=0,l=json.length;i<l;i++){
	                divs+="<tr>"  
					   for(var key in json[i]){
					     divs+="<td>"+json[i][key]+"</td>"  
	 				   }
					   divs+="</tr> <br/>"  
	 				}  
 				}else{
 				//是对象的单数据
                    divs+="<tr>"  
	 				for(var key in json){
					     divs+="<td>"+key+"</td>"  
	 				   }
					   divs+="</tr> "  
 		 				
		                divs+="<tr>"  
						   for(var key in json){
						     divs+="<td>"+json[key]+"</td>"  
		 				   }
						   divs+="</tr> <br/>"  
		 				
 				}
 				divs+="</table>";
 			//	alert(divs);
                    //查询界面
					layer.open({
					  type: 1,
					  fix : false,
					  shadeClose:true,
					  skin: 'layui-layer-rim', //加上边框
					  area: ['1000px'], //宽高
					  content: divs
					});
               }else if(data.OperateState!=null){
                  //返回结果
					layer.open({
					  type: 1,
					  skin: 'layui-layer-rim', //加上边框
					  area: ['420px', '240px'], //宽高
					  content: data.OperateState.reuslt_hint
					});
               }else{
                 alert("数据返回空,或者错误的数据标识不能识别.");
               }
              
                 
            } 
 					}); 
}
</script>
</head>
<body>
	<div name="A1" id="A1"></div>
	<a href="javascript:void(0)" target="_self"
		onclick="document.getElementById('keleyihead').scrollIntoView();">回到底部</a>

	<table border="1" bordercolor="#000000" cellpadding="2" cellspacing="0"
		style="width: 1000">


		<%
			String ip = (String) request.getAttribute("ip");
			List list = (List) request.getAttribute("list");
			Map map = new HashMap();
			Map map2 = new HashMap();
			for (int i = 0; i < list.size(); i++) {
				Console con = (Console) list.get(i);
				String module = con.module;
				if (!map.containsKey(module)) {
					map.put(module, module);
		%>
		<tr style="width: 1000">
			<td width="1000"><%=module%></td>
			<%
				for (int k = 0; k < list.size(); k++) {
							Console con2 = (Console) list.get(k);
							String url2 = con2.url;
							String parameter2 = con2.parameter;
							String parametername2 = con2.parametername;
							String name2 = con2.name;
							String module2 = con2.module;
							String returnvar2 = con2.returnvar;
							if (module == module2) {
								if (!map2.containsKey(url2)) {
									map2.put(url2, url2);
			%>
			<td width="1000"><a href="javascript:void(0)" target="_self"
				onclick="divshow('<%=name2%>')"><%=name2%></a></td>
			<%
				}
							}
						}
			%>

		</tr>
		<%
			}
			}
		%>
	</table>


	<%
		for (int i = 0; i < list.size(); i++) {
			Console con = (Console) list.get(i);
			String url = con.url;
			String parameter = con.parameter;
			String parametername = con.parametername;
			String name = con.name;
			String module = con.module;
			String returnvar = con.returnvar;
			String[] selectpname = con.selectpname;
			String[] selectpurl = con.selectpurl;
			String[] selectpkey = con.selectpkey;
			String[] selectpvalue = con.selectpvalue;
			String slectzu="";//存储下拉框对象的ID前半部分.
	%>
	<div id="<%=name%>" class="divshow" style="display: none">
		<table border="1" bordercolor="#000000" cellpadding="2"
			cellspacing="0">
			<tr>
				<td></td>
			</tr>
			<tr>
				<td><font color="#1A42E6" size="5"><%=i + "(" + module + ")" + name%></font>
				</td>
			</tr>
			<tr>
				<td><%=returnvar%></td>
			</tr>
			<tr>
				<td><%=ip + url%></td>
			</tr>
			<tr>
				<td><%=parameter%></td>
			</tr>
			<tr>
				<td>
					<%
						if (parameter != null) {
								String parameterzu[] = parameter.split("&");
								for (String p : parameterzu) {
									int selectsun = -1;
									if (selectpname != null) {
										for (int h = 0; h < selectpname.length; h++) {
											//System.out.println(p.split("=")[0]
											//		+ " "
											//		+ selectpname[h]
											//		+ " "
											//		+ p.split("=")[0]
											//				.equals(selectpname[h]));
											if (p.split("=")[0].equals(selectpname[h])) {
												selectsun = h;
											}
										}
									}
								//	System.out.println(selectsun);
									
									if (selectsun == -1) {
									//如果不是下拉框 就当做文本.
					%> <font color="#F70909"> <%=p.split("=")[0]%>=</font> <input
					id="<%=p.split("=")[0]%>" typesin="<%=i%>"
					value="<%=p.split("=")[1]%>" type="text" /> <%
 					} else {
 					//如果是下拉框执行
 					slectzu+=p.split("=")[0]+","; //存储下拉框对象的ID的前半部分. 使用jquery easyui的下拉框空间. 由于空间KEY 和value 是不能是对象.所以重写了异步加载方法. 
 %> <%=p.split("=")[0]%>=<input id="<%=p.split("=")[0]+"-"+i%>" style="width:200px;"  class="easyui-combobox"
					data-options="
								 loader:function(param,success,error){  
     $.ajax({  
		url: '<%=selectpurl[selectsun]%>',  
		dataType: 'json',  
		success: function(data){ 
		adta=$.parseJSON(data); 
		data= data.list;
 		for(var zzz=0;data.length>zzz;zzz++){
		data[zzz].<%=selectpkey[selectsun]%>+='  '+data[zzz].<%=selectpvalue[selectsun]%>;
		}
		success(data);  
		},  
	     error: function(){  
		error.apply(this, arguments);  
		}  
		})
		},
		valueField: '<%=selectpvalue[selectsun]%>',
		textField: '<%=selectpkey[selectsun]%>' 
		"
		
		 />



					<%
						}
								}
							}
					%>
					<button id="<%=i%>button" onclick="requestpost(<%=i%>,'<%=url%>','<%=slectzu%>')">执行</button>
				</td>
			</tr>
		</table>
	</div>
	<%
		}
	%>
	<a href="javascript:void(0)" target="_self"
		onclick="document.getElementById('A1').scrollIntoView();">回到顶部</a>
	</div>
	<div id="keleyihead"></div>
</body>
</html>
