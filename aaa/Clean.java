package test;

import java.io.File;

public class Clean {

	// あいうえお
	public static void main(String[] args) {
		delete(new File("/jsda/hulft"));
	}

	// 削除
	private static void delete(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				delete(f);
			}
		} else {
			file.delete();
		}
	}
}
