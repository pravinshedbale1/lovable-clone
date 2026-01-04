package com.javacommune.lovablebackend.mapper;

import com.javacommune.lovablebackend.dto.project.DetailedProjectResponse;
import com.javacommune.lovablebackend.dto.project.ProjectSummaryResponse;
import com.javacommune.lovablebackend.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    DetailedProjectResponse toDetailedProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
