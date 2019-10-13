package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Resource
	StudentMapper studentMapper;

	@Override
	public List<Student> selectStudent() {
		return studentMapper.selectStudent();
	}
}
