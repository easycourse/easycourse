package com.easyCourse.dao;

import com.easyCourse.entity.StudentHomework;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Devin
 * 2019-04-29 20:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class StudentHomeworkDaoTest {

    @Autowired
    private StudentHomeworkDao studentHomeworkDao;

    @Test
    public void selectByHomeworkId() {
        String homeworkId = "1";
        List<StudentHomework> studentHomeworkList = studentHomeworkDao.selectByHomeworkId(homeworkId);

        studentHomeworkList.forEach(System.out::println);
    }

    @Test
    public void test(){
        int i = studentHomeworkDao.updateStudentHomeworkScore("2016302580297","1",100);
    }
}