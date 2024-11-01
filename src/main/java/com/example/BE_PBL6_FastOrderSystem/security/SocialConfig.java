package com.example.BE_PBL6_FastOrderSystem.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SocialConfig {

    @Value("${FACEBOOK_CLIENT_ID}")
    private String facebookClientId;

    @Value("${FACEBOOK_CLIENT_SECRET}")
    private String facebookClientSecret;

    @Value("${GOOOGLE_CLIENT_ID}")
    private String googleClientId;

    @Value("${GOOGLE_CLIENT_SECRET}")
    private String googleClientSecret;

}
