package spring.ai.example.spring_ai_demo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.autoconfigure.openai.OpenAiAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@ImportAutoConfiguration(exclude = { OpenAiAutoConfiguration.class })
class SpringAiDemoApplicationTests {


	@Test
	void contextLoads() {
	}

}
