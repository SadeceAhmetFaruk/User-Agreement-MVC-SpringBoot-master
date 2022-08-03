package Service;


import Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User ListById(Long user_id);

    //List ALL Agreements
    List<User> ListAllUsers();

    //Update  Agreement
    User updateUser(User user);

    //Number of Agreement
    Long numberOfUsers();

    //Create a Agreement
    User SaveUser(User user);

    //Delete By ID
    void DeleteUserByID(Long user_id);

    //Delete By Name
    void DeleteUserByName(User User);

    User findByUsername(String username);
}
