package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.member.InviteMemberRequest;
import com.javacommune.lovablebackend.dto.member.MemberResponse;
import com.javacommune.lovablebackend.dto.member.UpdateMemberRoleRequest;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
