package ir.callmera.multiplier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${path.generate}")
    private String path;

    @Bean
    public void configure(){
        Constants.generatePath = this.path;
    }
}
