package org.restangular.rest.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import org.restangular.core.services.BlogEntryService;
import org.restangular.core.models.BlogEntry;
import org.restangular.rest.resources.BlogEntryResource;
import org.restangular.rest.resources.asm.BlogEntryResourceAsm;
import org.restangular.rest.utils.RestPreconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by oussama on 4/8/2015.
 */

@Controller
@RequestMapping("/rest/blog-entries")
public class BlogEntryController {

    //    @Autowired
    private BlogEntryService blogEntryService;

    @RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BlogEntryResource findBlogEntry(@PathVariable("id") Long id) {
        BlogEntry blogEntry = RestPreconditions.checkFound(blogEntryService.findOne(id));
        BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(blogEntry);
        return blogEntryResource;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public BlogEntryResource createBlogEntry(@RequestBody BlogEntry blogEntry) {
        Preconditions.checkNotNull(blogEntry);
        BlogEntry newBlogEntry = blogEntryService.create(blogEntry);
        BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(newBlogEntry);
        return blogEntryResource;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public BlogEntryResource updateBlogEntry(@PathVariable("id") Long id, @RequestBody BlogEntry blogEntry) {
        Preconditions.checkNotNull(blogEntry);
        RestPreconditions.checkFound(blogEntryService.findOne(id));
        return new BlogEntryResourceAsm().toResource(blogEntryService.update(blogEntry));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteBlogEntry(@PathVariable("id") Long id) {
        blogEntryService.deleteById(id);
    }

}
