package com.stephengream.skeleton.testutil;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by stephen on 5/12/16.
 */
@Component
public class InitialisationListener implements ApplicationListener<EmbeddedServletContainerInitializedEvent>{
    private int port;

    public int getPort() {
        return port;
    }

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        port = event.getEmbeddedServletContainer().getPort();
    }
}
