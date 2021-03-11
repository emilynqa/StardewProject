package com.qa.stardewproject;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.stardewproject.domain.Villager;

@SpringBootApplication
public class StardewValleyApplication {

	@Bean
	public List<Villager> makeListVillager() {
		List<Villager> villagers = new ArrayList<>();
		villagers.add(new Villager());
		return villagers;
	}

	public static void main(String[] args) {
		SpringApplication.run(StardewValleyApplication.class, args);
	}

}
