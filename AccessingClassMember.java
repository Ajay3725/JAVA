class theatre
{
	String theatreid;
	String theatreName;

public void settheatredetails(String id,String name)
{
	theatreid=id;
	theatreName=name;
}
public void gettheratreDetails()
{
	System.out.println("--------theatre detail-------");
	System.out.println("theater id:"+theatreid);
	System.out.println("therater name:"+theatreName);
}}

public class AccessingClassMember
{
	public static void main(String[] args)
	{
		theatre theatre1=new theatre();
		theatre theatre2=new theatre();

		theatre1.settheatredetails("101","INOX");
		theatre2.settheatredetails("102","ROX");

		theatre1.gettheratreDetails();
		theatre2.gettheratreDetails();
}}