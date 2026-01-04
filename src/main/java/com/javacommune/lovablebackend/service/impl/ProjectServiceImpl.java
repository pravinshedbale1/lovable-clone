package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.project.DetailedProjectResponse;
import com.javacommune.lovablebackend.dto.project.ProjectRequest;
import com.javacommune.lovablebackend.dto.project.ProjectSummaryResponse;
import com.javacommune.lovablebackend.entity.Project;
import com.javacommune.lovablebackend.entity.User;
import com.javacommune.lovablebackend.mapper.ProjectMapper;
import com.javacommune.lovablebackend.repository.ProjectRepository;
import com.javacommune.lovablebackend.repository.UserRepository;
import com.javacommune.lovablebackend.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {
    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public List<ProjectSummaryResponse> getAllProjects(Long userId) {
        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public DetailedProjectResponse getProject(Long projectId, Long userId) {
        var project = projectRepository.findAccessibleProjectById(projectId, userId).orElseThrow();
        return projectMapper.toDetailedProjectResponse(project);
    }

    @Override
    public DetailedProjectResponse createProject(ProjectRequest request, Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder().name(request.name()).owner(user).isPublic(false).build();
        project = projectRepository.save(project);
        return projectMapper.toDetailedProjectResponse(project);
    }

    @Override
    public DetailedProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        Project project = getAccessibleProjectById(id, userId);
        project.setName(request.name());
        project = projectRepository.saveAndFlush(project);
        return projectMapper.toDetailedProjectResponse(project);
    }

    @Override
    public void softDelete(Long id, Long userId) {
        Project project = getAccessibleProjectById(id, userId);
        project.setDeletedAt(Instant.now());
        project = projectRepository.saveAndFlush(project);
    }

    public Project getAccessibleProjectById(Long projectId, Long userId) {
        return projectRepository.findAccessibleProjectById(projectId, userId).orElseThrow();
    }
}