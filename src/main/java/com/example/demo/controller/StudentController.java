package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
//sadassadasasdassssssssadsazz
@Controller
public class StudentController {

	@Resource
	StudentService studentService;
	
	@Resource
	RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Student> list = studentService.selectStudent();
		
		model.addAttribute("list", list);
		return "list";
		
	}
	@RequestMapping("toadd")
	public String toadd() {
		return "add";
		
		
		
		
		
		
		
	}
	//zxczxcxzzzzz
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
		ListOperations<String, Object> opsForList = redisTemplate.opsForList();
		Long leftPush = opsForList.leftPush("studentList", student);
		return "add";
		
	}
	
}
