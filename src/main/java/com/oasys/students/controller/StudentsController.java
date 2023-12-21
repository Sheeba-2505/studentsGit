package com.oasys.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.students.entity.Students;
import com.oasys.students.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/student")
public class StudentsController {
@Autowired
StudentService ss;
@PostMapping(value="/add")
public String postValue(@RequestBody Students s) {
	return ss.postValue(s);
}
@GetMapping(value="/getall")
public List<Students> getValue() {
	return ss.getValue();
}
@PutMapping(value="/update")
public Students putValue(@RequestBody Students p) {
	return ss.putValue(p);
}

@DeleteMapping(value="/delete/{s}")
public Students deleteValue(@PathVariable Students s){
	return ss.deleteValue(s);
}

@GetMapping(value="/getById/{num}")
public Students getByValue(@PathVariable int num) {
	return ss.getByValue(num);
}

}
