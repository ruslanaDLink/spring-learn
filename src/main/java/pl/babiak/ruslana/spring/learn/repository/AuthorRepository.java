package pl.babiak.ruslana.spring.learn.repository;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class AuthorRepository {
    private static final Logger LOGGER = Logger.getLogger(AuthorRepository.class.getName());

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
