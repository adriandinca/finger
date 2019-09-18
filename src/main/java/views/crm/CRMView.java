package views.crm;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named("crmView")
@FlowScoped("crmFlow")
public class CRMView implements Serializable {
	private static final long serialVersionUID = -2962984875710807175L;

	public String getServiceRequest() {
		return "SR-8" + (new Random().nextInt(899999999) + 100000000);
	}

	public String getCountry() {
		return randomString(asList("Romania", "China", "Germany", "United Kingdom"));
	}

	public String getAgreement() {
		return randomString(asList("PM Kit", "Break Fix"));
	}

	public String getCompany() {
		return randomString(asList("Vodafone", "Orange", "Microsoft"));
	}

	public String getPartNumber() {
		return randomString(asList("CX527-341", "CR649-823", "BR439-129"));
	}

	private String randomString(List<String> strings) {
		return strings.get(new Random().nextInt(strings.size()));
	}

}
