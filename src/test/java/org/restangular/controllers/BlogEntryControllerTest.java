package org.restangular.rest.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.restangular.core.Services.base.BlogEntryService;
import org.restangular.core.models.BlogEntry;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController blogEntryController;

    @Mock
    private BlogEntryService blogEntryService;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();
    }

    @Test
    public void testController() {
        try {
            mockMvc.perform(post("/getBlog")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"id\":2,\"blogEntryName\":\"test\"}"))
                    .andExpect(jsonPath("$.blogEntryName", is("test successful")))
                    .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getExistingBlogEntry() throws Exception {
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setId(1L);
        blogEntry.setBlogEntryName("Blog");
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
}
