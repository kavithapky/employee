package com.employee.empEntity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="EmployeeDetails")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private float experiance;
private int salary;
private String role;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", experiance=" + experiance + ", salary=" + salary + ", role="
			+ role + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getExperiance() {
	return experiance;
}
public void setExperiance(float experiance) {
	this.experiance = experiance;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
