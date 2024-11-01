package com.example.BE_PBL6_FastOrderSystem.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SocialConfig {

    @Value("${FBID}")
    private String facebookClientId;

    @Value("${FBSC}")
    private String facebookClientSecret;

    @Value("${GGID}")
    private String googleClientId;

    @Value("${GGSC}")
    private String googleClientSecret;

}
