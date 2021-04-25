package com.backend.nearapp.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.MimeTypeUtils;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = SampleController.class)
public class SampleControllerTest {
 
  @Autowired
  private MockMvc mockMvc;
 
  @Test
  public void getGreeting_shouldReturnOk() throws Exception {
    // Given
    // Real application context
 
    // When
    final ResultActions result = mockMvc.perform(
        get("/sample/greeting")
            .accept(MimeTypeUtils.TEXT_PLAIN_VALUE));
 
    // Then
    result.andExpect(status().isOk());
  }
}