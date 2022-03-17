package com.javatpoint.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Pages;
import com.javatpoint.service.PagesService;


//marked a class as Controller
@RestController
public class PagesController {

	//autowire the pagesService class
	@Autowired
	PagesService pagesService;

	//creating a get mapping that retrieves all the pages detail from the database 
	@GetMapping("/page")
	private List<Pages> getAllPages() 
	{
	return pagesService.getAllPages();
	}


	//creating a get mapping that retrieves the detail of a specific page from the database
	@GetMapping("/page/{bookid}")
	private Pages getPages(@PathVariable("bookid") int bookid) 
	{
		return pagesService.getPagesById(bookid);
	}


	//creating a delete mapping that deletes a specified book
	@DeleteMapping("/page/{bookid}")
	private void deletePage(@PathVariable("bookid") int bookid) 
	{
		pagesService.delete(bookid);
	}


	//creating post mapping that post the book detail in the database
	@PostMapping("/pages")
	private int savePage(@RequestBody Pages pages) 
	{
		pagesService.saveOrUpdate(pages);
		return pages.getBookid();
	}


	//creating put mapping that updates the book detail 
	@PutMapping("/pages")
	private Pages update(@RequestBody Pages pages) 
	{
		pagesService.saveOrUpdate(pages);
		return pages;
	}
	
}
