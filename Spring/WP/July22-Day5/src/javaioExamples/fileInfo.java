package javaioExamples;
import java.io.File;
public class fileInfo {

	public static void main(String[] args) {
		//buffer is thread safe
		// TODO Auto-generated method stub
		File file1=new File("data.txt");
		File file= new File("C:\\Work\\HSBC\\Spring\\WP\\July22-Day5");
		System.out.println("Exists:: "+file.exists());
		System.out.println("is File:: "+file.isFile());
		System.out.println("is Directory:: "+file.isDirectory());
		System.out.println("Parent "+file.getParent());
		System.out.println("Path "+file.getPath());
		System.out.println("Abs Path "+file.getAbsolutePath());
		//System.out.println("Len "+file.length()+" bytes");
		
		//list() return all the file names of the folder
		String fileNames[]=file.list(new TextFileFilter("txt"));
		for(String name: fileNames) {
			System.out.println(name);
		}
		
		File files[]=file.listFiles(new TextFileFilter("txt"));
		for(File f: files) {
			System.out.println(f.getName()+" : "+f.getAbsolutePath());
		}
	}

}
