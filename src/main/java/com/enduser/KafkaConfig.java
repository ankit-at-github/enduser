package com.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    //This method will be executed whenever the messages - locations are produced.
    //This method is not going to run on its own, how? - Using annotations.
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value){
        //You can save in database
        System.out.println(value);
    }

}
