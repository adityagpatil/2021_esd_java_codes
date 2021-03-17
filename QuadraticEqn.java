class QuadraticEqn{
	public static void main(String args[]){
		float a = 1;
		float b = 7;
		float c = 9;
		double x1, x2;
		x1 =(double) (-b + Math.sqrt((b*b) -(4*a*c)))/(2*a);
		x2 = (double)(-b - Math.sqrt((b*b) -(4*a*c)))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
	}
}