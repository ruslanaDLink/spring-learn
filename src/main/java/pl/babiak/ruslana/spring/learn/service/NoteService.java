package pl.babiak.ruslana.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.babiak.ruslana.spring.learn.repository.NoteRepository;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class NoteService {
    private static final Logger LOGGER = Logger.getLogger(NoteService.class.getName());

    //@Autowired
    private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void create() {

    }

    public NoteEntity read(Long id) throws Exception {
        LOGGER.info("read(" + id + ")");
        Optional<NoteEntity> optionalNoteEntity = noteRepository.findById(id);
        NoteEntity noteEntity = optionalNoteEntity.orElseThrow(
                () -> new Exception("Entity found by id is null."));
        LOGGER.info("read(...)=" + noteEntity);
        return noteEntity;
    }

    public void update() {

    }

    public void delete() {

    }
}
