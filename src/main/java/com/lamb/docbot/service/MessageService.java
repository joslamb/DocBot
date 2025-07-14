package com.lamb.docbot.service;

import com.lamb.docbot.dto.MockMessageDTO;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String processMessage(MockMessageDTO message){

        System.out.println(message);

        return "ok";
    }

}
