abstract class shape
{
	void draw()
	{
		System.out.println("drawing");
	}
	abstract void area();
	abstract void perimeter();
}

class rectangle extends shape
{
	private int length,breath;
	rectangle(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
		
	void area()
	{
		System.out.println("area of rectangle:"+(length * breath));
	}
		void perimeter()
	{
		System.out.println("permiter of rectangle:"+(length + breath));
	}
}
	
class square extends shape
{
	private int side;
	square(int side)
	{
		this.side=side;
	}
	void area()
	{
		System.out.println("area of square:"+(side * side));
	}
	void perimeter()
	{
		System.out.println("area of perimeter:"+(4 * side));
	}
}

class circle extends shape
{
	private double radius;
	final static double PI=3.14;

	circle(double radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("area of circle:"+(PI * radius * radius));	
	}
	void perimeter()
	{
		System.out.println("area of perimeter:"+(2*PI*radius));
	}
}

public class AbstractClass
{
	public static void main(String[] args)
	{
		shape s;
		
		s=new rectangle(3,5);
		s.area();
		s.perimeter();

		
		s=new square(5);
		s.area();
		s.perimeter();
	
		s=new circle(4.5);
		s.area();
		s.perimeter();
}}


































	