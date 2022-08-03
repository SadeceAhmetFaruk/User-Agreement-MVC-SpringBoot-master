package Repository;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
// Bu yorum satırını Git için attım
public interface UserRepository extends JpaRepository<User,Long> {
}
