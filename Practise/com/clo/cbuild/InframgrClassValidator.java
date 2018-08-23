package com.clo.cbuild;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class InframgrClassValidator {

	public static Set<String> getPlatformFeature() {
		String fileName = "InframgrIgnorePkgList.json";
		FileReader fileReader = null;
		Set<String> platformFeature = new HashSet<>();
		try {
			JsonParser parser = new JsonParser();
			File file = new File(fileName);
			if (file != null && file.exists()) {
				fileReader = new FileReader(file);
				JsonObject jsonArrayObject = (JsonObject) parser.parse(fileReader);
				JsonArray platformFeatureArray = jsonArrayObject.get("Inframgr_Ignore").getAsJsonArray();
				Iterator<JsonElement> iterator = platformFeatureArray.iterator();
				while (iterator.hasNext()) {
					platformFeature.add(iterator.next().getAsString());
				}
			}
		} catch (Exception e) {
			System.out.println("Exception occured while reading " + fileName + " and exception is : " + e);
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e) {

				}
			}
		}
		return platformFeature;
	}

	public static String getTime() {
		String dateStr = "";
		DateFormat format = new SimpleDateFormat("-ddMMMYY-HH-mm");
		dateStr = format.format(Calendar.getInstance().getTime());
		return dateStr;
	}

	private static Set<String> readclassesFromInframgr(String inframgr_jar_file) {
		Set<String> inframgrClasses = new TreeSet<String>();
		try {
			JarFile jar = new JarFile(inframgr_jar_file);
			Enumeration<? extends JarEntry> enumeration = jar.entries();
			while (enumeration.hasMoreElements()) {
				ZipEntry zipEntry = enumeration.nextElement();
				if (zipEntry.getName().endsWith(".class")) {
					String className = zipEntry.getName();
					className = className.replace(".class", "").replace("/", ".");
					if (!className.startsWith("com.cloupia.feature")) {
						inframgrClasses.add(className);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception During inframgr jar reading : " + e);
		}
		return inframgrClasses;
	}

	private static Set<String> getClassesFromClassesDir(String classDirPath) {
		Set<String> classes = new TreeSet<String>();
		try {
			File classDir = new File(classDirPath);
			for (final File fileEntry : classDir.listFiles()) {
				if (fileEntry.getName().endsWith(".java")) {
					String className = fileEntry.getName();
					classes.add(className);
					System.out.println("Class : " + className);
				}

			}
		} catch (Exception e) {
			System.out.println("Exception during classes reading : " + e);
		}

		return classes;
	}

	public static void main(String[] args) {
		String dateStr = getTime();
		String dist = null;
		String cfiles = null;
		if (args.length >= 2) {
			dist = args[0];
			cfiles = args[1];
		}
		Set<String> inframgrClasses = new TreeSet<>();
		String inframgr_jar_file = "C:\\inframgr.jar";
		dist = "C:\\inframgr.jar";
		cfiles = "E:\\Cloupia\\ConnectorPack\\CloupiaCodebase\\bin";
		if (dist == null || cfiles == null) {
			return;
		}
		try {
			getClassesFromClassesDir("C:\\Project\\Code\\Cloupia\\src");

			File featureRefErrorsFile = new File("INFRAMGR_DISCREPANCY_CLASSES" + dateStr + ".log");

			PrintWriter errLog = new PrintWriter(new FileWriter(featureRefErrorsFile));
			errLog.println("\n\n");
			errLog.flush();
			errLog.close();
		} catch (Exception e) {

		}
	}

}
