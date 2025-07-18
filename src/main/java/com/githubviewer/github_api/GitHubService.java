package com.githubviewer.github_api;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class GitHubService {
    private final GitHubClient gitHubClient;
    public GitHubService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }


    public List<RepositoryDto> getRepositories(String username) {
        return gitHubClient.getRepos(username).stream()
                .filter(repo -> !repo.isFork())
                .map(repo -> new RepositoryDto(
                        repo.getName(),
                        repo.getOwner().getLogin()
                ))
                .collect(Collectors.toList());
    }
}
