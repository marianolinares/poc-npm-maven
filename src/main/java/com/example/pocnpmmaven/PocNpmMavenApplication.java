package com.example.pocnpmmaven;

import com.inditex.infrastructure.PackingOrderCancellationEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocNpmMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocNpmMavenApplication.class, args);

        PackingOrderCancellationEvent p = new PackingOrderCancellationEvent();

    }

}
