package org.restangular.rest.resources.asm;

import org.restangular.core.models.Account;
import org.restangular.rest.controllers.AccountController;
import org.restangular.rest.resources.AccountResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by oussama on 4/24/2015.
 */
public class AccountResourceAsm extends ResourceAssemblerSupport<Account, AccountResource> {
    public AccountResourceAsm() {
        super(AccountController.class, AccountResource.class);
    }

    @Override
    public AccountResource toResource(Account account) {
        return null;
    }
}

