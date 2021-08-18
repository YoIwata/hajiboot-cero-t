package com.example.hajibootcerot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootCeroTApplication {

	@Autowired
	private PlanDao planDao;

	@GetMapping("/getPlan")
	public Plan run() {
		return planDao.getPlan();
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootCeroTApplication.class, args);
	}

}
