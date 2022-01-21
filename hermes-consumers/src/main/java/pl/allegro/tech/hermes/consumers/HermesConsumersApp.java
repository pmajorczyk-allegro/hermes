package pl.allegro.tech.hermes.consumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class HermesConsumersApp {

    public static void main(String[] args) {
        SpringApplication.run(HermesConsumersApp.class, args);
        HermesConsumers.main();
    }
}
