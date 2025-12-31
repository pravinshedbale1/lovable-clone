package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.project.DetailedProjectResponse;
import com.javacommune.lovablebackend.dto.project.ProjectRequest;
import com.javacommune.lovablebackend.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getAllProjects(Long userId);

    DetailedProjectResponse getProject(Long projectId, Long userId);

    DetailedProjectResponse createProject(ProjectRequest request, Long userId);

    DetailedProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
