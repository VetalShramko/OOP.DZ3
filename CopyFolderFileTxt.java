package dz2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFolderFileTxt {
	public static void copyFile(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			is.transferTo(os);
			System.out.println(in + " is copied");

		} catch (IOException e) {

			throw e;
		}
	}
	public static void copyFolder(File folderFrom, File folderTo) throws IOException {
		String text = "txt";
		if (!folderFrom.exists() || !folderTo.exists()) {
			throw new IllegalArgumentException();
		}
		File[] files = folderFrom.listFiles();
		for (int i = 0; i < files.length; i++) {
			String fileTxt = files[i].toString();
			fileTxt = fileTxt.substring(fileTxt.length() - 3);
			System.out.println(fileTxt);
			if (files[i].isFile() && fileTxt.equals(text)) {
				File out = new File(folderTo, files[i].getName());
				copyFile(files[i], out);
			}
		}
	}
	
}