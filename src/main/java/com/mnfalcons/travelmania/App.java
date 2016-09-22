package com.mnfalcons.travelmania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.mnfalcons.travelmania.service")
public class App {
    /**
     *
     * @param args
     */
    public static void main( String[] args ) {
        SpringApplication.run(App.class);
    }
}
