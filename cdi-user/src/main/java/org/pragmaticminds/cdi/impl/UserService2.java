package org.pragmaticminds.cdi.impl;

import org.osgi.service.component.annotations.Component;
import org.pragmaticminds.karaf.DemoService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Component(immediate = true)
public class UserService2 {

    @Inject
    DemoService demoService;

    public UserService2() {

    }

    @PostConstruct
    void init() {
        System.out.println("Hello from CDI: " + demoService.getMessage());
    }
}
