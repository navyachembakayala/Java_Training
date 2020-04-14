package Session13_TextFiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class EditTextFile_Class {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\abc.txt");
		FileUtils.write(file, "Java is programming language", "UTF-8", true);
		System.out.println(file);

	}

}
