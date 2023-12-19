package pl.babiak.ruslana.spring.learn.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorControllerSpringTest {
    @Autowired
    private AuthorController authorController;

    @Test
    void create() {
    }

    @Test
    void read() {
        //given

        //when
        String dawid = authorController.read("Dawid");

        //then
        Assertions.assertNotNull(dawid, "Author name is null.");
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}