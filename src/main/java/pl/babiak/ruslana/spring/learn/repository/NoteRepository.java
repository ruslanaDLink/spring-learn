package pl.babiak.ruslana.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.babiak.ruslana.spring.learn.repository.entity.NoteEntity;

import java.util.logging.Logger;

//@Component
@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
   // private static final Logger LOGGER = Logger.getLogger(NoteRepository.class.getName());

//    public void create() {
//
//    }
//
//    public void read() {
//        LOGGER.info("read(" + ")");
//
//        LOGGER.info("read()=");
//    }
//
//    public void update() {
//
//    }
//
//    public void delete() {
//
//    }
}
//JDBC - 30 lines
//Hibernate - 4 lines
//Data JPA - 1
