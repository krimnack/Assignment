#import java.util.*

class Calc{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
	
		System.out.println(add(a,b));

	}

	static int add(int a, int b){

		int result = a+b;

		return result;
	}
	
