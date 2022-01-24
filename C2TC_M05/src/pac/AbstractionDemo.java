package pac;
abstract class Bank
{
	abstract float getRateOfInterest();
	
	void display()
	{
		System.out.println("Abstract Class");
	}
}
class SBI extends Bank
{

	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
	
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
        return 6.8f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		SBI obj = new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1 = new ICICI();                       //Dynamic Binding it happens at run time
		System.out.println(obj1.getRateOfInterest());


	}

}
