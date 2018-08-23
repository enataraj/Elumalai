package tobesolved;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ReadingJarFile {

	public static void main(String args[]) throws IOException {

		String fileName = "C:\\inframgr.jar";
		File f = new File(fileName);
		if (f.exists()) {
			JarFile jarFile = new JarFile(f);
			Enumeration enum1 = jarFile.entries();
			while (enum1.hasMoreElements())
				process(enum1.nextElement());
		}

	}

	private static void process(Object obj) {
		JarEntry entry = (JarEntry) obj;
		if (entry.isDirectory()) {
			System.out.println("--");
			String name = entry.getName();
			if (name.startsWith("com/cloupia/feature/")) {
				// int position5 =
				// StringUtils.ordinalIndexOf("com/cloupia/feature/", "/", 4);
				// System.out.println("Position : "+position5);
				long size = entry.getSize();
				long compressedSize = entry.getCompressedSize();
				System.out.println(name + "\t" + size + "\t" + compressedSize);
			}
		}

	}

}
