package com.tokaku.studemo.service;

import com.tokaku.studemo.pojo.Student;

import java.util.List;

public interface StudentService {

//    int querySize();
//
//    Student queryStuById(String studyid);
//
//    List<Student> queryStuByLimit(int startpage, int pageSize);

    List<Student> queryStudentList();

    //    boolean addStu(Student student);
//
//    int updateStu(Student stu);
//
    int deleteStudent(String sno);
}
