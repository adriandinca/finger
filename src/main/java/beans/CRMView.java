/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package beans;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("crmView")
@RequestScoped
public class CRMView {

    public String getTest() {
        return "TEST";
    }
}

