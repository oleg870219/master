package configuration;

import controller.MainController;
import entity.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oform on 4/13/2017.
 */
@Configuration
public class BeanHolder {

    @Bean
    public Country country() {
        return new Country();
    }

    @Bean
    public MainController mainController() {
        return new MainController();
    }
}
