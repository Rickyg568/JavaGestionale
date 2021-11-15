/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entrypoint.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ricca
 */
public class Book {

   
    private String name,authors;
    private String genres;
    
    public Book(String name,String genres,String authors)
    {
        this.name = name;
        this.genres = genres;
        this.authors = authors;
    }

    
    
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public void setGenres(String genres) {
        this.genres = genres;
    }
    
    
    public Map<String,String> GetMapData(){
        Map<String,String> toReturn = new HashMap<>();
        
        toReturn.put("Name",name);
        toReturn.put("Author",authors);
        toReturn.put("Genre",genres);

        return toReturn;
    }
    
    public String getName() {
        return name;
    }
    public String getAuthors() {
        return authors;
    }
    public String getGenres() {
        return genres;
    }
}
