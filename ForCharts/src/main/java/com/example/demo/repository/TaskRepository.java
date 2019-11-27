package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Project;
import com.example.demo.entity.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
public List<Task>  findByProjectId(Optional<Project> project);

}
