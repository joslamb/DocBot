package com.lamb.docbot.service;

import com.lamb.docbot.dto.MockMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private IntentionService intentionService;

    public String processMessage(MockMessageDTO message){

        System.out.println(message);
        String msg = message.getMessage();
        String intencion = "";

        try {
             intencion = intentionService.detectIntention(msg);

            return intencion;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return "ok";
    }


}