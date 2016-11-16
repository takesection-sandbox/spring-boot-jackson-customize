package jp.pigumer;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * DemoModule.
 */
public class DemoModule extends SimpleModule implements InitializingBean {

    @Autowired
    CustomSerializer customSerializer;

    @Override
    public void afterPropertiesSet() throws Exception {
        addSerializer(customSerializer);
    }

}
