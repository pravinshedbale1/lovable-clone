package com.javacommune.lovablebackend.repository;

import com.javacommune.lovablebackend.entity.ProjectMember;
import com.javacommune.lovablebackend.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {
    /*
        MY APPROACH OF GETTING MEMBERS
        @Query("""
            SELECT p FROM project_members p
            LEFT JOIN FETCH p.project proj
            LEFT JOIN FETCH proj.owner
            LEFT JOIN FETCH p.user
            WHERE proj.owner.id = :userId
                AND proj.id = :projectId
        """)
        List<ProjectMember> findByProjectId(@Param("projectId") Long projectId, @Param("userId") Long userId);
     */
}
