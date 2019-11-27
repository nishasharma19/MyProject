package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Project;

public interface ProjectService {

	public Optional<Project> getProjects(Long projectId);
}
