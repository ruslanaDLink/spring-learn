package pl.babiak.ruslana.spring.learn.service.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;
import pl.babiak.ruslana.spring.learn.web.model.NoteModel;

import static org.junit.jupiter.api.Assertions.*;

class NoteMapperTest {

    @Test
    void map() {
        //given
        NoteMapper noteMapper = new NoteMapper();
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setId(364323L);

        //when
        NoteModel mappedNoteModel = noteMapper.map(noteEntity);

        //then
        Assertions.assertAll(
                () -> Assertions.assertNotNull(mappedNoteModel, "MappedNoteModel is null."),
                () -> Assertions.assertEquals(noteEntity.getId(), mappedNoteModel.getId(), "Id's are different.")
        );
    }
}