package Session13_TextFiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFileMove_Class {

	public static void main(String[] args) throws IOException {

		File file1 = new File("E:\\abc.txt");
		File file2 = new File("E:\\Sortorder.txt");
		File dir = new File("E:\\dir");
		File file3 = new File("E:\\move.txt");
		
		FileUtils.copyFile(file1, file2);
		FileUtils.copyFileToDirectory(file1, dir);
		FileUtils.moveFile(file1, file3);
	}

}
