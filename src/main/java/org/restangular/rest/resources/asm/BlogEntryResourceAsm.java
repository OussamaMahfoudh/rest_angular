package org.restangular.rest.resources.asm;

import org.restangular.core.models.BlogEntry;
import org.restangular.rest.controllers.BlogController;
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
        blogEntryResource.setTitle(blogEntry.getTitle());
        blogEntryResource.setDescription(blogEntry.getDescription());
        blogEntryResource.setLink(blogEntry.getLink());
        blogEntryResource.setPublishDate(blogEntry.getPublishDate());
        Link selfLink = linkTo(methodOn(BlogEntryController.class).findBlogEntry(blogEntry.getId())).withSelfRel();
        Link blogLink = linkTo(methodOn(BlogController.class).findOne(blogEntry.getBlog().getId())).withRel("blog");
        blogEntryResource.add(selfLink);
        blogEntryResource.add(blogLink);
        return blogEntryResource;
    }
}
