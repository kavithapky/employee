package com.employee.empController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empService.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="singledata")
	public String pod(@RequestBody Employee e) {
		return es.pod(e);
	}
	@PostMapping(value="multidata")
	public String mtd(@RequestBody List<Employee> a) {
		return es.mtd(a);
	}

	@GetMapping(value="get/{a}")
	public Employee getda(@PathVariable int a) {
		return es.getda(a);
	}
	@GetMapping(value="getall")
	public List<Employee> getal(){
		return es.getal();
	}
	@PutMapping(value="update/{a}")
	public String updatedata(@RequestBody Employee e,@PathVariable int a) {
		return es.updatedata(e,a);
	}
	@PatchMapping(value="patchdata/{a}")
	public String patdata(@RequestBody Employee e,@PathVariable int a) {
		return es.patdata(e,a);
	}
	@DeleteMapping(value="delete/{s}")
	public String del(@PathVariable int s) {
		return es.del(s);
	}
	@GetMapping(value="maxsalary")
	public int getmax() {
		return es.getmax();
	}
	@GetMapping(value="objmax")
	public Employee obmax() {
		return es.obmax();
	}
	@GetMapping(value="secmax")
	public int smax() {
		return es.smax();
	}
	@GetMapping(value="objsmax")
	public Employee obsmax() {
		return es.obsmax();
	}
	@GetMapping(value="brand")
	public List<String> br() {
		return es.br();
	}
	@GetMapping(value="names/{a}")
	public List<Employee> na(@PathVariable String a){
		return es.na(a);
	}
	@GetMapping(value="sal/{a}/{b}")
	public List<Employee> two(@PathVariable int a,@PathVariable int b){
		return es.two(a,b);
	}
	@DeleteMapping(value="deleteall")
	public String dell() {
		return es.dell();
	}
	@GetMapping(value="even")
	public List<String> name(){
		return es.name();
	}
	@GetMapping(value="sort")
	public int ssmax() {
		return es.ssmax();
	}
	@GetMapping(value="smalltobig")
	public List<Employee> sb(){
		return es.sb();
	}
	@GetMapping(value="salaryassanding")
	public List<Integer> ass(){ 
		return es.ass();
	}
	@GetMapping(value="sumsal")
	public int sal() {
		return es.sal();
	}
	@GetMapping(value="sal2")
	public List<String> sal2() {
		return es.sal2();
	}
}
