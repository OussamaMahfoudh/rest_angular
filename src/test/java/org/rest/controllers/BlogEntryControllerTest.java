package org.rest.mvc.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * Created by oussama on 4/8/2015.
 */
public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController blogEntryController;

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
}
