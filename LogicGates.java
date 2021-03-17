class LogicGates{
	int or_gate(int in1, int in2){
		int a, b;
		a = in1;
		b = in2;
		int or_ans;
		or_ans = a | b;
		return or_ans;
	}
	
	int nor_gate(int in1, int in2){
		int a, b;
		a = in1;
		b = in2;
		int nor_ans;
		if(a == 0 && b == 0){
			nor_ans = 1;
		}
		else{
			nor_ans = 0;
		}
		return nor_ans;
	}
	public static void main(String args[]){
		int inp1 = 0;
		int inp2 = 1;
		LogicGates or1 = new LogicGates();
		LogicGates nor1 = new LogicGates();
		int result_or = or1.or_gate(inp1, inp2);
		int result_nor = nor1.nor_gate(inp1, inp2);
		System.out.println("Result of  or_gate "+result_or);
		System.out.println("Result of  nor_gate "+result_nor);
		
	}
	
}

