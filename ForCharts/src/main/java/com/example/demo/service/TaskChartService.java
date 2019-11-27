package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Project;
import com.example.demo.entity.Task;

public interface TaskChartService {

	public List<Task> getTasks(Long projectId);
	public Optional<Task> getTaskById(Long taskID);
}
