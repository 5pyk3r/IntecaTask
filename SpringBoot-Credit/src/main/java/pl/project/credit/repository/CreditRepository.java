package pl.project.credit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.project.credit.model.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer> {

    @Query("select p.id from Credit p")
    Iterable<Integer> findAllCreditIds();
}
