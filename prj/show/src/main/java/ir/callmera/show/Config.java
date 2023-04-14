package ir.callmera.show;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${path.multiple}")
    private String path;

    @Bean
    public void configure() {
        Constants.multiplePath = this.path;
    }
}
