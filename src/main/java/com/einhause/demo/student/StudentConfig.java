package com.einhause.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    1L,
                    "maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, DECEMBER, 5)
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, DECEMBER, 6)
            );
            repository.saveAll(List.of(maria, alex));
        };
    }
}
