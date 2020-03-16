package com.exitium.campaignchronicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CampaignchronicleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignchronicleApplication.class, args);
	}

}
