package views.cydax;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class CYDAXFlow implements Serializable {
	private static final long serialVersionUID = -1043990182823404691L;

	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {

		String flowId = "cydaxFlow";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId, 
				"/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();

		flowBuilder.returnNode("cydaxFlowReturn").fromOutcome("/cydaxFlow-home");

		return flowBuilder.getFlow();
	}

}
