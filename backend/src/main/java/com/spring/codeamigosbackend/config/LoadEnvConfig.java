package com.spring.codeamigosbackend.config;

import io.github.cdimascio.dotenv.Dotenv;

public class LoadEnvConfig {
    public static void load(){
        // In production , we can ignore if .env file is missing as it is expected that env variables will be set in the deployment platform
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(),entry.getValue()));
    }
}
