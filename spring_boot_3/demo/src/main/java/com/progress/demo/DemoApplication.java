package com.progress.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		


	}
}

