package org.restangular.rest.resources.asm;

import org.restangular.core.models.Blog;
import org.restangular.rest.controllers.BlogController;
import org.restangular.rest.resources.BlogEntryResource;
import org.restangular.rest.resources.BlogResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by oussama on 4/12/2015.
 */
public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {

    public BlogResourceAsm() {
        super(BlogController.class, BlogResource.class);
    }
    @Override
    public BlogResource toResource(Blog blog) {
        BlogResource blogResource = new BlogResource();
        blogResource.setBlogName(blog.getBlogName());
        blogResource.setUrl(blog.getUrl());
        return blogResource;
    }
}
