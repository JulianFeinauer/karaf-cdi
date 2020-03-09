package org.pragmaticminds.cdi.impl;

import org.pragmaticminds.karaf.DemoService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService2 {

    @Inject
    DemoService demoService;

    public UserService2() {
        System.out.println("Hello from CDI");
    }

    public void onStart(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("Hello from CDI: " + demoService.getMessage());
    }
}
