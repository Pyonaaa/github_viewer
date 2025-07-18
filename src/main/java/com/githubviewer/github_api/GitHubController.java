package com.githubviewer.github_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repositories")
public class GitHubController {

    private final GitHubService gitHubService;

    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }




    @GetMapping("/{username}")
    public ResponseEntity<?> getUserRepositories(@PathVariable String username) {
        try {
            return ResponseEntity.ok(gitHubService.getRepositories(username));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ErrorResponse(404, String.format("User '%s' not found", username)));
        }
    }
    public record ErrorResponse(int status, String message) {}
}