class Calculator{
	public static void main(String args[]){
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[2]);
		switch(args[1]){
			case "+" :System.out.println(number1 + number2);
			break;
			case "-" :System.out.println(number1 - number2);
			break;
			case "x" :System.out.println(number1 * number2);
			break;
			case "/" :System.out.println(number1 / number2);
			break;
			default: System.out.println("Invalid operator");
		}
	}
}