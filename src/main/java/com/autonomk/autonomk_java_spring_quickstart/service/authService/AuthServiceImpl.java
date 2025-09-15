package com.autonomk.autonomk_java_spring_quickstart.service.authService;

import com.autonomk.autonomk_java_spring_quickstart.dto.login.LoginResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements IAuthService {
    @Override
    public LoginResponseDto login() {

        return new LoginResponseDto("test", new LoginResponseDto.MetaData(null));
    }
}
