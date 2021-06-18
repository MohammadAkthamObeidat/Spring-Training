package com.AnnotationConfiguration.BeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AnotherFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is returned from AnotherFortuneService Class";
    }
}
