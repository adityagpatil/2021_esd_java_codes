class StaticExample{
	int a =10;
	void display(int x, int y){
		
		System.out.println("x value : "+x);
		System.out.println("y value : "+y);
	}
	
	public static void main(String args[]){
		int x = 10;
		int y = 20;
		StaticExample es = new StaticExample();
		es.display(x, y);
		System.out.println("value of a is:"+es.a);
	}
}
