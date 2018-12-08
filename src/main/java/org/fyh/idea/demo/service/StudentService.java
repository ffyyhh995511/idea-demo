package org.fyh.idea.demo.service;

import org.fyh.idea.demo.dao.StudentMapper;
import org.fyh.idea.demo.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description 学生业务类
 * Author fangyunhe
 * Date 2018/11/24 17:17
 * Version 1.0
 **/
@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * @Author fangyunhe
     * @Description 通过id 获取
     * @Date 2018-11-24 17:19:35
     * @Param
     * @return org.fyh.idea.demo.model.Student
     **/
    public Student selectByPrimaryKey(int id){
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     * @Author fangyunhe
     * @Description
     * @Date 2018-12-05 11:09:47
     * @Param firstName
     * @param lastName
     * @return int
     **/
    public int insert(String firstName, String lastName){
        Student student = new Student();
        student.setAge(20);
        student.setBirthday("asdfasdfasdfasdf");
        student.setRemark("的顶顶顶顶顶顶顶顶顶顶");
        student.setFirstName(firstName);
        student.setLastName(lastName);
        int res = studentMapper.insertSelective(student);
        return res;
    }
}
