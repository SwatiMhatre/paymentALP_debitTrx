package org.payment.debitsc.repository;

import org.payment.debitsc.dto.DebitAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DebitAccountRepository extends JpaRepository<DebitAccount, Integer> {
	DebitAccount getDebitAcById(Integer id);
}
