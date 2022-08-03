package Model;


import lombok.Data;

import javax.persistence.*;
import java.io.File;

@Data
@Entity
@Table(name = "Agreement")
public class Agreement {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "agrement_name", nullable = false)
    private String agrement_name;

    @Column(name = "agrement_file",nullable = false)
    private File agrement_file;



}
