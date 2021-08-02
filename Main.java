package dz2;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File folderFrom = new File("QQQ");
		File folderTo = new File("WWW");
		try {
			CopyFolderFileTxt.copyFolder(folderFrom, folderTo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
File [] fileFolderTo= folderTo.listFiles();
for (int i = 0; i < fileFolderTo.length; i++) {
	System.out.println(fileFolderTo[i]+" "+"the file has been copied");
	
}
	}
}