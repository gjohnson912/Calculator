var operand1 = null;
var operand2 = null;
var operator = null;

function enterNumber(number) {
	if (operator == null) {
		if (operand1 == null) {
			operand1 = number;
		} else {
			operand1 += "" + number;
		}
		$('#calculationTextBox').append(number);
		
	} else {
		if (operand2 == null) {
			operand2 = number;
		} else {
			operand2 += "" + number;
		}
		$('#calculationTextBox').append(number);
	}
}

function enterOperator(operator) {
	if (operand1 != null && operand2 == null) {
		this.operator = operator
		$('#calculationTextBox').append(operator);
	}
}

function enterDecimalPoint() {
	if (operator != null) {
		operand2 += ".";
	} else {
		operand1 += ".";
	}
	$('#calculationTextBox').append(".");
}

function evaluateCalculation() {
	if (operand1 != null && operand2 != null && operator != null) {
		var calculation = {
				'operand1': operand1,
				'operand2': operand2,
				'operator': operator
		}
		$.ajax({
			type: "POST",
			url: "../api/calculation",
			contentType: "application/json",
			dataType: "json",
			data: JSON.stringify(calculation),
			success: function(response) {
				$('#calculationTextBox').text(response);
				operand1 = response;
				operand2 = null;
				operator = null;
			},
			async: false
		});
	}
}

function clearCalculation() {
	$('#calculationTextBox').text("");
	operand1 = null;
	operand2 = null;
	operator = null;
}