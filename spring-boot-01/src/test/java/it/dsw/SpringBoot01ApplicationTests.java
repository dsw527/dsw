package it.dsw;

import it.dsw.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot01ApplicationTests {

    @Autowired
    User user;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        logger.debug("debug形式启动");
        logger.info("info形式启动");
        System.out.println(user);
    }

}
