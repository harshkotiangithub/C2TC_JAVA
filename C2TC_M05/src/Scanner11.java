import java.util.Scanner;

public class Scanner11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is "+(a+b));
		Scanner11 obj=new Scanner11();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());

	}

}
