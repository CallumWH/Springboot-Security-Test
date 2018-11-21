/*package com.qa.buisiness.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistant.Account;
import com.qa.persistant.AccountRepository;

@Service
public class LoginServiceImplementation implements LoginService
{
	private static Map<String, Account> productRepo = new HashMap<>();
	static
	{
		Account account = new Account();
		account.setId(new ObjectId());
		account.setUsername("Honey");
		account.setPassword("password");
		productRepo.put(account.getObjectId().toHexString(), account);
	}
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Collection<Account> getAccounts()
	{
		//return productRepo.values();
		return accountRepository.findAll();
	}

	@Override
	public void createAccount(Account account)
	{
		account.setId(new ObjectId());
		productRepo.put(account.getHexId(), account);
		accountRepository.save(account);
	}

	@Override
	public void updateAccount(ObjectId id, Account account)
	{
		Account accountToEdit = accountRepository.findById(id.toHexString());
		
		
		productRepo.remove(id.toHexString());
		account.setId(id);
		productRepo.put(id.toHexString(), account);
		
	}

	@Override
	public void deleteAccount(ObjectId id)
	{
		productRepo.remove(id.toHexString());

	}
}
*/