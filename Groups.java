package com.firstspring.firstspring.studentsController;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name="groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private Date creationDate;

    public Groups(String id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public Groups(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }
}
