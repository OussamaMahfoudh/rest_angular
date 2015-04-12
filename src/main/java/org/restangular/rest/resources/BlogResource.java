package org.restangular.rest.resources;

import org.restangular.core.models.Account;
import org.restangular.core.models.BlogEntry;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by oussama on 4/12/2015.
 */
public class BlogResource extends ResourceSupport {

    private String url;
    private String blogName;
    private List<BlogEntry> blogEntryList;
    private Account owner;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public List<BlogEntry> getBlogEntryList() {
        return blogEntryList;
    }

    public void setBlogEntryList(List<BlogEntry> blogEntryList) {
        this.blogEntryList = blogEntryList;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }
}
