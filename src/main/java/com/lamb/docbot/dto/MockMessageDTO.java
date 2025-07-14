package com.lamb.docbot.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class MockMessageDTO {
    private String sender;
    private String message;
    private Timestamp timestapm;
}
