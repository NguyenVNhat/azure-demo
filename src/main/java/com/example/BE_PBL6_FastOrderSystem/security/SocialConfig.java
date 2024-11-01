package com.example.BE_PBL6_FastOrderSystem.security;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Data
@Configuration
@PropertySource("classpath:application-secrets.properties")
public class SocialConfig {

    @Value("${FACEBOOK_CLIENT_ID}")
    private String facebookClientId;
    
    @Value("${FACEBOOK_CLIENT_SECRET}")
    private String facebookClientSecret;
    
    @Value("${GOOGLE_CLIENT_ID}")
    private String googleClientId;
    
    @Value("${GOOGLE_CLIENT_SECRET}")
    private String googleClientSecret;


}
