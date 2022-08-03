package Model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "UserAgreement")
public class UserAgreement {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;



}
