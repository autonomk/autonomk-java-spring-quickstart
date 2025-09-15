package com.autonomk.autonomk_java_spring_quickstart.dto.login;

public class LoginResponseDto {
    public static class MetaData{
        public String userId;

        public MetaData(String userId) {
            this.userId = userId;
        }

    }


    public LoginResponseDto(String token, LoginResponseDto.MetaData metaData) {
        this.token = token;
        this.metaData = metaData;
    }

    public String token;

    public LoginResponseDto.MetaData metaData;
}
