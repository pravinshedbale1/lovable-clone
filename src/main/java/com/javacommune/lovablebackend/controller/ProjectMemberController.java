package com.javacommune.lovablebackend.controller;

import com.javacommune.lovablebackend.dto.member.InviteMemberRequest;
import com.javacommune.lovablebackend.dto.member.MemberResponse;
import com.javacommune.lovablebackend.dto.member.UpdateMemberRoleRequest;
import com.javacommune.lovablebackend.enums.ProjectRole;
import com.javacommune.lovablebackend.service.ProjectMemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project/{projectId}/member")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProjectMemberController {
    ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(@PathVariable Long projectId) {
        Long userId = 1L;
        return  ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    @PostMapping("/invite")
    public ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId, @RequestBody InviteMemberRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.inviteMember(projectId, request, userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(@PathVariable Long projectId, @PathVariable Long memberId, @RequestBody UpdateMemberRoleRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));
    }


    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteProjectMember(@PathVariable Long projectId, @PathVariable Long memberId) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId, memberId, userId));
    }

}
