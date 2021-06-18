package com.AnnotationConfiguration.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is returned from HappyFortuneService class!";
    }
}
