package Service.ServiceImp;

import Model.UserAgreement;
import Repository.UserAgreementRepository;
import Service.UserAgreementService;

import java.util.List;

public class UserAgreementServiceImp implements UserAgreementService {
    private final UserAgreementRepository userAgreementRepository;

    public UserAgreementServiceImp(UserAgreementRepository userAgreementRepository) {
        this.userAgreementRepository = userAgreementRepository;
    }

    @Override
    public UserAgreement saveTransaction(UserAgreement userAgreement) {
        return userAgreementRepository.save(userAgreement);
    }

    @Override
    public Long numberOfUserAgreements() {
        return userAgreementRepository.count();
    }

    @Override
    public List<UserAgreement> findAllTransactions() {
        return userAgreementRepository.findAll();
    }
}
