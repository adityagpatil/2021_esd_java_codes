class DecToBin{
	public static void main(String args[]){
		int decimal = 32;
		int i = 0;
		int[] binary = new int[20];
		for(i= 0; decimal > 0; i++){
			binary[i] = decimal % 2;
			decimal = decimal/2;
		}
		while(i >= 0){
			System.out.println(binary[i]);
			i--;
		}
	}
}