package com.ibm.consulting.university.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greetingOK() throws Exception {
    	String greetingExpected = "Hello World!";

        String greetingResult = 
        		mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString()
                ;

        
        assertEquals(greetingExpected, greetingResult);
        
    }


}
