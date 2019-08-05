package threads;

public class RhymeReader implements Runnable{
	Thread t;
	String rhyme;
	DisplayRhymes obj;
	public RhymeReader(String rhyme, DisplayRhymes obj) {
		t=new Thread(this);
		this.rhyme=rhyme;
		this.obj=obj;
		t.start();
	}
	public void run() {
		 synchronized(obj){
			 obj.printRhymes(rhyme);
		 }
	}
}
