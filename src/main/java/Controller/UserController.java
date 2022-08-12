package Controller;


import Model.Agreement;
import Model.Role;
import Model.User;
import Model.UserAgreement;
import Service.AgreementService;
import Service.UserAgreementService;
import Service.UserService;
import config.StringResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;


@RestController
public class UserController {

    private final UserService userService;

    private final AgreementService agreementService;

    private final UserAgreementService userAgreementService;
    public UserController(UserService userService, AgreementService agreementService, UserAgreementService userAgreementService) {
        this.userService = userService;
        this.agreementService = agreementService;
        this.userAgreementService = userAgreementService;
    }

    @PostMapping("/api/user/registration")
    public ResponseEntity<?> register(@RequestBody User user){
        if(userService.findByUsername(user.getUsername())!=null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        //default role.
        user.setRole(Role.USER);
        return new ResponseEntity<>(userService.SaveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/api/user/login")
    public ResponseEntity<?> getUser(Principal principal){
        //principal = httpServletRequest.getUserPrincipal.
        if(principal == null){
            //logout will also use here so we should return ok http status.
            return ResponseEntity.ok(principal);
        }
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) principal;
        User user = userService.findByUsername(authenticationToken.getName());
        user.setToken(tokenProvider.generateToken(authenticationToken));

        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @PostMapping("/api/user/purchase")
    public ResponseEntity<?> purchaseProduct(@RequestBody UserAgreement userAgreement){
        userAgreement.setAcceptance_date(LocalDateTime.now());
        userAgreementService.saveUserAgreements(userAgreement);
        return new ResponseEntity<>(userAgreement, HttpStatus.CREATED);
    }

    @GetMapping("/api/user/products")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(agreementService.ListAllAgreement(), HttpStatus.OK);
    }


}
