package com.autonomk.autonomk_java_spring_quickstart.dto.insertChat;

public class InsertChatRequestDto {
    private final String conversationId;
    private final String text;
    private final String sender;
    private final String type;
    private final String parentId;

    public InsertChatRequestDto(String conversationId, String text, String sender, String type, String parentId) {
        this.conversationId = conversationId;
        this.text = text;
        this.sender = sender;
        this.type = type;
        this.parentId = parentId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public String getType() {
        return type;
    }

    public String getParentId() {
        return parentId;
    }
}
