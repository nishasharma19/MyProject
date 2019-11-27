package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Subtask;

public interface SubTaskService {

	public List<Subtask> viewSubTasks(Long taskId);
}
