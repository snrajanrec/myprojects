package com.ms.example.example;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles("test")
@ContextConfiguration
@DataJpaTest
@ComponentScan("com.ms.example.example")
class ExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDemo() {
		fail("Not yet implemented");
	}
}
