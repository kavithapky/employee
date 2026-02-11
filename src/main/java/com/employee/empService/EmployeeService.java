
package com.employee.empService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.empDao.EmployeeDao;
import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	
	public String pod(Employee e) {
		return ed.pod(e);
	}
	public String mtd(List<Employee> a) {
		return ed.mtd(a);
	}
	public Employee getda(int a) {
		return ed.getda(a);
	}
 public List<Employee> getal(){
	 return ed.getal();
 }
 public String updatedata(Employee e,int a) {
	 return ed.updatedata(e,a);
	 
 }
 public String patdata(Employee e,int a) {
	 return ed.patdata(e,a);
 }
 public String del(int s) {
	 return ed.del(s);
 }
 public String dell() {
	 return ed.dell();
 }
 @Autowired
	EmployeeRepository er;
 public int getmax() {
	 List<Employee> y=er.findAll();
	 int a=y.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	 return a;
 }
 public Employee  obmax() {
	 List<Employee> x=er.findAll();
	 Employee j=x.stream().max(Comparator.comparing(Employee::getSalary)).get();
	 return j;
	 
 }
 public int smax() {
	 List<Employee> x=er.findAll();
	 int s=x.stream().map(y->y.getSalary()).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
	 return s;
 }
 public Employee obsmax() {
	 List<Employee> y=er.findAll();
	 Employee s=y.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(4).limit(1).findFirst().get();
	 return s;
 }
 public List<String> br() {
	 List<Employee> x=er.findAll();
	 List<String> s=x.stream().map(y->y.getName()).collect(Collectors.toList());
	 return s;
 }
 public List<Employee> na(String a){
	 List<Employee> x=er.findAll();
	 List<Employee> s=x.stream().filter(y->y.getName().equals(a)).collect(Collectors.toList());
	 return s;
 }
 public List<Employee> two(int a,int b){
	 List<Employee> x=er.findAll();
	 List<Employee> s=x.stream().filter(y->y.getSalary()>a&&y.getSalary()<b).collect(Collectors.toList());
      return s;
 }
 public List<String> name(){
	 List<Employee> c=er.findAll();
	 List<String> s=c.stream().filter(x->x.getName().length()%2==0).map(y->y.getName()).collect(Collectors.toList());
	 return s;
 }
 public int ssmax() {
	 List<Employee> x=er.findAll();
	 int s=x.stream().map(y->y.getSalary()).sorted().skip(1).findFirst().get();
	 return s;
 }
 public List<Employee> sb(){
	 List<Employee> x=er.findAll();
	 List<Employee> s=x.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	 return s;
 }
 public List<Integer> ass(){
	 List<Employee> v=er.findAll();
	 List<Integer> s=v.stream().map(x->x.getSalary()).sorted().collect(Collectors.toList());
	 return s;
 }
 public int sal() {
	 List<Employee> a=er.findAll();
	 int s=a.stream().collect(Collectors.summingInt(x->x.getSalary()));
	 return s;
 }
 
 
}
	