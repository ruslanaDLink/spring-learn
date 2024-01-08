package pl.babiak.ruslana.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.babiak.ruslana.spring.learn.repository.NoteRepository;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;
import pl.babiak.ruslana.spring.learn.service.mapper.NoteMapper;
import pl.babiak.ruslana.spring.learn.web.model.NoteModel;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class NoteService {
    private static final Logger LOGGER = Logger.getLogger(NoteService.class.getName());

    //@Autowired
    private NoteRepository noteRepository;
    private NoteMapper noteMapper;

    public NoteService(NoteRepository noteRepository, NoteMapper noteMapper) {
        this.noteRepository = noteRepository;
        this.noteMapper = noteMapper;
    }

    public void create() {

    }

    //Metody w Service powinny zwracac oraz przyjmowac klasy inne niz Entity na przyklad Model,dto
    public NoteModel read(Long id) throws Exception {
        LOGGER.info("read(" + id + ")");
        Optional<NoteEntity> optionalNoteEntity = noteRepository.findById(id);
        NoteEntity noteEntity = optionalNoteEntity.orElseThrow(
                () -> new Exception("Entity found by id is null."));

//        NoteModel noteModel = new NoteModel();
//        noteModel.setId(noteEntity.getId());
//        noteModel.setTitle(noteEntity.getTitle());
//        noteModel.setContent(noteEntity.getContent());

       // NoteMapper noteMapper = new NoteMapper();
        NoteModel noteModel = noteMapper.map(noteEntity);

        LOGGER.info("read(...)=" + noteModel);
        return noteModel;
    }

    public void update() {

    }

    public void delete() {

    }
}
