package pl.babiak.ruslana.spring.learn.web;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.babiak.ruslana.spring.learn.Service.NoteService;

import java.util.logging.Logger;

//@Component
@Controller
@RequestMapping(value = "/notes")
public class NoteController {
    private static final Logger LOGGER = Logger.getLogger(NoteController.class.getName());

    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    public void create() {

    }

    @GetMapping
    public String read(String age) {
        LOGGER.info("read(" + age + ")");
        noteService.read();
        LOGGER.info("read()=");
        return "note-read.html";
    }

    public void update() {

    }

    public void delete() {

    }
}
