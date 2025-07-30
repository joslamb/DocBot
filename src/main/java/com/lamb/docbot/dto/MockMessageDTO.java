package com.lamb.docbot.dto;


import java.sql.Timestamp;


public class MockMessageDTO {
    private String sender;
    private String message;
    private Timestamp timestapm;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestapm() {
        return timestapm;
    }

    public void setTimestapm(Timestamp timestapm) {
        this.timestapm = timestapm;
    }


}
