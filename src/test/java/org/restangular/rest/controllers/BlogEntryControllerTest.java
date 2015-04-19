package org.restangular.rest.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.restangular.core.models.Blog;
import org.restangular.core.models.BlogEntry;
import org.restangular.core.services.BlogEntryService;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Date;

import static org.hamcrest.Matchers.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntryControllerTest {

    @Mock
    private BlogEntryService blogEntryService;

    @InjectMocks
    private BlogEntryController blogEntryController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();
    }

    @Test
    public void getExistingBlogEntry() throws Exception {
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setPublishDate(new Date());
        blogEntry.setTitle("blog entry title");
        blogEntry.setDescription("blog entry description");
        blogEntry.setLink("https://blogentrylink.com");
        when(blogEntryService.findOne(1L)).thenReturn(blogEntry);

        mockMvc.perform(get("/rest/blog-entries/findone/1"))
                .andExpect(jsonPath("$.blogEntryName", is("Blog")))
                .andExpect((jsonPath("$.links[*].href", hasItem(endsWith("/blog-entries/findone/1")))))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void getNonExistingBlogEntry() throws Exception {
        when(blogEntryService.findOne(1L)).thenReturn(null);

        mockMvc.perform(get("/rest/blog-entries/findone/1"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void getExistingBlogEntryWithBlog() throws Exception {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setBlogName("blog");
        blog.setUrl("https://blogsaround.tn");
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setPublishDate(new Date());
        blogEntry.setTitle("Blog entry title");
        blogEntry.setDescription("Blog entry description");
        blogEntry.setLink("https://blogentrylink.com");
        blogEntry.setBlog(blog);

        when(blogEntryService.findOne(1L)).thenReturn(blogEntry);

        mockMvc.perform(get("/rest/blog-entries/findone/1"))
                .andExpect(jsonPath("$.title", is("Blog entry title")))
                .andExpect(jsonPath(("$.description"), is("Blog entry description")))
                .andExpect(jsonPath("$.links[*].rel", hasItem("blog")))
                .andDo(print());
    }

    @Test
    public void saveNewBlogEntryStatusOnSucceedIsCreated() throws Exception {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setBlogName("blog");
        blog.setUrl("https://blogsaround.tn");
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setPublishDate(new Date());
        blogEntry.setTitle("Blog entry title");
        blogEntry.setDescription("Blog entry description");
        blogEntry.setLink("https://blogentrylink.com");
        blogEntry.setBlog(blog);

        when(blogEntryService.save(any(BlogEntry.class))).thenReturn(blogEntry);

        mockMvc.perform(post("/rest/blog-entries/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(blogEntry)))
                .andDo(print())
                .andExpect(status().isCreated())
                .andDo(print());

    }

    @Test
    public void updateBlogEntryStatusOnSucceedIsOk() throws Exception {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setBlogName("blog");
        blog.setUrl("https://blogsaround.tn");
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setPublishDate(new Date());
        blogEntry.setTitle("Blog entry title");
        blogEntry.setDescription("Blog entry description");
        blogEntry.setLink("https://blogentrylink.com");
        blogEntry.setBlog(blog);

        when(blogEntryService.save(any(BlogEntry.class))).thenReturn(blogEntry);
        when(blogEntryService.findOne(1L)).thenReturn(blogEntry);

        mockMvc.perform(put("/rest/blog-entries/update/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(blogEntry)))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(print());

    }

    @Test
    public void deleteBlogEntryStatusOnSucceedIsOk() throws Exception {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setBlogName("blog");
        blog.setUrl("https://blogsaround.tn");
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setPublishDate(new Date());
        blogEntry.setTitle("Blog entry title");
        blogEntry.setDescription("Blog entry description");
        blogEntry.setLink("https://blogentrylink.com");
        blogEntry.setBlog(blog);

        mockMvc.perform(delete("/rest/blog-entries/delete/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(blogEntry)))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(print());

    }
}
