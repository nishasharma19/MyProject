package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.composite.ProjectMemberComposite;
import com.example.demo.entity.ProjectMember;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberComposite>, ProjectMemberRepositoryCustom {

}
