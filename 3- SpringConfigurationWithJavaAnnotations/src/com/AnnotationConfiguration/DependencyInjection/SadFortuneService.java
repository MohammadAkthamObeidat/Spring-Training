package com.AnnotationConfiguration.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is returned from Sad FortuneService class";
    }
}
