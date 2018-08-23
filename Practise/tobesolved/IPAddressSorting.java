package tobesolved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IPAddressSorting {
	public static void sortIPAddress(List<String> ipAdds) {
		Collections.sort(ipAdds, new IPAddressComparator());
		System.out.println(ipAdds);
	}

	public static void main(String[] args) {
		String[] ipAdds = { "1.10.10.20", "100.1.1.1", "1.6.7.8", "20.10.10.3", "123.4.245.23", "104.244.253.29",
				"1.198.3.93", "32.183.93.40", "104.30.244.2", "104.244.4.1" };
		List<String> ipList = Arrays.asList(ipAdds);
		sortIPAddress(ipList);

	}

}
