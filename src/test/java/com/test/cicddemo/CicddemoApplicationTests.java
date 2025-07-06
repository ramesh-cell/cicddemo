package com.test.cicddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
class CicddemoApplicationTests {

	@MockitoBean
	private UserService userService;

	@Test
	void contextLoads() {
	}

}
