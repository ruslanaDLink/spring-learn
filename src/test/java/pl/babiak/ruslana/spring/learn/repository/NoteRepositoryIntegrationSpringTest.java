package pl.babiak.ruslana.spring.learn.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;

import java.util.Optional;

@SpringBootTest
class NoteRepositoryIntegrationSpringTest {
    @Autowired
    private NoteRepository noteRepository;

    @Test
    void create() {

    }

    @Test
    void read() {
        //given
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setTitle("Random Title");
        noteEntity.setContent("Random Content");

        //when
        NoteEntity savedNoteEntity = noteRepository.save(noteEntity);
        Optional<NoteEntity> optionalNoteEntity = noteRepository.findById(savedNoteEntity.getId());
        System.out.println(optionalNoteEntity);

        //then
        Assertions.assertNotNull(savedNoteEntity, "Saved Note Entity is null.");

    }

    @Test
    void update() {
        //given
        NoteEntity createNoteEntity = new NoteEntity();
        createNoteEntity.setTitle("Java Optional Title");
        createNoteEntity.setContent("Java Optional Content");

        NoteEntity updateNoteEntity = new NoteEntity();
        updateNoteEntity.setTitle("Java Updated Title");
        updateNoteEntity.setContent("Java Updated Content");

        //when
        NoteEntity savedCreatedNoteEntity = noteRepository.save(createNoteEntity);
        updateNoteEntity.setId(savedCreatedNoteEntity.getId());
        NoteEntity updatedNoteEntity = noteRepository.save(updateNoteEntity);

        //then
        Assertions.assertEquals(savedCreatedNoteEntity.getId(), updatedNoteEntity.getId(), "Ids are not equal.");
    }

    @Test
    void delete() {
        //given
        NoteEntity noteEntity = new NoteEntity();

        //when
        NoteEntity savedEntity = noteRepository.save(noteEntity);
        noteRepository.deleteById(savedEntity.getId());
        Optional<NoteEntity> optionalNoteEntity = noteRepository.findById(savedEntity.getId());
        System.out.println(optionalNoteEntity);

        //then

    }
}