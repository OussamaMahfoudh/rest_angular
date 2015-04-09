package org.rest.core.models;

import org.rest.core.models.base.BaseModel;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntry extends BaseModel{
    private String blogEntryName;

    public String getBlogEntryName() {
        return blogEntryName;
    }

    public void setBlogEntryName(String blogEntryName) {
        this.blogEntryName = blogEntryName;
    }
}
