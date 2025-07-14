package com.lamb.docbot.controller;

import com.lamb.docbot.dto.MockMessageDTO;
import com.lamb.docbot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docApi/messages")
public class MockMessageController {

    @Autowired MessageService messageService;

    @PostMapping("/messageHandler")
    public ResponseEntity<MockMessageDTO> incomingMessage (@RequestBody MockMessageDTO message){

        messageService.processMessage(message);

        return ResponseEntity.ok(message);
    }
}
