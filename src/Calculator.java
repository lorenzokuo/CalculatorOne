
public class Calculator implements Operations {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result;
	
	public void setOperandOne(double x) {
		operandOne = x;
	}
	public void setOperation(String x) {
		operation = x;
	}
	public void setOperandTwo(double x) {
		operandTwo = x;
	}
	public void performOperation() {
		if (operation == "+") {
			result = operandOne+operandTwo;
		}
		if (operation == "-") {
			result = operandOne-operandTwo;
		}
	}
	public void getResults() {
		System.out.println(result);
	}
}
