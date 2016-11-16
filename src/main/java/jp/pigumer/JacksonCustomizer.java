package jp.pigumer;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDateTime;

@Configuration
public class JacksonCustomizer implements Jackson2ObjectMapperBuilderCustomizer {

    @Bean
    CustomSerializer customSerializer() {
        return new CustomSerializer(LocalDateTime.class);
    }

    @Bean
    DemoModule demoModule() {
        return new DemoModule();
    }

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.modules(demoModule());
    }
}
