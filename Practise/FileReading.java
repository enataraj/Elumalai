import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FileReading {

	public List<String> readFile(String fileName, String pat) {
		List<String> list = new ArrayList<String>();
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String className = sCurrentLine.substring(sCurrentLine.indexOf(pat) + pat.length(),
						sCurrentLine.length());
				list.add(className);
			}
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		System.out.println("Size of ArrayList : " + list.size());
		return list;
	}

	private static void findDuplicate(List<String> classes, String fileName) {
		HashMap<String, String> featureMap = new HashMap<>();
		HashMap<String, Integer> resultMap = new HashMap<>();
		List<String> nonDupEntries = new ArrayList<>();
		int tCount = 0;
		for (String str : classes) {
			nonDupEntries.add(str);
			if (featureMap.get(str) != null) {
				Integer count = resultMap.get(str);
				tCount++;
				if (count != null) {
					resultMap.put(str, count + 1);
				} else {
					resultMap.put(str, 1);
				}
			} else {
				featureMap.put(str, "");
			}
		}

		System.out.println("Feature Map Size : " + resultMap.size());
		System.out.println("Number of Class Dup : " + tCount);
		// resultMap.forEach((pkgName, count) -> System.out.println(pkgName +
		// "-----> " + count));

		// writeFile("C:\\Perf\\FirstFeatureEntries.txt", nonDupEntries);

		writeFile(fileName, resultMap,tCount);

	}

	private static void writeFile(String fileName, Map<String, Integer> resultMap,int tCount) {
		FileWriter fw;

		try {

			fw = new FileWriter(new File(fileName));
			fw.write("Total Number Class Duplicate Initialization  : "+tCount);
			fw.write(System.lineSeparator());
			fw.write("Number of Unique Class Duplicate : "+resultMap.size());
			fw.write(System.lineSeparator());
			fw.write(System.lineSeparator());
			fw.write(System.lineSeparator());
			

			Iterator<String> itr = resultMap.keySet().iterator();
			while (itr.hasNext()) {
				String key = itr.next();
				fw.write(key + " --> " + resultMap.get(key));
				fw.write(System.lineSeparator());
			}

			fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}

	public static void main(String[] args) {
		FileReading fr = new FileReading();
		System.out.println("Reading First Time Infra init File ");
		// First Time Infra
		List<String> classes1 = fr.readFile("C:\\Perf\\First_Infra_Init.txt", "Initializing schema for class ");
		findDuplicate(classes1, "C:\\Perf\\First_Infra_Init_Duplicate.txt");
		
		System.out.println("----------------------------");
		// First Time Feature
		System.out.println("Reading First Time Feature init File ");
		List<String> classes2 = fr.readFile("C:\\Perf\\First_Feature_Init.txt", "Initializing schema for class ");
		findDuplicate(classes2, "C:\\Perf\\First_Feature_Init_Duplicate.txt");
		System.out.println("----------------------------");
		// Restat Infra
		System.out.println("Reading Restart Infra init File ");
		List<String> classes3 = fr.readFile("C:\\Perf\\Restart_Infra_Init.txt", "Initializing schema for class ");
		findDuplicate(classes3, "C:\\Perf\\Restart_Infra_Init_Duplicate.txt");
		System.out.println("----------------------------");
		// Restat Feature
		System.out.println("Reading Restart Feature init File ");
		List<String> classes4 = fr.readFile("C:\\Perf\\Restart_Feature_Init.txt", "Initializing schema for class ");
		findDuplicate(classes4, "C:\\Perf\\Restart_Feature_Init_Duplicate.txt");
		System.out.println("----------------------------");
	}
}
