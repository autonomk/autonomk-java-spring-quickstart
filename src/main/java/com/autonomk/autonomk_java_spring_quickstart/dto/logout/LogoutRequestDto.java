package com.autonomk.autonomk_java_spring_quickstart.dto.logout;

public class LogoutRequestDto {
    private String id;

    public LogoutRequestDto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
