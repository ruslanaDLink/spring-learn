package pl.babiak.ruslana.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.babiak.ruslana.spring.learn.repository.entity.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
