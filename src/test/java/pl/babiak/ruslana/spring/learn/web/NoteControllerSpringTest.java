package pl.babiak.ruslana.spring.learn.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteControllerSpringTest {
    @Autowired
    private NoteController noteController;

    @Test
    void create() {
    }

    @Test
    void read() throws Exception {
        //given
        Long id = 5734783L;

        //when
        String age = noteController.read("18", id);

        //then
        Assertions.assertNotNull(age, "Age is null.");
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}