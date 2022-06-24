package ru.netology.hibernate.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {
    @EmbeddedId
    private PersonId personId;

    @Column
    private String phoneNumber;


    @Column
    private String cityOfLiving;
}
