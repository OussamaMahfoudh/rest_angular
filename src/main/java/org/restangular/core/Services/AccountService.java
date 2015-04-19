package org.restangular.core.services;

import org.restangular.core.models.Account;
import org.restangular.core.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by oussama on 4/18/2015.
 */
public class AccountService implements ICrudService<Account> {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findOne(Long id) {
        return accountRepository.findOne(id);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.delete(id);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
