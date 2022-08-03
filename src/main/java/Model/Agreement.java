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

    @Column(name = "agrement_total_price", nullable = false)
    private Double agrement_total_price;

    @Column(name = "agreement_withdrawal_fee", nullable = false)
    private Double agreement_withdrawal_fee;

    @Column(name = "agrement_file",nullable = true)
    private File agrement_file;
}
