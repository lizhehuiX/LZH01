<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery/jquery-3.2.1.js"></script>
<meta charset="UTF-8">
<script type="text/javascript">
	$(function(){
	$.ajax({
		type:"post",
		url:"/getBrandList",
		success:function(list){
		for(var i in list){
			$("[name='bId']").append("<option value='"+list[i].bid+"'>"+list[i].bname+"</option>");
			}	
			}
		});
	$.ajax({
		type:"post",
		url:"/getGKList",
		success:function(list){
		for(var i in list){
			$("[name='gkIs']").append("<option value='"+list[i].gk_id+"'>"+list[i].gk_name+"</option>")
			}	
			}
		});
	
		});
	function add(){
		var formData = new FormData($("form")[0]);
		$.ajax({
			type:"post",
			data:formData,
			url:"/add",
			contentType:false,
			processData:false,
			success:function(o){
			if(o){
				alert("发布成功");
				location="/list";
				}else{
				alert("发布失败！");
					}
				}
			});
		}
</script>
<title>Insert title here</title>
</head>

<body>
<form action="">
商品名称：<input type="text" value="" name="gname"> <br>
品牌：<select name="bId">
		<option>--选择--</option>
	</select> <br>
类型：<select name="gkIs">
		<option>--选择--</option>
	</select> <br>
尺寸<input type="text" value="" name="size"> <br>
	价格：<input type="text" value="" name="privce"> <br>
	数量：<input type="text" value="" name="count"> <br>
	介绍：<input type="text" value="" name="tag"> <br>
选择图片：<input type="file" value="" name="file"> <br>
<input type="button" value="发布" onclick="add()"> 
<a href="javascript:history.go(-1)"><input type="button" value="返回" > </a> 

</form>
</body>
</html>