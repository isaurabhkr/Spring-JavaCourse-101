package RuntimeReflectPatterns;

import java.io.IOException;

public class testRunTime {
	
	public static void main(String[]args) throws IOException {
		Runtime r = Runtime.getRuntime();		
		System.out.println("Vavailbale Processors :: "+r.availableProcessors());
		System.out.println("Total Memory :: "+r.totalMemory());
		System.out.println("Free Memory :: "+r.freeMemory());
		
		for(int i=0;i<100000000;i++) {
			new testRunTime();
		}
		
		System.out.println("Free Memory after 10000 objects");
		System.out.println("Free Memory :: "+r.freeMemory());
		//r.freeMemory();
		System.gc();
		System.out.println("Free memory after gc()");
		System.out.println("Free Memory :: "+r.freeMemory());
		r.exec("Notepad");
	}

}
