package com.easyCourse.service;

import com.easyCourse.vo.LessonVO;
import net.minidev.json.JSONObject;

import java.util.List;

/**
 * 课程服务接口
 * <p>
 * Created by devin
 * 2019-05-06 19:50
 */
public interface LessonService {

    /**
     * 根据教师id获取其课程信息
     *
     * @param teacherId 教师id
     * @return 课程信息
     */
    JSONObject getByTeacherId(String teacherId);

    /**
     * 教师添加课程
     *
     * @param lessonName   课程名
     * @param lessonTime   课程时间
     * @param lessonDetail 课程详情
     * @param teacherId    教师id
     * @return 添加结果
     */
    JSONObject addLesson(String lessonName, String lessonTime, String lessonDetail, String teacherId);
}
