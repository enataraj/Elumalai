import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CreateAdjList {

	private static void buildAdjacencyList(String[] employeesInput, String[] friendshipsInput) {
		Map<String, List<String>> adjMap = new HashMap<>();
		for (int i = 0; i < employeesInput.length; i++) {
			String emplyeeDetail = employeesInput[i];
			String empId = emplyeeDetail.split(",")[0];
			adjMap.put(empId, new LinkedList<String>());
		}

		for (int i = 0; i < friendshipsInput.length; i++) {
			String[] fnds = friendshipsInput[i].split(",");
			String fnd1 = fnds[0];
			String fnd2 = fnds[1];
			adjMap.get(fnd1).add(fnd2);
			adjMap.get(fnd2).add(fnd1);

		}

		System.out.println(adjMap);

	}

	public static void main(String[] args) {
		String[] employeesInput = { "1,Richard,Engineering", "2,Erlich,HR", "3,Monica,Business", "4,Dinesh,Engineering",
				"6,Carla,Engineering", "9,Laurie,Directors" };
		String[] friendshipsInput = { "1,2", "1,3", "1,6", "2,4" };
		buildAdjacencyList(employeesInput, friendshipsInput);
	}

}
