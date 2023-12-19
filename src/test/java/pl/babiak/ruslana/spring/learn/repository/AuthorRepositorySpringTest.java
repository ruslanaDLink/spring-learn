package pl.babiak.ruslana.spring.learn.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorRepositorySpringTest {
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void create() {
    }

    @Test
    void read() {
        //given


        //when
       authorRepository.read();

        //then

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}