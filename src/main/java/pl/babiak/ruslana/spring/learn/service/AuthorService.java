package pl.babiak.ruslana.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.babiak.ruslana.spring.learn.repository.AuthorRepository;

import java.util.logging.Logger;

@Service
public class AuthorService {
    private static final Logger LOGGER = Logger.getLogger(AuthorService.class.getName());

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void create(){

    }

    public void read(){
        LOGGER.info("read(" + ")");
        authorRepository.read();
        LOGGER.info("read()=");
    }

    public void update(){

    }

    public void delete(){

    }

}
