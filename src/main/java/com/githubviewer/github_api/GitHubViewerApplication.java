package com.githubviewer.github_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GitHubViewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubViewerApplication.class, args);
	}

}
