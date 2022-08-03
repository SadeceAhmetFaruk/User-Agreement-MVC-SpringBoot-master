package Service;

import Model.UserAgreement;

import java.util.List;

public interface UserAgreementService {


    UserAgreement saveUserAgreements(UserAgreement userAgreement);

    Long numberOfUserAgreements();

    List<UserAgreement> findAllUserAgreements();
}
