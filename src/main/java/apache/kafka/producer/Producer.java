package apache.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {

    public static void run() {

        Properties config = new Properties();
        config.put("bootstrap.servers", "localhost:9092");
        config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(config);
        /* date : 2022-07-12 09:00:00
        *  author : hong-il
        *  description : ProducerRecord 의 Parameter 순서는 Topic, (Key : 파티셔닝 되어있을 시), Value 로 구성된다.
        * */
        ProducerRecord<String, String> producerRecord = new ProducerRecord<>("click_log", "login");

        producer.send(producerRecord);
        producer.close();
    }
}
