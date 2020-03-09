package org.pragmaticminds.demo;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.pragmaticminds.karaf.DemoService;

@Component(immediate = true)
public class UserService {

    @Reference
    DemoService demoService;

    public UserService() {

    }

    @Activate
    void init() {
        System.out.println(demoService.getMessage());
    }
}
