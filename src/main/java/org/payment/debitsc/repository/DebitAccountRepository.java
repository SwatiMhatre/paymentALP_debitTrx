package org.payment.debitsc.repository;

import java.util.List;

import org.payment.debitsc.dto.DebitAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface DebitAccountRepository extends JpaRepository<DebitAccount, Integer> {
	DebitAccount getDebitAcById(Integer id);
	
	/*@Query("SELECT id,accountNumber,accountType,currentBalance "
	        + "FROM DebitAccount" )
	List<DebitAccount> getDebitAccountList();*/
}
