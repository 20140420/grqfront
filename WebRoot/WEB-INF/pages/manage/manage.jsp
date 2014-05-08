<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:action name="manage_mbody" namespace="/pages" executeResult="true"></s:action>
    <div class="content">
    <h1>说明</h1>
    <p>请注意，这些布局的 CSS 带有大量注释。如果您的大部分工作都在设计视图中进行，请快速浏览一下代码，获取有关如何使用固定布局 CSS 的提示。您可以先删除这些注释，然后启动您的站点。要了解有关这些 CSS 布局中使用的方法的更多信息，请阅读 Adobe 开发人员中心上的以下文章：<a href=http://www.adobe.com/go/adc_css_layouts">http://www.adobe.com/go/adc_css_layouts</a>。您可以先删除这些注释，然后启动您的站点。若要了解有关这些 CSS 布局中使用的方法的更多信息，请阅读 Adobe 开发人员中心上的以下文章：<a href=http://www.adobe.com/go/adc_css_layouts" >http://www.adobe.com/go/adc_css_layouts</a>。</p>
    <h2>清除方法</h2>
    <p>由于所有列都是浮动的，因此，此布局在 .footer 规则中采用 clear:both 声明。此清除方法强制使 .container 了解列的结束位置，以便显示在 .container 中放置的任何边框或背景颜色。如果您的设计要求您从 .container 中删除 .footer，则需要采用其它清除方法。最可靠的方法是在最后一个浮动列之后（但在 .container 结束之前）添加 &lt;br class="clearfloat" /&gt; or &lt;div class="clearfloat"&gt;&lt;/div&gt;。这具有相同的清除效果。</p>
    <h3>徽标替换</h3>
    <p>此布局的 .header 中使用了图像占位符，您可能希望在其中放置徽标。建议您删除此占位符，并将其替换为您自己的链接徽标。 </p>
    <p> 请注意，如果您使用属性检查器导航到使用 SRC 字段的徽标图像（而不是删除并替换占位符），则应删除内嵌背景和显示属性。这些内嵌样式仅用于在浏览器中出于演示目的而显示徽标占位符。 </p>
    <p>要删除内嵌样式，请确保将 CSS 样式面板设置为“当前”。选择图像，然后在“CSS 样式”面板的“属性”窗格中右键单击并删除显示和背景属性。（当然，您始终可以直接访问代码，并在其中删除图像或占位符的内嵌样式。）</p>
    <h4>背景</h4>
    <p>本质上，任何 div 中的背景颜色将仅显示与内容一样的长度。这意味着，如果要使用背景颜色或边框创建侧面列的外观，将不会一直扩展到脚注，而是在内容结束时停止。如果 .content div 将始终包含更多内容，则可以在 .content div 中放置一个边框将其与列分开。</p>
    <!-- end .content --></div>
<s:action name="manage_mfooter" namespace="/pages" executeResult="true"></s:action>
  