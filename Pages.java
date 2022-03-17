package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

//Marked a class as an entity
@Entity
//defining table as a class
//Pages class as a Products Table
@Table
public class Pages {
	
	@Column
	private int bookid;

	@Column
	private String content;

	@Column
	private String chapter;
	
	//defining price as primary key
	@Id
	@Column
	private int pageno;

	//Created getters and setters of all the columns
	public int getBookid() 
	{
	return bookid;
	}
	public void setBookid(int bookid) 
	{
	this.bookid = bookid;
	}
	
	
	public String getContent()
	{
	return content;
	}
	public void setContent(String content) 
	{
	this.content = content;
	}
	
	
	public String getChapter() 
	{
	return chapter;
	}
	public void setChapter(String chapter) 
	{
	this.chapter = chapter;
	}
	
	
	public int getPageno() 
	{
	return pageno;
	}
	public void setPageno(int pageno) 
	{
	this.pageno = pageno;
	}
	
	
	
}
