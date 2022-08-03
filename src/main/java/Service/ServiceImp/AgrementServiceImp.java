package Service.ServiceImp;

import Model.Agreement;
import Repository.AgreementRepository;
import Service.AgreementService;

import java.util.List;

public class AgrementServiceImp implements AgreementService
{

    private final AgreementRepository agreementRepository;

    public AgrementServiceImp(AgreementRepository agreementRepository) {
        this.agreementRepository = agreementRepository;
    }


    @Override
    public Agreement updateAgreement(Agreement agreement) {
        return agreementRepository.save(agreement);
    }

    @Override
    public List<Agreement> ListAllAgreement() {
        return agreementRepository.findAll();
    }

    @Override
    public Long numberOfAgrements() {
        return agreementRepository.count();
    }

    @Override
    public Agreement SaveAgreement(Agreement agreement) {
        return agreementRepository.save(agreement);
    }

    @Override
    public void DeleteAgrementByID(Long agreement_id) {
         agreementRepository.deleteById(agreement_id);
    }

    @Override
    public void DeleteAgrementByName(Agreement agreement) {
        agreementRepository.delete(agreement);
    }
}
