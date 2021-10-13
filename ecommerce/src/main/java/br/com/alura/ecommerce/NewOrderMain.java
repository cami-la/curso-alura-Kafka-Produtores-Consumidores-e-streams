package br.com.alura.ecommerce;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Map;
import java.util.Properties;

public class NewOrderMain {
    public static void main(String[] args) {
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties());
    }

    private static Properties properties() {
        return null;
    }
}
