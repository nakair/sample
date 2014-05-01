package jp.co.itrade.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef="testAuditorAware")
//@EnableJpaRepositories
public class DomainConfig {

    @Bean
    public AuditorAware<String> testAuditorAware() {
        return () -> "sample-test";
    }
}
