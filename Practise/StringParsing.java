
public class StringParsing {

	public static void main(String[] args) {
		String indexPat = " feature package ";
		String errs[] = {
				"Feature package com.cloupia.feature.networkController.api refers to a different feature package com.cloupia.feature.customactions.configs",
				"Feature package com.cloupia.feature.hypervController.wftasks refers to a different feature package com.cloupia.feature.policy",
				"Main package com.cloupia.model.cNS refers to feature package com.cloupia.feature.networkServices.util",
				"Feature package com.cloupia.feature.accounts refers to a different feature package com.cloupia.feature.vmwareController.utils" };
		for (String err : errs) {
			String depPkgName = err.substring(err.indexOf(indexPat) + indexPat.length(), err.length());
			System.out.println(depPkgName);
		}

	}
}
