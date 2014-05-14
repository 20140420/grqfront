<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<script src="${context_path}/js/public.js" type="text/javascript"></script>
<link href="${context_path}/css/style_ht.css" rel="stylesheet" type="text/css" />
<style>
<!--
td{font-size: 12px;}
-->
</style>

<form action="product_save" namespace="/pages" enctype="multipart/form-data" method="post">
 <div id="right">
	<div id="right_top">
		<img src="${context_path}/css/images/blue.gif" width="16" height="16" />
		<span class="word01">添加商品</span>
	</div>
	<div id="right_mid">
		<div id="tiao">
			<table width="685" height="24" border="0">
				<tr>
					<td colspan="2"><span style="color: red;"><s:fielderror></s:fielderror></span></td>
				</tr>
				<tr>
					<td class="product_add">商品名称：</td>
					<td><s:textfield name="name"></s:textfield></td>
				</tr>
				<tr>
					<td class="product_add" >选择类别：</td>
					<td>请输入</td>
				</tr>
				<tr>
					<td class="product_add">采购价格：</td>
					<td>请输入</td>
				</tr>
				<tr>
					<td class="product_add">市场价格：</td>
					<td>请输入</td>
				</tr>
				<tr>
					<td class="product_add">销售价格：</td>
					<td>请输入</td>
				</tr>
				<tr>
					<td class="product_add">是否为推荐：</td>
					<td><s:radio name="commend" list="#{'true':'是','false':'否'}"></s:radio></td>
				</tr>
				<tr>
					<td class="product_add">所属性别：</td>
					<td>请输入</td>
				</tr>
				<tr>
					<td class="product_add">上传图片：</td>
					<td>请输入<s:file id="file" name="file"></s:file></td>
				</tr>
				<tr>
					<td class="product_add">商品说明：</td>
					<td><s:textarea name="description" cols="50" rows="6"></s:textarea></td>
				</tr>
			</table>
		</div>
	</div>
	<div id="right_foot"><s:submit type="image"	src="%{context_path}/css/images/ht_02_18.gif"></s:submit></div>
 </div>
</form>
