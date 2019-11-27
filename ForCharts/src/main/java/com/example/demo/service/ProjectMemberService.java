package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ProjectMember;

public interface ProjectMemberService {

	public List<ProjectMember> getworkForce(Long projectId);
}
