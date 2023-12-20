package pl.babiak.ruslana.spring.learn.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteRepositoryTest {
    @Autowired
    private NoteRepository noteRepository;

    @Test
    void create() {
        //given
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setTitle("Random Title");
        noteEntity.setContent("Random Content");

        //when
        NoteEntity savedNoteEntity = noteRepository.save(noteEntity);

        //then
        Assertions.assertNotNull(savedNoteEntity, "Saved Note Entity is null.");
    }

    @Test
    void read() {
        //given

        //when

        //then

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}