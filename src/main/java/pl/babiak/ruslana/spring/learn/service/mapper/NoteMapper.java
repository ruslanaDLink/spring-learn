package pl.babiak.ruslana.spring.learn.service.mapper;

import org.springframework.stereotype.Component;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;
import pl.babiak.ruslana.spring.learn.web.model.NoteModel;

import java.util.logging.Logger;

@Component
public class NoteMapper {
    private static final Logger LOGGER = Logger.getLogger(NoteMapper.class.getName());

    public NoteModel map(NoteEntity noteEntity) {
        LOGGER.info("map(" + noteEntity + ")");

        NoteModel noteModel = new NoteModel();
        noteModel.setId(noteEntity.getId());
        noteModel.setTitle(noteEntity.getTitle());
        noteModel.setContent(noteEntity.getContent());

        LOGGER.info("map(...)=" + noteModel);
        return noteModel;
    }
}
