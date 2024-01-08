package pl.babiak.ruslana.spring.learn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoteServiceSpringTest {
    @Autowired
    private NoteService noteService;

//    public NoteServiceSpringTest(NoteService noteService) {
//        this.noteService = noteService;
//    }

    @Test
    void create() {
    }

    @Test
    void read() {
        //given
        Long id = 48738398L;

        //when


        //then
        Assertions.assertThrows(Exception.class, () -> noteService.read(id));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}