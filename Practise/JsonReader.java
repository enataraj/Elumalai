import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader {

	public static Set<String> getPlatformFeature() {
		String fileName = "C:\\Project\\Code\\Cloupia\\src\\Platform_Connector.json";
		FileReader fileReader = null;
		Set<String> platformFeature = new HashSet<>();
		try {
			JsonParser parser = new JsonParser();
			File file = new File(fileName);
			if (file != null && file.exists()) {
				fileReader = new FileReader(file);
				JsonObject jsonArrayObject = (JsonObject) parser.parse(fileReader);
				JsonArray platformFeatureArray = jsonArrayObject.get("Platform_Connectors").getAsJsonArray();
				Iterator<JsonElement> iterator = platformFeatureArray.iterator();
				while (iterator.hasNext()) {
					platformFeature.add(iterator.next().getAsString());

				}

			}
		} catch (Exception e) {
			System.out.println(e + "Exception occured while reading " + fileName + " and exception is : ");
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

	public static void main(String[] args) {
		System.out.println(getPlatformFeature());
	}
}
