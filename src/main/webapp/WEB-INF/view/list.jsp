<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resource/css/css.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	function add(){
		location="/toAdd";
		}
</script>
<table>
<tr>
	<td colspan="10">
	<form action="">
	名称：<input type="text"  >
	<input type="submit" value="搜索">
	</form>
	<input type="button" value="删除" onclick="dels()">
	<input type="button" value="添加" onclick="add()">
	</td>
</tr>
	<tr style="width: 1200px">
		<td colspan="10">

<div style="width: 1200px">
	<c:forEach items="${list}" var="l">
		<div style="display: inline; width:300px; float:left; text-align:center; border: olive 3px blue;">
			<img alt="图片丢失了！！" src="/img/${l.img}"><br>
			<b style="font-size: 19px; color: red;">${l.privce} ￥</b>	<br>
			产品名称：${l.gname}	<br>
			品牌：${l.bname}<br>
			类型：${l.gk_name}<br>
			尺寸：${l.size}寸<br>
			产品价格${l.privce}<br>
			产品数量${l.count}<br>
			介绍：${l.tag}<br>
			<ul style="color: red;">
				<li style=" display: inline;">对比</li>
				<li  style=" display: inline;">❤关注</li>
				<li  style=" display: inline;">加入购物车</li>
			</ul>

		</div>
	</c:forEach>
	
</div>
</td>
	</tr>
<tr>
	<td colspan="10">
<b >${fenye}</b>	
	</td>
</tr>
</table>
</body>
</html>