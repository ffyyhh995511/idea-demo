package org.fyh.idea.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author fangyunhe
 * @Description 
 * @Date 2018-11-24 17:35:58
 * @Param 
 * @return 
 **/
@SpringBootApplication
@MapperScan("org.fyh.idea.demo.dao")
public class IdeaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaDemoApplication.class, args);
    }
}
