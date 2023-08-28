package com.Nilesh.restapi.day6.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nilesh.restapi.day6.model.ChildrenModel;

@Repository
public interface ChildrenRepo extends JpaRepository<ChildrenModel, Integer>{

}