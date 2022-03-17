package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Pages;
import com.javatpoint.repository.PagesRepository;


//defining logic
@Service
public class PagesService {
	
	@Autowired
	PagesRepository pagesRepository;

	//getting all the record by using the findaAll() method of CrudRepository
	public List<Pages> getAllPages() 
	{
	List<Pages> pages = new ArrayList<Pages>();
	pagesRepository.findAll().forEach(pages1 -> pages.add(pages1));
	return pages;
	}


	//getting a specific record by using the findById() method of CrudRepository
	public Pages getPagesById(int id) 
	{
	return pagesRepository.findById(id).get();
	}


	//saving a specific record by using the save() method of CrudRepository
	public void saveOrUpdate(Pages pages) 
	{
		pagesRepository.save(pages);
	}


	//deleting a specific record by using the deleteById() method of CrudRepository
	public void delete(int id) 
	{
		pagesRepository.deleteById(id);
	}


	//updating a record
	public void update(Pages pages, int bookid) 
	{
		pagesRepository.save(pages);
	}
	
}
