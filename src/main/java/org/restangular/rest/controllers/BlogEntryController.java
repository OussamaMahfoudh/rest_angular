package org.restangular.rest.controllers;

import org.restangular.core.Services.base.BlogEntryService;
import org.restangular.core.models.BlogEntry;
import org.restangular.rest.resources.BlogEntryResource;
import org.restangular.rest.resources.asm.BlogEntryResourceAsm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntryController {

    private BlogEntryService blogEntryService;

    @RequestMapping(value = "/getBlog", method = RequestMethod.POST)
    @ResponseBody
    public BlogEntry returnBlogEntry (@RequestBody BlogEntry blogEntry) {
        BlogEntry returnBlogEntry = new BlogEntry();
        returnBlogEntry.setBlogEntryName(blogEntry.getBlogEntryName().concat(" successful"));
        returnBlogEntry.setId(blogEntry.getId());
        return returnBlogEntry;
    }

    @RequestMapping(value = "/rest/blog-entries/findone/{id}", method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> findBlogEntry(@PathVariable Long id){
        BlogEntry blogEntry = blogEntryService.findOne(id);
        if (blogEntry != null) {
            BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(blogEntry);
            return new ResponseEntity<BlogEntryResource>(blogEntryResource, HttpStatus.OK);
        } else {
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }
    }
}
