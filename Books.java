package com.javatpoint.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//marked a class as an Entity 
@Entity
//defining Table as class
//Books class as a Category Table
@Table
public class Books
{

//defining book id as primary key
@Id
@Column
private int bookid;

@Column(unique = true)
private String bookname;

@Column
private String author;

@Column
private int price;

//Created getters and setters of all the columns
public int getBookid() 
{
return bookid;
}
public void setBookid(int bookid) 
{
this.bookid = bookid;
}
public String getBookname()
{
return bookname;
}
public void setBookname(String bookname) 
{
this.bookname = bookname;
}
public String getAuthor() 
{
return author;
}
public void setAuthor(String author) 
{
this.author = author;
}
public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}

//Applying One to many relation
@OneToMany(targetEntity = Pages.class, cascade = CascadeType.ALL)
@JoinColumn(name = "cp_fk", referencedColumnName = "bookid")
private List<Pages> pages;

}