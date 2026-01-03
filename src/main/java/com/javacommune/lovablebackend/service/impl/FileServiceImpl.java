package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.project.FileContentResponse;
import com.javacommune.lovablebackend.dto.project.FileNode;
import com.javacommune.lovablebackend.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
