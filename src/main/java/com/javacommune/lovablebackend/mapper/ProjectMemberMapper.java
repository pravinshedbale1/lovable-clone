package com.javacommune.lovablebackend.mapper;

import com.javacommune.lovablebackend.dto.member.MemberResponse;
import com.javacommune.lovablebackend.entity.ProjectMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {
    /*
    MY APPROACH OF GETTING MEMBERS
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "avatarUrl", source = "user.avatarUrl")
    @Mapping(target = "role", source = "projectRole")
    MemberResponse toProjectMemberResponse(ProjectMember projectMember);
    List<MemberResponse> toProjectMemberResponse(List<ProjectMember> projectMember);*/
}
