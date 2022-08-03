package Service.ServiceImp;

import Model.User;
import Repository.UserRepository;
import Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User ListById(Long user_id) {
       return  userRepository.findById(user_id).orElse(null);
    }

    @Override
    public List<User> ListAllUsers() {
        return  userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Long numberOfUsers() {
        return userRepository.count();
    }

    @Override
    public User SaveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void DeleteUserByID( Long user_id) {
         userRepository.deleteById(user_id);
    }

    @Override
    public void DeleteUserByName(User user) {
         userRepository.delete(user);
    }

    @Override
    public User findByUsername(String username) {
       return userRepository.findByUsername(username).orElse(null);

    }

}
