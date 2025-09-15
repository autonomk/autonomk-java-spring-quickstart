package com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation;

public class UpdateConversationResponseDto {
    private final String id;
    private final String name;
    private final Long createdAt;
    private final Long UpdatedAt;
    private final boolean isStarred;

    public UpdateConversationResponseDto(String id, String name, Long createdAt, Long updatedAt, boolean isStarred) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.UpdatedAt = updatedAt;
        this.isStarred = isStarred;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return UpdatedAt;
    }

    public boolean getIsStarred() {
        return isStarred;
    }
}
