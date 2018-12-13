package org.fyh.idea.demo;

import lombok.extern.slf4j.Slf4j;
import org.fyh.idea.demo.model.Student;
import org.fyh.idea.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IdeaDemoApplicationTests {

    @Resource
    StudentService studentService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testStudent() {
        Student student = studentService.selectByPrimaryKey(1);
        log.info(student.toString());

    }




}
