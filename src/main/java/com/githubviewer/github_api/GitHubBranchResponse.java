package com.githubviewer.github_api;

import lombok.Data;

@Data
public class GitHubBranchResponse {
    private String name;
    private Commit commit;

    @Data
    public static class Commit {
        private String sha;
    }
}