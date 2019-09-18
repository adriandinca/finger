package views.cydax;


import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named("cydaxView")
@FlowScoped("cydaxFlow")
public class CYDAXView implements Serializable {
	private static final long serialVersionUID = -2962984875710807175L;

	private String serviceRequest;
	private String country;
	private String agreement;
	private String company;
	private String partNumber;

}

