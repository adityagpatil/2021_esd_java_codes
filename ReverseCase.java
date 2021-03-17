import java.util.Scanner;
class ReverseCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		c = (char)(c ^ 32);
		System.out.println(c);
	}
}