package org.restangular.core.models;

import org.restangular.core.models.base.GeneratedValueEntity;

import java.util.List;

/**
 * Created by oussama on 4/12/2015.
 */
public class Blog extends GeneratedValueEntity {

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
