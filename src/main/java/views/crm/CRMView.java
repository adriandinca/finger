package views.crm;


import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named("crmView")
@FlowScoped("crmFlow")
public class CRMView implements Serializable {
	private static final long serialVersionUID = -2962984875710807175L;

	public String getTest() {
        return "crm test!";
    }

	public String getTest2() {
        return "crm test2!";
    }

}

