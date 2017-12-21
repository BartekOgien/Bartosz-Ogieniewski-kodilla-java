package com.kodilla.kodillapatterns2.facade.api;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class FacadeWatcher {

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        log.info("Method processOrder has been running");
    }
}
