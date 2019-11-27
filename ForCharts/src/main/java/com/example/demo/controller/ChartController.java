package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.entity.ProjectMember;
import com.example.demo.entity.Subtask;
import com.example.demo.entity.Task;
import com.example.demo.service.ProjectMemberService;
import com.example.demo.service.ProjectService;
import com.example.demo.service.SubTaskService;
import com.example.demo.service.TaskChartService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ChartController {
	
	@Autowired
	private TaskChartService taskChartService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private SubTaskService subtaskService;
	@Autowired
	private ProjectMemberService projectMemService;
	
	@RequestMapping("/getProject/{projectId}")
	@ResponseBody
	public Optional<Project> getProject(@PathVariable(value = "projectId") Long projectId){
		return projectService.getProjects(projectId);
	}
	
	
	@RequestMapping("/getTaskChart/{projectId}")
	@ResponseBody
	public List<Task> getTaskChart(@PathVariable(value = "projectId") Long projectId){
		return taskChartService.getTasks(projectId);
	}

	@RequestMapping("/workForce/{projectId}")
	@ResponseBody
	public List<ProjectMember> workForce(@PathVariable(value = "projectId") Long projectId){
		return projectMemService.getworkForce(projectId);
	}
	
	@RequestMapping("/viewSubtasks/{taskId}")
	public List<Subtask> viewSubTasks(@PathVariable(value = "taskId") Long taskId) {
		return subtaskService.viewSubTasks(taskId);
		
	}
}
