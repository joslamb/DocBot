package com.lamb.docbot.model;

import java.util.List;


public class Intention {
    private String name;
    private List<String> expressions;

    public Intention(){};

    public List<String> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<String> expressions) {
        this.expressions = expressions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
