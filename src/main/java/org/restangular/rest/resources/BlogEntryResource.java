package org.restangular.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by oussama on 4/9/2015.
 */
public class BlogEntryResource extends ResourceSupport {

    private String blogEntryName;

    public String getBlogEntryName() {
        return blogEntryName;
    }

    public void setBlogEntryName(String blogEntryName) {
        this.blogEntryName = blogEntryName;
    }
}
