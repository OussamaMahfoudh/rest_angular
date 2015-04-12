package org.restangular.rest.controllers;

import org.restangular.core.models.Blog;
import org.restangular.core.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by oussama on 4/12/2015.
 */
@Controller
@RequestMapping(value = "/rest/blog")
public class BlogController {

//    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Blog findOne(@PathVariable("id") Long id) {
        return null;
    }
}
