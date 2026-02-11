package com.employee.empDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Repository

public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String pod(Employee e) {
		er.save(e);
		return "Save Successfully";
	}
	public String mtd(List<Employee> a) {
		er.saveAll(a);
		return "save All successfully";
	}
	public Employee getda(int a) {
		Employee x=er.findById(a).get();
		return x;
	}
	public List<Employee> getal(){
		List<Employee> y=er.findAll();
		return y;
	}
	public String updatedata(Employee e,int a) {
		Employee c=er.findById(a).get();
		c.setName(e.getName());
		c.setExperiance(e.getExperiance());
		c.setSalary(e.getSalary());
		c.setRole(e.getRole());
		er.save(c);
		return "Update successfully";
		
	}
	public String patdata(Employee e,int a) {
		Employee f=er.findById(a).get();
		f.setName(e.getName());
		er.save(f);
		return " field successfully updated";
	}
	public String del(int s) {
		er.deleteById(s);
		return "deleted successfully";
		
	}
	public String dell() {
		er.deleteAll();
		return "deleted All Successfully";
	}

}
