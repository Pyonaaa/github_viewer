package com.githubviewer.github_api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {
    @GetMapping("/users/{username}/repos")
    List<GitHubRepoResponse> getRepos(@PathVariable("username") String username);

    @GetMapping("/repos/{owner}/{repo}/branches")
    List<GitHubBranchResponse> getBranches(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo
    );
}