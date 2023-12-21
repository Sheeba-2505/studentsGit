package com.oasys.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.students.dao.StudentDao;
import com.oasys.students.entity.Students;
@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String postValue(Students s) {
		return sd.postVale(s);
	}

	public List<Students> getValue() {
		return sd.getValue();
	}

	public Students putValue(Students p) {
		return sd.putValue(p);
	}

	public Students deleteValue(Students s) {
		return sd.deleteValue(s);
		
	}

	public Students getByValue(int num) {
		return sd.getByValue(num);
	}

}
