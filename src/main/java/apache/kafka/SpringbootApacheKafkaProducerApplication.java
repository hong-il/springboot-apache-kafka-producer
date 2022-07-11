package apache.kafka;

import apache.kafka.producer.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApacheKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApacheKafkaProducerApplication.class, args);
        Producer.run();
    }

}
