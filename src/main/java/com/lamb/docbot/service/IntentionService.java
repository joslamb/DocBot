package com.lamb.docbot.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lamb.docbot.model.Intention;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class IntentionService {

    private List<Intention> intentions;

    @PostConstruct
    public void loadIntentions() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream input = getClass().getClassLoader().getResourceAsStream("intentions.json");
            intentions = mapper.readValue(input, new TypeReference<List<Intention>>() {});

        } catch(Exception e) {
            e.printStackTrace();

            intentions = new ArrayList<>();
        }
    }

    public String detectIntention(String message) {
        message.toLowerCase();

        for (Intention intention : intentions) {
            for (String patron : intention.getExpressions()) {
                Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(message);

                if (matcher.find()) {
                    System.out.println(intention.getName());
                    return intention.getName();
                }
            }
        }
        return "Unknow intention";
    }
}
