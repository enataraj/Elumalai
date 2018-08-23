import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {

	public EmployeeSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("EElumalai");
		list.add("BElumalai");
		list.add("CElumalai");
		list.add("AElumalai");
		Collections.sort(list);
		System.out.println(list);
	}
}
