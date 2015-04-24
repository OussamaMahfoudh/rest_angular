package org.restangular.core.services;

import org.restangular.core.models.Blog;
import org.restangular.core.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by oussama on 4/12/2015.
 */
@Service
public class BlogService implements ICrudService<Blog>{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog findOne(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void delete(Long id) {
        blogRepository.delete(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
