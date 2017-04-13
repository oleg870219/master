package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by oform on 4/10/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"entity"})
public class SpringConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{BeanHolder.class, SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/start/*"};
    }
}
