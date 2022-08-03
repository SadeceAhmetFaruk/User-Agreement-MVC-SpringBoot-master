package Repository;

import Model.UserAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgreementRepository extends JpaRepository<UserAgreement,Long> {
}
