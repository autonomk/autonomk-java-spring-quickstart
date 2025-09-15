package com.autonomk.autonomk_java_spring_quickstart.dto.chat;

public class ChatRequestDto {

    private String prompt;

    public ChatRequestDto(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
