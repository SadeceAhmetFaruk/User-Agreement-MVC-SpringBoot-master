package Repository;

import Model.Agreement;
import Model.UserAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository extends JpaRepository<Agreement,Long> {
}
