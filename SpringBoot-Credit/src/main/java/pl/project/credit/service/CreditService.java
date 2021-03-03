package pl.project.credit.service;

import org.springframework.stereotype.Service;
import pl.project.credit.model.Credit;
import pl.project.credit.repository.CreditRepository;

import java.util.List;

@Service
public class CreditService {

    private CreditRepository creditRepository;

    public CreditService(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    public List<Credit> findAllCredits(){
        return creditRepository.findAll();
    }

    public void saveCredit(Credit credit){
        creditRepository.save(credit);
    }
    public Iterable<Integer> findAllCreditByIds(){
       return creditRepository.findAllCreditIds();
    }
}
