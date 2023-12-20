package pl.babiak.ruslana.spring.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.babiak.ruslana.spring.learn.service.AuthorService;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {
    private static final Logger LOGGER = Logger.getLogger(AuthorController.class.getName());

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public void create() {

    }

    @GetMapping
    public String read(String name) {
        LOGGER.info("read(" + name + ")");
        authorService.read();
        LOGGER.info("read()=");
        return "author-read.html";
    }

    public void update() {

    }

    public void delete() {

    }

}
