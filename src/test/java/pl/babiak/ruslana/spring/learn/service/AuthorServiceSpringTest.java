package pl.babiak.ruslana.spring.learn.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorServiceSpringTest {
    @Autowired
    private AuthorService authorService;

    @Test
    void create() {
    }

    @Test
    void read() {
        //given

        //when
        authorService.read();

        //then

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}