package Service;

import Model.UserAgreement;

import java.util.List;

public interface UserAgreementService {


    UserAgreement saveTransaction(UserAgreement userAgreement);

    Long numberOfUserAgreements();

    List<UserAgreement> findAllTransactions();
}
