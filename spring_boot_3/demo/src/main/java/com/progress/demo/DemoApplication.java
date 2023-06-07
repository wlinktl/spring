package com.progress.demo;

// The import java.util.Arrays is never used
import java.util.HashMap;
// The import java.util.List is never used
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// create a hashmap of (integer -> String) and print the map using forEach
		// method
		
		Map<Integer, String> map = new HashMap<>();
		 map.put(1, "one");
		 map.put(2, "two");

		 map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

		 //update 1001 to "one thousand one"

		 System.out.println("Before update: " + map.get(1));

		


	}

	//Design an algorithm to remove duplicated items in a list of integer
	//The algorithm should be able to handle a list of any size 

}

