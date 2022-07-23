package com.demo; 
 
import java.util.Iterator; 
import java.util.LinkedList; 
import java.util.List; 
 
public class Library { 
 
    private List books; 

     
    /** 
     * Searches tgiven word  
     * in title, author or publisher field. 
     * Relates to @wi TEST-514 full-text search is needed 
     */ 
    public Book[] search(String word) { 
        List result = new LinkedList(); 

        return (Book[])result.toArray(new Book[result.size()]); 
    } 

} 