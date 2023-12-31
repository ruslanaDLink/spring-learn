package pl.babiak.ruslana.spring.learn.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AUTHORS")
public class AuthorEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;

    public AuthorEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
