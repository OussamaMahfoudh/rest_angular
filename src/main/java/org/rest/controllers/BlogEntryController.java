package org.rest.controllers;

import org.rest.models.BlogEntry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by oussama on 4/8/2015.
 */
class BlogEntryController {

    @RequestMapping(value = "/getBlog", method = RequestMethod.POST)
    public @ResponseBody BlogEntry returnBlogEntry (@RequestBody BlogEntry blogEntry) {
        BlogEntry returnBlogEntry = new BlogEntry();
        returnBlogEntry.setBlogEntryName(blogEntry.getBlogEntryName().concat(" successful"));
        returnBlogEntry.setId(blogEntry.getId());
        return returnBlogEntry;
    }
}
