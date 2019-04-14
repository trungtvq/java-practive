package co.overlead.main;

import co.overlead.kafka.IKafkaConstants;
import co.overlead.kafka.ProducerCreator;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.concurrent.ExecutionException;

public class ProducerMain {
    public static void main(String []args){
        runProducer();
    }
    static void runProducer() {
        Producer<Long, String> producer = ProducerCreator.createProducer();


        for (int index = 0; index < IKafkaConstants.MESSAGE_COUNT; index++) {
            //create msr
            ProducerRecord<Long, String> record = new ProducerRecord<Long, String>(IKafkaConstants.TOPIC_NAME,
                    "This is record " + index);

            try {
                RecordMetadata metadata = producer.send(record).get();
                System.out.println("Record sent with key " + index + " to partition " + metadata.partition()
                        + " with offset " + metadata.offset());
            }
            catch (ExecutionException e) {
                System.out.println("Error in sending record");
                System.out.println(e);
            }
            catch (InterruptedException e) {
                System.out.println("Error in sending record");
                System.out.println(e);
            }
        }
    }
}
