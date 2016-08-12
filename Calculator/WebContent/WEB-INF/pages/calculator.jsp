<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="../static/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="../static/js/calculator.js"></script>
<link href="<c:url value="/static/css/calculator.css" />" rel="stylesheet">
<link href="<c:url value="/static/css/jquery-ui.min.css" />" rel="stylesheet">
<link href="<c:url value="/static/css/jquery-ui.structure.min.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Calculator</title>
</head>
<body>
	<div class="ui-widget">
		<div class="ui-widget-header">
			<h1>Calculator</h1>
		</div>
		<div class="ui-widget-content">
			<textarea id="calculationTextBox" rows="2" cols="10" readonly></textarea>
			<button onclick="clearCalculation()" id="clearButton">Clear</button>
			<div class="keypad">
				<button onclick="enterNumber(7)">7</button>
				<button onclick="enterNumber(8)">8</button>
				<button onclick="enterNumber(9)">9</button>
				<button onclick="enterOperator('x')">x</button>
				<br>
				<button onclick="enterNumber(4)">4</button>
				<button onclick="enterNumber(5)">5</button>
				<button onclick="enterNumber(6)">6</button>
				<button onclick="enterOperator('-')">-</button>
				<br>
				<button onclick="enterNumber(1)">1</button>
				<button onclick="enterNumber(2)">2</button>
				<button onclick="enterNumber(3)">3</button>
				<button onclick="enterOperator('+')">+</button>
				<br>
				<button onclick="enterNumber(0)">0</button>
				<button onclick="enterDecimalPoint()">.</button>
				<button onclick="evaluateCalculation()">=</button>
				<button onclick="enterOperator('/')">/</button>
			</div>
		</div>
	</div>
</body>
</html>