
class Box
{
	float width;
	float height;
	float depth;
	String color;
	
	
	float calcVol()
	{
		return width*height*depth;
	}
	String col()
	{
		return color;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		
		Box box1=new Box();
	//  Box1=new Box();   //other method
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		box1.color="green";
		float Vol=box1.calcVol();
		String co=box1.col();
		System.out.println("Volume of Box 1 is "+Vol+" and its colors is "+co);
		
		
		Box box2=new Box();
		box2.width=3.1f;
		box2.height=2.3f;
		box2.depth=1.1f;
		box2.color="red";
		
		float Vol2=box2.calcVol();
		String co2=box2.col();
		System.out.println("Volume of Box 2 is "+Vol2+" and its color is "+co2);

	}

}
