package Controller;


import Model.User;
import Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // btütün kullanıcıları oluşturmak için
    @GetMapping
    public List<User> GetUserList(User user) {
        return userRepository.findAll();

    }

    // Bir kullanıcı oluşturmak için
    @PostMapping
    public User createUser(@RequestBody  User newUser){
        return userRepository.save(newUser);
    }
    // Bir kullancıyı getirmek için

    @GetMapping("{/userId}")
    public User findByID(@PathVariable Long userId){
        return userRepository.findById(userId).orElse(null);
        // bulunmaz ise null döndür
    }

    //Kullanıcı updte için kulanılır
    @PutMapping("{/userId}")
    public User updateUser(@RequestBody User newUser,@PathVariable Long userId){
        return  userRepository.findById(userId)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setMail(newUser.getMail());
                    user.setPassword(newUser.getPassword());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(userId);
                    return userRepository.save(newUser);
                });
    }

    //Kullanıcı silmek amacıyla
    @DeleteMapping("/{userID}")
    void  deleteUser(@PathVariable Long userId){
        userRepository.deleteById(userId);
    }

}
