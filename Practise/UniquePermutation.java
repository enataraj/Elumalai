import java.util.ArrayList;
import java.util.List;

public class UniquePermutation {

	public UniquePermutation() {
		// TODO Auto-generated constructor stub
	}

	public List<List<Integer>> uniquePermutation(List<Integer> numbers) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		System.out.println(numbers);
		resultList.add(numbers);
		
		return resultList;
	}

	public static void main(String[] args) {
		UniquePermutation per = new UniquePermutation();
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		per.uniquePermutation(number);
	}
}
