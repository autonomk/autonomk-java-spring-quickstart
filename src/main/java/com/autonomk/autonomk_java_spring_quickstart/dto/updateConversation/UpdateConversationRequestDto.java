package com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation;

public class UpdateConversationRequestDto {
    private final String conversationId;
    private final String name;
    private final boolean isStarred;

    public UpdateConversationRequestDto(String conversationId, String name, boolean isStarred) {
        this.conversationId = conversationId;
        this.name = name;
        this.isStarred = isStarred;
    }

    public String getConversationId() {
        return conversationId;
    }

    public String getName() {
        return name;
    }

    public boolean isStarred() {
        return isStarred;
    }
}
