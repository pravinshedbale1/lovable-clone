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

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
//        return projects.stream().map(projectMapper::toProjectSummaryResponse).collect(Collectors.toList());
    }

    @Override
    public DetailedProjectResponse getProject(Long projectId, Long userId) {
        return null;
    }

    @Override
    public DetailedProjectResponse createProject(ProjectRequest request, Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder().name(request.name()).owner(user).isPublic(false).build();
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public DetailedProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
