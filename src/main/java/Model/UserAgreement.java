package Model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "UserAgreement")
public class UserAgreement {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="agreement_id", referencedColumnName = "user_id")
    private Agreement agreement;

    /*One to many olmalı mı tam olarak emin değilim */

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;

    @Column(name="acceptance_date")
    private LocalDateTime acceptance_date;



}
