package Service;

import Model.Agreement;
import Model.User;

import java.util.List;

public interface AgreementService {


    //Update  Agreement
    Agreement updateAgreement(Agreement agreement);


    //List ALL Agreements
    List<Agreement> ListAllAgreement();

    //Number of Agreemn
    Long numberOfAgrements();

    //Create and update Agreement
    Agreement SaveAgreement(Agreement agreement);

    //Delete By ID
    void DeleteAgrementByID(Long agreement_id);

    //Delete By Name
    void DeleteAgrementByName(Agreement Agreement);


}
