<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Snake1.1</title>
	<link href="../css/dial.css" rel="stylesheet" type="text/css" />   
</head>
<body>
    <div class="noscript"><h2 style="color: #ff0000">Seems your browser doesn't support Javascript! Websockets rely on Javascript being enabled. Please enable
    Javascript and reload this page!</h2></div>
    <div id="canvas-background-color" style="float: left" >
        <canvas id="playground" width="640" height="480"></canvas>
    </div>
    <div id="console-container">
        <div id="console"/>
    </div>
	<script type="application/javascript" src="../js/dial.js"></script>
</body>
</html>