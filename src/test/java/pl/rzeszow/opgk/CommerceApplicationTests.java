package pl.rzeszow.opgk;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.rzeszow.opgk.controller.DefaultController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommerceApplicationTests {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new DefaultController()).build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testDefaultController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
				.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Hello world"))
				.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"));
	}

}
