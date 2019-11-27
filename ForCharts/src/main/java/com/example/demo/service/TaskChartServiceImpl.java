package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;


@Service
public class TaskChartServiceImpl implements TaskChartService {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TaskRepository taskRepo;
	
	@Override
	public List<Task> getTasks(Long projectId) {
		// TODO Auto-generated method stub
		
		Optional<Project> project = projectService.getProjects(projectId);
		List<Task> tasks = taskRepo.findByProjectId(project);
		
		return tasks;
	}

	@Override
	public Optional<Task> getTaskById(Long taskId) {
		// TODO Auto-generated method stub
		return taskRepo.findById(taskId);
	}
	

}
