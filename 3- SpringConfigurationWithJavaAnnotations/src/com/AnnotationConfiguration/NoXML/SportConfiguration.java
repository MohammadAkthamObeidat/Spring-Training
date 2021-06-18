package com.AnnotationConfiguration.NoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// This will work exactly like XML Component scanning.
// We can delete this line if we are going to define all beans manually in the config file.
@ComponentScan("com.AnnotationConfiguration.NoXML")
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

    /**
     * Define a bean for our SadFortune Service.
     * @return a new instance on SadFortuneService.
     */
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    /**
     * Define a bean for our SwimCoach.
     * @return a new instance on SwimCoach.
     */
    @Bean
    public Coach swimCoach() {
        // Injection of happyFortuneService in the SwimCoach bean.
        return new SwimCoach(happyFortuneService());
    }

}
