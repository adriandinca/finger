/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package views;


import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named("crmView")
@FlowScoped("crmFlow")
public class CRMView implements Serializable {
	private static final long serialVersionUID = -2962984875710807175L;

	public String getTest() {
        return "test..";
    }
}

