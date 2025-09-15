package com.autonomk.autonomk_java_spring_quickstart.controller.auth;

import com.autonomk.autonomk_java_spring_quickstart.dto.login.LoginRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.login.LoginResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.logout.LogoutRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.logout.LogoutResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.service.authService.AuthServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v0/auth")
public class AuthController {


    private final AuthServiceImpl _authservice;

    public AuthController(AuthServiceImpl authService) {
        this._authservice = authService;
    }

    public static class LoginRequest {
        private String username;
        private String password;

        // getters and setters
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequest){

        var loginResponse = _authservice.login();
        // replace this with
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(loginResponse);
    }


    @PostMapping("/refresh-token")
    public ResponseEntity<Map<String, String>> refreshToken(){
            // to implement
        return ResponseEntity
                .status(HttpStatus.NOT_IMPLEMENTED)
                .body(Map.of("message", "This endpoint is under construction. Please check back later."));
    }


    @PostMapping("/logout")
    public ResponseEntity<LogoutResponseDto> logout(@RequestBody LogoutRequestDto logoutRequestDto){
        return ResponseEntity.status(HttpStatus.OK).body(new LogoutResponseDto(""));
    }
}
