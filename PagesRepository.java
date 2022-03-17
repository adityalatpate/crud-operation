package com.javatpoint.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Books;
import com.javatpoint.model.Pages;

//repository that extends CrudRepository
public interface PagesRepository extends CrudRepository<Pages, Integer>
{
	
}