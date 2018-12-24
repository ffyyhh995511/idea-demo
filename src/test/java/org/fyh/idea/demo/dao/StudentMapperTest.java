package org.fyh.idea.demo.dao;

import lombok.extern.slf4j.Slf4j;
import org.fyh.idea.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Description TODO
 * Author fangyunhe
 * Date 2018/12/24 15:00
 * Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudentMapperTest {
    @Resource
    private  StudentMapper studentMapper;

    @Test
    public void test(){
        Student student = studentMapper.selectByPrimaryKey(1);
        log.info("dao测试{}",student.toString());

    }
}
