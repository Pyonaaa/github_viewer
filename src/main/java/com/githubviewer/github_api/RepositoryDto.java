package com.githubviewer.github_api;


import java.util.List;

public record RepositoryDto(
        String name,
        String ownerLogin,
        List<GitHubBranchResponse> branches
) {}