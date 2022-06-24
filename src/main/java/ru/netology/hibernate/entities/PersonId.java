package ru.netology.hibernate.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Embeddable
public class PersonId implements Serializable {
    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;
}