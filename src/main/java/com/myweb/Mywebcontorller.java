package com.myweb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mywebcontorller {
	@GetMapping (value="get")
	
	public String get() {
		return "Hello World";
	}
    @GetMapping (value="put")
		public String name() {
			String name="kavi puru";
			return name;
		}
	@GetMapping (value="inth")
	public int g() {
		int g=10;
		return g;
	}
	@GetMapping (value="ram")
	public int f(int a,int b) {
		int c=a+b;
		return c;
		
	}
	@GetMapping (value="get1/{a}")
	public String getd(@PathVariable String a) {
		return a+"is a language";
	}
	@GetMapping(value="get2/{b}")
	public String geth(@PathVariable int b) {
		if(b%2==0) {
		return b+"even number";
		}
		else {
			return b+"odd number";
		}
	}
	@GetMapping(value="get3/{a}/{b}/{c}")
	public String getc(@PathVariable int a,@PathVariable int b,@PathVariable int c) {
		if(a>b) {
			return a+"highest number";
		}
		else if(b>c){
			return b+"heighest number";
		}
		else {
			return c+"heighest number";
		}
	}
	@GetMapping(value="get4/{a}/{b}")
	public List<Integer> getg(@PathVariable int a,@PathVariable int b) {
	ArrayList<Integer> c=new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				c.add(i);
				
			}
		
		}
		return c;
	}
	@GetMapping (value="get5")
	public String getk(@RequestParam String name,@RequestParam String password) {
		if(name.equals("onesoft")&&password.equals("one123")) {
			return "login success";
		}
		else {
			return "login fails";
		}
	
		
	}
	@GetMapping(value="single")
	public Mobile s(@RequestBody Mobile m1) {
		return m1;
	}
	@GetMapping(value="singleobject")
	public List<Mobile> singleob(@RequestBody List<Mobile> m) {
    
		return  m;
	}
	@GetMapping(value="obj")
	public List<String> getob(@RequestBody List<Mobile> m2) {
		List<String>  b=m2.stream().map(x->x.getName()).collect(Collectors.toList());
		return b;
	}
	@GetMapping(value="max")
	public int getm(@RequestBody List<Mobile> m3){
		int  c=m3.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		return c;
	}
	@GetMapping(value="objmax")
	public Mobile gets(@RequestBody List<Mobile> c) {
		Mobile a=c.stream().max(Comparator.comparing(Mobile::getPrice)).get();
		return a;
	}
	@GetMapping(value="secmax")
	public int getma(@RequestBody List<Mobile> a) {
		int secm=a.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		return secm;
				
	}
	@GetMapping(value="objsmax")
	public Mobile getsm(@RequestBody List<Mobile> a) {
		Mobile objectsmax=a.stream().sorted(Comparator.comparing(Mobile::getPrice)).skip(1).findFirst().get();
		return objectsmax;
		
	}
	@GetMapping(value="getobj/{a}")
	public List<Mobile> getk(@RequestBody List<Mobile> m,@PathVariable String a){
		List<Mobile> a1=m.stream().filter(x->x.getName().equals(a)).collect(Collectors.toList());
		    return a1;
	}
	@GetMapping(value="get8/{a}/{b}")
	public List<Mobile> getk(@PathVariable List<Mobile> m,@PathVariable int a,@PathVariable int b){
		List<Mobile> d=m.stream().filter(x->x.getPrice()>a&&x.getPrice()<b).collect(Collectors.toList());
		return d;
	}
	

}
