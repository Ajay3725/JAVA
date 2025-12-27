class employee
{
	String empid;
	String empName;

public void setempdetails(String id,String name)
{
	empid=id;
	empName=name;
}
public void getempDetails()
{
	System.out.println("--------emp detail-------");
	System.out.println("theater id:"+empid);
	System.out.println("therater name:"+empName);
}}

public class ArrayObject
{
	public static void main(String[] args)
	{
		employee emp[]=new employee[10];
		for(int i=0;i<2;i++)
		{	
			emp[i]=new employee();
		}
		System.out.println("------EMPLOYEE 1 DETAILS-----");
		emp[0].setempdetails("10001","ajay");
		emp[0].getempDetails();

		System.out.println("------EMPLOYEE 2 DETAILS-----");
		emp[1].setempdetails("1000","aja");
		emp[1].getempDetails();
}}


