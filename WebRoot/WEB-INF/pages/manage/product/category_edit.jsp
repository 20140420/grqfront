<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<!-- <script src="${context_path}/js/public.js" type="text/javascript"></script> -->
<link href="${context_path}/css/style_ht.css" rel="stylesheet" type="text/css" />
<style>
<!--
td{font-size: 12px;}
-->
</style>
<s:push value="category">
	<s:form action="category_save" namespace="/admin/product">
		<s:hidden name="id"></s:hidden>
		<s:hidden name="level"></s:hidden>
		<s:hidden name="parent.id"></s:hidden>
		<div id="right">
		<div id="right_top"><img
			src="${context_path}/css/images/blue.gif" width="16" height="16" />
		<span class="word01">编辑商品类别</span></div>
		<div id="right_mid">
		<div id="tiao">
		<table width="685" height="24" border="0">
			<tr>
				<td width="105" height="22" bgcolor="#c6e8ff" align="right">类别名称：</td>
				<td><s:textfield name="name"></s:textfield></td>
			</tr>
		</table>
		</div>
		</div>
		<div id="right_foot"><s:submit type="image"
			src="%{context_path}/css/images/ht_02_18.gif"></s:submit></div>
		</div>
	</s:form>
</s:push>