package com.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.entity.RecipesEntity;

public interface RecipesRepository extends JpaRepository<RecipesEntity, Integer>{
	public  RecipesEntity findByRecipesName(String recipesName);
}
