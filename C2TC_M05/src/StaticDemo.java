
public class StaticDemo {
	
	int a=10;
	int b;
	static int c=25;
	void func1()
	{
		System.out.println("The values are");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
	}
	
	static void func2()
	{
		int d=19;
		System.out.println("d value is "+d);
		System.out.println("c value is "+c);
	}
     
	static
	{
		System.out.println("Hi am in static block");
		//system.exit(0);
	}
	static
	{
		System.out.println("Hi am in static block2");
		//system.exit(0);
	}
	
	public static void main(String[] args) {
		  System.out.println("c value is "+StaticDemo.c);
		  StaticDemo obj = new StaticDemo();
		  obj.func1();
		  StaticDemo.func2();

	}

}
