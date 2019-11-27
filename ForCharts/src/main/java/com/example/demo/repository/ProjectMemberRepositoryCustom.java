package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.ProjectMember;

public interface ProjectMemberRepositoryCustom {

	public List<ProjectMember> findByProjectId(Long theProjectId);
}
