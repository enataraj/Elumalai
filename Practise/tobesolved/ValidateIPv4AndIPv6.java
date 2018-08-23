package tobesolved;

public class ValidateIPv4AndIPv6 {

	public static void validateIPv4Address(String ipAddress) {
		System.out.println(ipAddress);
		if (ipAddress == null || ipAddress.isEmpty()) {
			System.out.println("Ivalid IP Address 1 ");
			return;
		}

		if (!ipAddress.contains(".")) {
			System.out.println("Invalid IP Address 2 ");
			return;
		}

		String[] ipParts = ipAddress.split("\\.");
		if (ipParts.length != 4) {
			System.out.println("Invalid IP Address 3 ");
			return;
		}

		for (String ipPart : ipParts) {
			if (ipPart.length() > 1 && ipPart.startsWith("0")) {
				System.out.println("Invalid IP Address 4 ");
				return;
			}
			try {
				int ipPartNum = Integer.parseInt(ipPart);
				if (ipPartNum < 0 || ipPartNum > 255) {
					System.out.println("Invalid IP Address 5 ");
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid IP Address 6 ");
				return;
			}

		}

		System.out.println("Valid Ip Address");
	}

	public static void main(String[] args) {
		validateIPv4Address("10.1.1.1");
		validateIPv4Address("10.1.0.1");
		validateIPv4Address("10.1.01.1");
		validateIPv4Address("10.1.1A.1");
		validateIPv4Address("10.1.256.1");
		validateIPv4Address("10");
		validateIPv4Address("10.1.11");
	}
}
