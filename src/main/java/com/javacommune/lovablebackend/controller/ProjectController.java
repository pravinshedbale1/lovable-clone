package com.javacommune.lovablebackend.controller;

import com.javacommune.lovablebackend.dto.project.DetailedProjectResponse;
import com.javacommune.lovablebackend.dto.project.ProjectRequest;
import com.javacommune.lovablebackend.dto.project.ProjectSummaryResponse;
import com.javacommune.lovablebackend.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getAllProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailedProjectResponse> getProject(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getProject(id, userId));
    }

    @PostMapping
    public ResponseEntity<DetailedProjectResponse> createProject(@RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<DetailedProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        projectService.softDelete(id, userId);
        return ResponseEntity.noContent().build();
    }
}
