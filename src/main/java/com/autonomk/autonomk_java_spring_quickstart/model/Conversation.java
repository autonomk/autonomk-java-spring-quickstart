package com.autonomk.autonomk_java_spring_quickstart.model;

import java.util.List;

public class Conversation {


    public static class ChatContent {

        public String type;
        public String text;

        public String sender;

        public ChatContent(String type, String text, String sender) {
            this.type = type;
            this.text = text;
            this.sender = sender;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    public  static class ChatMessages {

        public ChatMessages(String id, ChatContent chatContent, Long createdAt, Long updatedAt, String parentId) {
            this.id = id;
            this.content = chatContent;
            this.createdAt = createdAt;
            this.UpdatedAt = updatedAt;
            this.parentId = parentId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ChatContent getChatContent() {
            return content;
        }

        public void setChatContent(ChatContent chatContent) {
            this.content = chatContent;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getUpdatedAt() {
            return UpdatedAt;
        }

        public void setUpdatedAt(Long updatedAt) {
            UpdatedAt = updatedAt;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String id;

        public ChatContent content;

        private Long createdAt;
        private Long UpdatedAt;

        public String parentId;

    }
    private String id;
    private String name;
    private Long createdAt;
    private Long UpdatedAt;
    private boolean isStarred;
    public List<ChatMessages> chatMessages;


    public Conversation(String id, String name, Long createdAt, Long updatedAt, boolean isStarred, List<ChatMessages> chatMessages) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.UpdatedAt = updatedAt;
        this.isStarred = isStarred;
        this.chatMessages = chatMessages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        UpdatedAt = updatedAt;
    }

    public boolean getIsStarred() {
        return isStarred;
    }

    public void setIsStarred(boolean starred) {
        isStarred = starred;
    }

    public List<ChatMessages> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessages> chatMessages) {
        this.chatMessages = chatMessages;
    }
}
