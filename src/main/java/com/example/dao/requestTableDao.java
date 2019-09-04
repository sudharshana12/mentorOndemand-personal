package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.RequestTable;

public interface requestTableDao extends JpaRepository<RequestTable, Integer> {

	
}
