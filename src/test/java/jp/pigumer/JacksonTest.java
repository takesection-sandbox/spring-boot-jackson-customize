package jp.pigumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JacksonTest {

    @Autowired
    ObjectMapper mapper;

    @SpyBean
    JacksonCustomizer config;

    @Test
    public void test() throws Exception {
        verify(config).customize(anyObject());

        LocalDateTime zero = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 1000000);
        String json = mapper.writeValueAsString(zero);
        assertThat(json, is("1"));
    }
}
