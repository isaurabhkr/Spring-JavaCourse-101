package Stack;

public class SafeStackImpl extends StackIml implements ISafeStack {

		
		public SafeStackImpl()
		{
			data = new int[SIZE];
			for(int i=0;i<data.length;i++) 
				data[i]=-1;		
			top=-1;
			System.out.println(" Stack is Intiliatized :)");
		}
	@Override
	public void push(int element) {
		if(!isFull()) {
		top+=1;
		data[top]=element;
		}
	}
	
	
	
	
	@Override
	public int pop() {
		if(!isEmpty()) {
		int topdata=data[top];
		data[top]=-1;
		top-=1;
		return topdata;
	}
		return -1;
	}
	
	@Override
	public boolean isFull() {
		if(top== SIZE -1)
			return true;
		return false;
			
	}
	@Override
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public void printstack() {
		System.out.println("Contents of stack is");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println("");

	}
}
