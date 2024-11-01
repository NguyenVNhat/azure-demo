package com.example.BE_PBL6_FastOrderSystem.security;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Data
@Configuration
public class SocialConfig {

  @Value("${FACEBOOK_CLIENT_ID:default-client-id}")
    private String facebookClientId;

    @Value("${FACEBOOK_CLIENT_SECRET:default-client-secret}")
    private String facebookClientSecret;

    @Value("${GOOGLE_CLIENT_ID:default-google-id}")
    private String googleClientId;

    @Value("${GOOGLE_CLIENT_SECRET:default-google-secret}")
    private String googleClientSecret;



}
