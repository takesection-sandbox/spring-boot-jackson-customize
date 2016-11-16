package jp.pigumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	TestRestTemplate template;

	@Test
	public void nullParamTest() {
		ResponseEntity<String> res = template.getForEntity("/", String.class);
		assertThat(res.getBody(), is("null"));
	}

	@Test
	public void notNullParamTest() {
		ResponseEntity<String> res = template.getForEntity("/?exists", String.class);
		assertThat(res.getBody(), is("not null"));
	}

}
