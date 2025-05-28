package loops;
//13. Program for multiple if else statement(Largest number in 10,20 and 30)
public class multipleIfElse {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b && a>c) {
			System.out.println("a is largest");
		}
		else if(b>c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}

	}

}
