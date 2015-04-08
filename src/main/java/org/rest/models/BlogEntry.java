package org.rest.models;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntry {

    private Integer id;
    private String blogEntryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogEntryName() {
        return blogEntryName;
    }

    public void setBlogEntryName(String blogEntryName) {
        this.blogEntryName = blogEntryName;
    }
}
