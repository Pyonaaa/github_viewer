package com.githubviewer.github_api;

public class RepositoryDto {
    private final String name;
    private final String ownerLogin;

    public RepositoryDto(String name, String ownerLogin) {
        this.name = name;
        this.ownerLogin = ownerLogin;
    }

    public String getName() {
        return name;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }
}