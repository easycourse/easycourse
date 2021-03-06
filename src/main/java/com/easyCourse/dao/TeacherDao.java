package com.easyCourse.dao;

import com.easyCourse.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 教师数据访问层
 * <p>
 * （注意，每写一个接口都需要做相应的单元测试）
 */
@Repository
public interface TeacherDao {

    /**
     * 根据账号和密码获取教师信息
     *
     * @param teacherId 账号
     * @param password  密码
     * @return 教师信息
     */
    Teacher selectByIdAndPassword(@Param("teacherId") String teacherId, @Param("password") String password);

    /**
     * 根据邮箱查询教师信息
     *
     * @param mail 邮箱
     * @return 教师信息
     */
    Teacher selectByMail(String mail);

    /**
     * 根据id查询教师信息
     *
     * @param teacherId 教师Id
     * @return 教师信息
     */
    Teacher selectById(String teacherId);

    /**
     * 插入一条教师记录
     *
     * @param teacherId   教师Id
     * @param password    密码
     * @param teacherName 教师姓名
     * @param phone       电话
     * @param mail        邮箱
     * @param location    办公室地址
     */
    void insert(@Param("teacherId") String teacherId, @Param("password") String password, @Param("teacherName") String teacherName,
                @Param("phone") String phone, @Param("mail") String mail, @Param("location") String location);


    /**
     * 插入一条教师记录,teacher的每个参数都不能为空
     * @param teacher
     */
    int insertComplete(Teacher teacher);

    /**
     * 插入一条教师记录，teacher的部分参数可以为空
     * @param teacher
     */
    int insertSelective(Teacher teacher);

    /**
     * 更新教师
     * @param teacher
     * @return
     */
    int updateByPrimaryKeyComplete(Teacher teacher);

    /**
     * 更新教师，可以部分为空
     * @param teacher
     * @return
     */
    int updateByPrimaryKeySelective(Teacher teacher);

    /**
     * 根据教师id删除记录
     * @param teacherId
     * @return
     */
    int deleteByPrimaryKey(String teacherId);

    /**
     * 插入学生选课记录
     * @param params
     * @return
     */
    int importStudents(@Param("params") Map<String,String> params);

}
