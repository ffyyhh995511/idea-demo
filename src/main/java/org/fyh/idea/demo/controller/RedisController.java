package org.fyh.idea.demo.controller;

import org.fyh.idea.demo.model.Student;
import org.fyh.idea.demo.response.Response;
import org.fyh.idea.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Description
 * Author fangyunhe
 * Date 2018/12/5 10:34
 * Version 1.0
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    RedisTemplate redisTemplate;

    @Resource
    StudentService studentService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * @Author fangyunhe
     * @Description
     * @Date 2018-12-05 14:35:20
     * @Param key
     * @param value
     * @return org.fyh.idea.demo.response.Response<java.lang.Object>
     **/
    @GetMapping(value = "/setString")
    public Response<Object> setString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return Response.successResponse();
    }

    /**
     *
     * @param key
     * @return
     */
    @GetMapping(value = "/getString")
    public Response<Object> getString(String key) {
        String value = stringRedisTemplate.opsForValue().get(key);
        return Response.successResponse(value);
    }

    @GetMapping(value = "/sadd")
    public Response<Object> sadd(String key){
        Student student1 = studentService.selectByPrimaryKey(1);
        Student student2 = studentService.selectByPrimaryKey(2);
        Long add = redisTemplate.opsForSet().add(key, student1, student2);
        return Response.successResponse(add);
    }

    @GetMapping(value = "/sget")
    public Response<Object> sget(String key){
        Set members = redisTemplate.opsForSet().members(key);
        return Response.successResponse(members);
    }
}
