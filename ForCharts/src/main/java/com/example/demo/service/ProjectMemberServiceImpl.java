package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectMember;
import com.example.demo.repository.ProjectMemberRepository;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

	@Autowired
	private ProjectMemberRepository projectMemberRepo;
	
	@Override
	public List<ProjectMember> getworkForce(Long projectId) {
		// TODO Auto-generated method stub
		return projectMemberRepo.findByProjectId(projectId);
	}

}
