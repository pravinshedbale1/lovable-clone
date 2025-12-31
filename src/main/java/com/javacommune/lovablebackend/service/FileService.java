package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.project.FileContentResponse;
import com.javacommune.lovablebackend.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
