package org.restangular.core.models;

import com.sun.istack.internal.NotNull;
import org.restangular.core.models.base.GeneratedValueEntity;

import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by oussama on 4/12/2015.
 */
public class Role extends GeneratedValueEntity {

    @NotNull
    private String Role;
    @ManyToMany
    private List<Account> users;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public List<Account> getUsers() {
        return users;
    }

    public void setUsers(List<Account> users) {
        this.users = users;
    }
}
