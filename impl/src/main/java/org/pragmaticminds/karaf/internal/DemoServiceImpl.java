package org.pragmaticminds.karaf.internal;

import org.osgi.service.component.annotations.Component;
import org.pragmaticminds.karaf.DemoService;

@Component(immediate = true)
public class DemoServiceImpl implements DemoService {

    public String getMessage() {
        return "Hello";
    }

}
