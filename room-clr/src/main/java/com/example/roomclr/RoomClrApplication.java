package com.example.roomclr;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomClrApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoomClrApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
			System.out.println("Counting starts:");
            for(int i = 1 ; i <= 100 ; i++){
				System.out.println(i);
			}
        };
    }
}
