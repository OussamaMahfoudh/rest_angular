package org.restangular.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by oussama on 4/18/2015.
 */
@Configuration
@ComponentScan("org.restangular.core.repositories")
public class RepositoryConfig{
}
