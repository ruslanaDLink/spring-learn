package pl.babiak.ruslana.spring.learn.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

//@Component
@Repository
public class NoteRepository {
    private static final Logger LOGGER = Logger.getLogger(NoteRepository.class.getName());

    public void create() {

    }

    public void read() {
        LOGGER.info("read(" + ")");

        LOGGER.info("read()=");
    }

    public void update() {

    }

    public void delete() {

    }
}
