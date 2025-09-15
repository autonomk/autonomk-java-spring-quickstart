package com.autonomk.autonomk_java_spring_quickstart.dto.getConversations;

public class GetConversationsResponseDto {

    private final String id;
    private final Long createdAt;

    private final Long updatedAt;

    private final String name;

    private final boolean isStarred;

    public GetConversationsResponseDto(String id, Long createdAt, Long updatedAt, String name, boolean isStarred) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.isStarred = isStarred;
    }

    public String getId() {
        return id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public boolean getIsStarred() {
        return isStarred;
    }
}
