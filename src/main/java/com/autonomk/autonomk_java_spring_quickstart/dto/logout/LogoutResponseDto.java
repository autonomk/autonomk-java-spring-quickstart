package com.autonomk.autonomk_java_spring_quickstart.dto.logout;

public class LogoutResponseDto {
    private final String refreshToken;

    public LogoutResponseDto(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

}
