package com.mwangi.smartapplication.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student daniel=new Student(
                    127l,
                    "Daniel",
                    LocalDate.of(2002, Month.JANUARY,3),

                    "dani3@yahoo.com"

            );
            Student mwangi=new Student(
                    197l,
                    "Mwangi",
                    LocalDate.of(2001, Month.JANUARY,3),

                    "daniele33@yahoo.com"

            );
            Student waithera=new Student(
                    187l,
                    "Waithera",
                    LocalDate.of(2005, Month.JANUARY,3),

                    "waithera53@yahoo.com"

            );
            repository.saveAll(
                    List.of(daniel,mwangi,waithera)
            );
        };
    }
}
