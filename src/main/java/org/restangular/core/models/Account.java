package org.restangular.core.models;

import com.sun.istack.internal.NotNull;
import org.restangular.core.models.base.GeneratedValueEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by oussama on 4/12/2015.
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "ACCOUNT_ID"))
public class Account extends GeneratedValueEntity {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private Boolean enabled;
    @ManyToMany
    private List<Role> roles;
    @OneToMany
    private List<Blog> blogs;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
