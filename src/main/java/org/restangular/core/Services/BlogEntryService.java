package org.restangular.core.services;

import org.restangular.core.models.BlogEntry;
import org.restangular.core.repositories.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by oussama on 4/11/2015.
 */
@Service
public class BlogEntryService implements ICrudService<BlogEntry> {

    @Autowired
    private BlogEntryRepository blogEntryRepository;

    @Override
    public BlogEntry findOne(Long id) {
        return blogEntryRepository.findOne(id);
    }

    @Override
    public BlogEntry save(BlogEntry blogEntry) {
        return blogEntryRepository.save(blogEntry);
    }

    @Override
    public void delete(Long id) {
        blogEntryRepository.delete(id);
    }

    @Override
    public List<BlogEntry> findAll() {
        return blogEntryRepository.findAll();
    }

}


