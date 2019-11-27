package com.example.demo.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.ProjectMember;

public class ProjectMemberRepositoryImpl implements ProjectMemberRepositoryCustom {

	@Autowired
	public ProjectMemberRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	private EntityManager entityManager;
	
	
	@Override
	public List<ProjectMember> findByProjectId(Long theProjectId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from ProjectMember as pm join Project as p on p.projectId=pm.projectId where p.projectId=:theProjectId");
		query.setParameter("theProjectId", Long.valueOf(theProjectId));
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
