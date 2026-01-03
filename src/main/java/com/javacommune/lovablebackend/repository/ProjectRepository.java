package com.javacommune.lovablebackend.repository;

import com.javacommune.lovablebackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("""
        select p FROM Project p
        WHERE p.deletedAt IS NULL
        AND (p.owner.id = :userId OR p.isPublic = true)
        ORDER BY p.updatedAt DESC
    """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);
}
