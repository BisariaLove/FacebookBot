import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by lovebisaria on 03/05/16.
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.ticketmaster.bot"})
@PropertySource({"classpath:application.properties" })
public class Application {
    @Autowired
    private Environment env;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
