package Stack;

public class StackIml implements IStack {
	protected int data[]; //store stack data
	protected int top; //maintain top of stack
	public static final int SIZE=6;
	public StackIml()
	{
		data = new int[SIZE];
		for(int i=0;i<data.length;i++) 
			data[i]=-1;		
		top=-1;
		System.out.println(" Stack is Intiliatized :)");
	}
	
	public void push(int element) {
		top+=1;
		data[top]=element;
	
	}
	
	public int pop() {
		int topdata=data[top];
		data[top]=-1;
		top-=1;
		return topdata;
	
	}
	
	public void printstack() {
		System.out.println("Contents of stack is");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println("");

	}
}
