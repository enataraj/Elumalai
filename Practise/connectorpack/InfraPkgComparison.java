package connectorpack;

import java.util.Enumeration;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class InfraPkgComparison {

	private static Set<String> readClassesFromInframgr(String fileName) {
		Set<String> infraPkgs = new TreeSet<String>();
		JarFile infrmgrJar = null;
		int count = 0;
		try {
			String inframgrFilePath = "C:\\infraComp\\" + fileName;
			infrmgrJar = new JarFile(inframgrFilePath);
			Enumeration<? extends JarEntry> enumeration = infrmgrJar.entries();
			while (enumeration.hasMoreElements()) {
				count++;
				ZipEntry zipEntry = enumeration.nextElement();
				String zipEntryName = zipEntry.getName();
				if (zipEntryName.endsWith(".class")) {
					zipEntryName = zipEntryName.replace("/", ".");
					String pkgName = zipEntryName.replace(".class", "");
					if (pkgName.contains(".")) {
						pkgName = pkgName.substring(0, pkgName.lastIndexOf("."));
						if (!pkgName.startsWith("com.cloupia.feature")) {
							infraPkgs.add(pkgName);
						}
					}
				}
			}

			System.out.println("Number of Entries in " + fileName + " : " + count);

		} catch (Exception e) {
			System.out.println("Exception During inframgr jar reading : " + e);
		}

		finally {
			if (infrmgrJar != null) {
				try {
					infrmgrJar.close();
				} catch (Exception e) {
				}

			}
		}
		return infraPkgs;
	}

	public static void main(String[] args) {
		Set<String> gbInfraPkg = readClassesFromInframgr("inframgr_gb.jar");
		Set<String> cpInfraPkg = readClassesFromInframgr("inframgr_cp.jar");
		System.out.println("Size of gbInfraPkg  " + gbInfraPkg.size());
		System.out.println("Size of cpInfraPkg  " + cpInfraPkg.size());

		System.out.println("------------------------------------------------");
		System.out.println(" Missing Packages ");
		int count = 0;
		for (String pkgName : gbInfraPkg) {
			if (!cpInfraPkg.contains(pkgName)) {
				count++;
				System.out.println(pkgName);
			}
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("count : " + count);
		
		System.out.println("************************************");
		System.out.println(" Missing Packages ");
		 count = 0;
		for (String pkgName : cpInfraPkg) {
			if (!gbInfraPkg.contains(pkgName)) {
				count++;
				System.out.println(pkgName);
			}
		}
		System.out.println("************************************");
		System.out.println("count : " + count);
	}

}
