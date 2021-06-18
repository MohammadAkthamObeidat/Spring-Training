package com.AnnotationConfiguration.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class AnotherFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is returned from AnotherFortuneService Class";
    }
}
