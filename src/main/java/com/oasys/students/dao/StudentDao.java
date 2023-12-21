package com.oasys.students.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.students.entity.Students;
import com.oasys.students.repository.StudentRepository;
@Repository
public class StudentDao {
@Autowired
StudentRepository sr;
	public String postVale(Students s) {
		 sr.save(s); 
		 return "Successfully posted";
	}
	public List<Students> getValue() {
		return sr.findAll();
	}
	public Students putValue(Students p) {
		return sr.save(p);
	}
	public Students deleteValue(Students s) {
		 sr.delete(s);
		 return s;
	}
	public Students getByValue(int num) {
	    return sr.findById(num).get();
	}


}
