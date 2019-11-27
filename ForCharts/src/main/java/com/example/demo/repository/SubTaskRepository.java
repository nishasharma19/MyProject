package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Subtask;
import com.example.demo.entity.Task;

@Repository
public interface SubTaskRepository extends JpaRepository<Subtask, Long> {
	public List<Subtask> findByTaskId(Optional<Task> tasks);
	

}
