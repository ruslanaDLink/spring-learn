package pl.babiak.ruslana.spring.learn.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteRepositorySpringTest {
    @Autowired
    private NoteRepository noteRepository;

    @Test
    void create() {
    }

    @Test
    void read() {
        //given

        //when
       // noteRepository.read();

        //then

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}