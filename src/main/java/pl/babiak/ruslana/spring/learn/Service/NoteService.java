package pl.babiak.ruslana.spring.learn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.babiak.ruslana.spring.learn.repository.NoteRepository;

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

    public void read() {
        LOGGER.info("read(" + ")");
        noteRepository.read();
        LOGGER.info("read()=");
    }

    public void update() {

    }

    public void delete() {

    }
}
