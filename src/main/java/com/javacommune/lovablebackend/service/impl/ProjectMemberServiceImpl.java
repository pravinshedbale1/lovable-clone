package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.member.InviteMemberRequest;
import com.javacommune.lovablebackend.dto.member.MemberResponse;
import com.javacommune.lovablebackend.dto.member.UpdateMemberRoleRequest;
import com.javacommune.lovablebackend.entity.Project;
import com.javacommune.lovablebackend.entity.ProjectMember;
import com.javacommune.lovablebackend.mapper.ProjectMemberMapper;
import com.javacommune.lovablebackend.repository.ProjectMemberRepository;
import com.javacommune.lovablebackend.service.ProjectMemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ProjectMemberServiceImpl implements ProjectMemberService {
    ProjectMemberRepository projectMemberRepository;
    ProjectMemberMapper projectMemberMapper;
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
//        List<ProjectMember> projectMembers= projectMemberRepository.findByProjectId(projectId, userId);
//        return projectMemberMapper.toProjectMemberResponse(projectMembers);
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
