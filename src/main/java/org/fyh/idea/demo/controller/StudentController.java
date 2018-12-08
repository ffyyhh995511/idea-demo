package org.fyh.idea.demo.controller;

import org.fyh.idea.demo.model.Student;
import org.fyh.idea.demo.response.Response;
import org.fyh.idea.demo.service.StudentService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description 学生
 * Author fangyunhe
 * Date 2018/11/24 17:16
 * Version 1.0
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * @Author fangyunhe
     * @Description
     * @Date 2018-11-24 17:33:55
     * @Param
     * @return org.fyh.idea.demo.response.Response<java.lang.Object>
     **/
    @GetMapping(value = "/get")
    public Response<Object> getById(int id) {
        Student student = studentService.selectByPrimaryKey(id);
        return Response.successResponse(student);
    }

    /**
     * @Author fangyunhe
     * @Description
     * @Date 2018-12-05 11:11:26
     * @Param firstName
     * @param lastName
     * @return org.fyh.idea.demo.response.Response<java.lang.Object>
     **/
    @GetMapping(value = "/add")
    public Response<Object> add(String firstName, String lastName) {
        studentService.insert(firstName,lastName);
        return Response.successResponse();
    }

}
