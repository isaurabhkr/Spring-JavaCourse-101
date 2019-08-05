package javaioExamples;
import java.io.File;
import java.io.FilenameFilter;

//FilenameFilter
public class TextFileFilter implements FilenameFilter{
	private String ext;
	public TextFileFilter(String ext)
	{
		this.ext="."+ext;
	}
	@Override
		public boolean accept(File dir, String fileName) {
		return fileName.endsWith(this.ext);
	}
}
