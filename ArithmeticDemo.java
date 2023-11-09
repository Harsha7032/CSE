import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
ArithmeticOperations ao = new ArithmeticOperations();
 System.out.println("addition is : "+ao.addition(x, y));
int result1 = ao.multiplication(x, y);
int result2 = ao.substraction(x, y);
int result3 = ao.division(x, y);
System.out.println("substraction : "+result2);
System.out.println("multiplication : "+result1);
System.out.println("division : "+result3);
	}

}
