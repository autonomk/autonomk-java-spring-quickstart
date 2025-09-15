package com.autonomk.autonomk_java_spring_quickstart.dto.createConversation;

public class CreateConversationRequestDto {

    private final String text;
    private final String name;
    private final String sender;
    private final String type;


    public CreateConversationRequestDto(String text, String name, String sender, String type) {
        this.text = text;
        this.name = name;
        this.sender = sender;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getSender() {
        return sender;
    }

    public String getType() {
        return type;
    }
}
