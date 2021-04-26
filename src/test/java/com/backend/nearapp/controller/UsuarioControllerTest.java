package com.backend.nearapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.MimeTypeUtils;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = UsuarioController.class)
public class UsuarioControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void  getTest_ReturnOk() throws Exception{
		final ResultActions result = mockMvc.perform(
		        get("/user/test")
	            .accept(MimeTypeUtils.TEXT_PLAIN_VALUE));
		result.andExpect(status().isOk());
	}
}
