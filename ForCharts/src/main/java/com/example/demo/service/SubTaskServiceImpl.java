package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Subtask;
import com.example.demo.entity.Task;
import com.example.demo.repository.SubTaskRepository;

@Service
public class SubTaskServiceImpl implements SubTaskService {

	@Autowired
	private SubTaskRepository subTaskRepo;
	
	@Autowired
	private TaskChartService taskService;
	
	@Override
	public List<Subtask> viewSubTasks(Long taskId) {
		// TODO Auto-generated method stub
		Optional<Task> tasks = taskService.getTaskById(taskId);
		List<Subtask> subtasks = subTaskRepo.findByTaskId(tasks);
		return subtasks;
	}
	

}
