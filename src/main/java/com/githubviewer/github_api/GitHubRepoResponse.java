package com.githubviewer.github_api;

import lombok.Data;

@Data
public class GitHubRepoResponse {
    private String name;
    private Owner owner;
    private boolean fork;

    @Data
    public static class Owner {
        private String login;
    }
}