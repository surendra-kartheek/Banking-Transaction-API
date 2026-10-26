package com.example.banking_transaction_api;

import com.example.banking_transaction_api.controller.BankingController;
import com.example.banking_transaction_api.repository.AccountRepository;
import com.example.banking_transaction_api.service.BankingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(properties = {
		"spring.datasource.url=jdbc:h2:mem:banking-test;DB_CLOSE_DELAY=-1",
		"spring.datasource.username=sa",
		"spring.datasource.password=",
		"spring.jpa.hibernate.ddl-auto=create-drop"
})
class BankingTransactionApiApplicationTests {

	@Autowired
	private BankingController bankingController;

	@Autowired
	private BankingService bankingService;

	@Autowired
	private AccountRepository accountRepository;

	@Test
	void contextLoads() {
		assertNotNull(bankingController);
		assertNotNull(bankingService);
		assertNotNull(accountRepository);
	}

}
