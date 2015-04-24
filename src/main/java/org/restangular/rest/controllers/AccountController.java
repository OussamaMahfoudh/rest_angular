package org.restangular.rest.controllers;

import org.restangular.core.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oussama on 4/24/2015.
 */
@Controller
@RequestMapping(value = "/rest/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
}
