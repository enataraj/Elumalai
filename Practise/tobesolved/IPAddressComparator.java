package tobesolved;

import java.util.Comparator;

public class IPAddressComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String[] firstAddrs = o1.split("\\.");
		String[] secondAddrs = o2.split("\\.");

		/*
		 * if (Integer.parseInt(firstAddrs[0]) >
		 * Integer.parseInt(secondAddrs[0])) { return 1; } else if
		 * (Integer.parseInt(firstAddrs[0]) < Integer.parseInt(secondAddrs[0]))
		 * { return -1; } else { if (Integer.parseInt(firstAddrs[1]) >
		 * Integer.parseInt(secondAddrs[1])) { return 1; } else if
		 * (Integer.parseInt(firstAddrs[1]) < Integer.parseInt(secondAddrs[1]))
		 * { return -1; } else { if (Integer.parseInt(firstAddrs[2]) >
		 * Integer.parseInt(secondAddrs[2])) { return 1; } else if
		 * (Integer.parseInt(firstAddrs[2]) < Integer.parseInt(secondAddrs[2]))
		 * { return -1; } else { if (Integer.parseInt(firstAddrs[3]) >
		 * Integer.parseInt(secondAddrs[3])) { return 1; } else if
		 * (Integer.parseInt(firstAddrs[3]) < Integer.parseInt(secondAddrs[3]))
		 * { return -1; } else { return 0; } } } }
		 */

		for (int i = 0; i < firstAddrs.length; i++) {
			if (Integer.parseInt(firstAddrs[i]) > Integer.parseInt(secondAddrs[i])) {
				return 1;
			} else if (Integer.parseInt(firstAddrs[i]) < Integer.parseInt(secondAddrs[i])) {
				return -1;
			} else {
				if (i == 3) {
					return 0;
				}

			}

		}

		return 0;

	}

}
