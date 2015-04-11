package org.restangular.rest.resources.asm;

import org.restangular.core.models.BlogEntry;
import org.restangular.rest.controllers.BlogEntryController;
import org.restangular.rest.resources.BlogEntryResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by oussama on 4/11/2015.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> {

    public BlogEntryResourceAsm() {
        super(BlogEntryController.class, BlogEntryResource.class);
    }

    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {

        BlogEntryResource blogEntryResource = new BlogEntryResource();
        blogEntryResource.setBlogEntryName(blogEntry.getBlogEntryName());
        Link link = linkTo(methodOn(BlogEntryController.class).findBlogEntry(blogEntry.getId())).withSelfRel();
        blogEntryResource.add(link);
        return blogEntryResource;
    }
}
