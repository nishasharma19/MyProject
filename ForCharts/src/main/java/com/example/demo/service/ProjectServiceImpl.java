package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	
	@Autowired
	private ProjectRepository projectRepo;
	
	@Override
	public Optional<Project> getProjects(Long projectId) {
		// TODO Auto-generated method stub
		return projectRepo.findById(projectId);
	}

}
