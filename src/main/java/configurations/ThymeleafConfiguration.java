package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
@ComponentScan("configurations")
public class ThymeleafConfiguration {
    @Bean
    @Scope("prototype")
    public TemplateMode defaultTemplateMode()
    {
        return TemplateMode.parse("LEGACY");
    }
}
