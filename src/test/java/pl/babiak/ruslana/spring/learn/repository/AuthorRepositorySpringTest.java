package pl.babiak.ruslana.spring.learn.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.babiak.ruslana.spring.learn.repository.entity.AuthorEntity;

import java.util.Optional;

@SpringBootTest
class AuthorRepositorySpringTest {
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    public void create() {
        //given
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setId(64328L);
        authorEntity.setName("Dawid Beck");

        //when
        AuthorEntity savedEntity = authorRepository.save(authorEntity);

        //then
        Assertions.assertNotNull(savedEntity, "Entity is null.");
    }

    @Test
    public void read() {
        //given
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setId(6283647L);
        authorEntity.setName("Lisa Simpson");

        //when
        AuthorEntity savedEntity = authorRepository.save(authorEntity);
        Optional<AuthorEntity> entityById = authorRepository.findById(savedEntity.getId());

        //then
        Assertions.assertNotNull(entityById, "Entity is not found by this id.");

    }

    @Test
    public void update() {
        //given
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setId(9878213L);
        authorEntity.setName("Alice Birk");
        String originalName = authorEntity.getName();

        //when
        AuthorEntity savedEntity = authorRepository.save(authorEntity);
        savedEntity.setName("Alice Brooklyn");
        String updatedName = savedEntity.getName();

        //then
        Assertions.assertNotEquals(originalName, updatedName, "Update() method didn't work properly. Names are equal.");
    }

    @Test
    public void delete() {
        //given
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setId(9878213L);
        authorEntity.setName("Alice Birk");

        //when
        authorRepository.deleteById(authorEntity.getId());

        Optional<AuthorEntity> deletedUser = authorRepository.findById(authorEntity.getId());
        boolean isDeleted = deletedUser.isEmpty();

        //then
        Assertions.assertTrue(isDeleted, "User is not deleted.");
    }
}