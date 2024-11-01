package com.example.BE_PBL6_FastOrderSystem.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SocialConfig {

    @Value("${3733164560230312}")
    private String facebookClientId;

    @Value("${f28538ebb45667825aeeb30333df17ac}")
    private String facebookClientSecret;

    @Value("${684504390647-3n31glri0v6tt6ackrf2rq1hfpsb6m23.apps.googleusercontent.com}")
    private String googleClientId;

    @Value("${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}")
    private String googleClientSecret;

}
