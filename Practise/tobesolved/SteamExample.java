package tobesolved;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamExample {
public static void main(String[] args) {
	Set<String> platformFeature = Stream
			.of("accounts", "assessments", "authConfig", "automation", "catalog", "chargeback", "chargebackModel",
					"cloudsense", "configExplorer", "csi", "cluster", "customactions", "customization",
					"EmailTemplates", "ldapintegration", "lic", "macroUI", "metering", "personality", "policy",
					"scriptModule", "serviceRequest", "syslogfwd", "systemsettings", "userTemplates", "storage")
			.collect(Collectors.toSet());
	
	
	String str = "Feature package com.cloupia.feature.policy refers to a different feature package com.cloupia.feature.accounts";
	
	str = str.substring(0,str.indexOf(" refers to"));
	System.out.println(platformFeature);
	System.out.println(str);
}

}
