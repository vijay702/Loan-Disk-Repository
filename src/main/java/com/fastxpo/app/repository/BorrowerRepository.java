package com.fastxpo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastxpo.app.entity.BorrowerEntity;

public interface BorrowerRepository extends JpaRepository<BorrowerEntity, Long> {
	
	
	

}
