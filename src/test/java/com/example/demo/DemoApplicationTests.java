package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("This is my test app");
	}
	public String Springtimes(String str, int n){
		String ans = "";
		for (int i =0; i<n; i++){
			ans = ans + str;
		}
		return ans;
	}
	@Test
	public void testSpringtimes(){
		Assertions.assertEquals("HiHi", Springtimes("Hi",2));
		Assertions.assertEquals("HiHiHiHi", Springtimes("Hi",4));
	}
}
