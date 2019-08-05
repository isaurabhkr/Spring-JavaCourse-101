public class SubClass extends Super {
	int v;
	public SubClass() {
		this.v=-1;
		// TODO Auto-generated constructor stub
		System.out.println("Default of sub class");
	}

	/**
	 * @param var
	 */
	public SubClass(int var) {
		super(var);
		// TODO Auto-generated constructor stub
		this.v=v;
		System.out.println("Parametrized Cons of sub class");

	}
	public void displayv() {
		System.out.println(" v "+this.v);
	}
}
