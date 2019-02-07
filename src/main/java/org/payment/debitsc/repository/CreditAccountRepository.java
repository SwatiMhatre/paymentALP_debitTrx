package org.payment.debitsc.repository;

import org.payment.debitsc.dto.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CreditAccountRepository extends JpaRepository<CreditAccount, Integer> {
	CreditAccount getCreditAcById(Integer id);
}
