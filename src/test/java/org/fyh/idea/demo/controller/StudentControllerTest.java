package org.fyh.idea.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.fyh.idea.demo.IdeaDemoApplication;
import org.fyh.idea.demo.model.Student;
import org.fyh.idea.demo.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.validation.constraints.AssertTrue;

/**
 * Description controller的单元测试
 * Author fangyunhe
 * Date 2018/12/24 14:57
 * Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = IdeaDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class StudentControllerTest {

    @Resource
    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
        log.info("before");
    }

    @Test
    public void test1() throws Exception {
        Student student = studentService.selectByPrimaryKey(1);
        log.info(student.toString());
    }

}
