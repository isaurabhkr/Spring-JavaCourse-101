
public class Super {
	int var;
	public Super()
	{
		var +=1;
		System.out.println("Default");	
	}
	
	public Super(int var)
	{
		this.var =var;
	}
	public void displayvar() {
		System.out.println(" v "+this.var);
	}
}
