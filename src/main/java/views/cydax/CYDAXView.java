package views.cydax;


import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named("cydaxView")
@FlowScoped("cydaxFlow")
public class CYDAXView implements Serializable {
	private static final long serialVersionUID = -2962984875710807175L;

	public String getTest() {
        return "test..";
    }
}

