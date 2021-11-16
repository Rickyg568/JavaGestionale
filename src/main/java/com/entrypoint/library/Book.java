/*
 * Class : Book
 *
 * Version info : 0.2.0
 *
 * Copyright notice : none
 */
package com.entrypoint.library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Abstraction of books.
 *
 * @version 0.2 16 Nov 2021
 * @author Riccardo Grassi
 */

public class Book {
    //Variables
    private String title; 
    private ArrayList<String> authors;
    private ArrayList<String> genres;
    
    /*
    *   Public constructor.
    *   Variations:
    *       -Clone
    *       -New initialization
    */
    
    public Book(){
        title = new String();
        authors = new ArrayList<>();
        genres = new ArrayList<>();
    }
    public Book(Book clone){
        title = clone.title;
        authors = clone.authors;
        genres = clone.genres;
    }
    public Book(String Title, ArrayList<String> Authors, ArrayList<String> Genres){
        if(!Title.isEmpty())
            title = Title;
        else
            title = "null value";
        
        if(!Authors.isEmpty())
            authors = Authors;
        else
            authors = new ArrayList<>();
        
        if(!Genres.isEmpty())
            genres = Genres;
        else
            genres = new ArrayList<>();        
    }
    
    /*
    *   Setters.
    *   Variations:
    *       -None
    */
    public void _setTitle(String Title) {
        title = Title;
    }
    public void _setAuthors(ArrayList<String> Authors) {
        authors = Authors;
    }
    public void _setGenres(ArrayList<String> Genres) {
        genres = Genres;
    }
    
    /*
    *   Getters.
    *   Variations:
    *       -None
    */
    public String _getTitle() {
        return title;
    }
    public ArrayList<String> _getAuthors() {
        return authors;
    }
    public ArrayList<String> _getGenres() {
        return genres;
    }
    
    /*
    *   Map data For Json Encoding.
    *   Variations:
    *       -None
    */
    public ArrayList<Map<String,String>> GetMapData(){
        //Variables Needed
        ArrayList<Map<String,String>> mapData = new ArrayList<>();
        Map<String,String> tmp = new HashMap<>();
        int counter = 1;
        
        // 0 -> title   
        tmp.put("Title", title);
        mapData.add(tmp);
        tmp = new HashMap<>();
        
        // 1 -> authors
        for (String aut : authors){
            tmp.put(String.valueOf(counter),aut);
            counter++;
        }
        mapData.add(tmp);
        tmp = new HashMap<>();
        counter = 1;
        // 2 -> genres
        for (String gen : genres){
            tmp.put(String.valueOf(counter),gen);
            counter++;
        }
        mapData.add(tmp);
         new HashMap<>();
        
        
        
        
        return mapData;
    }
}
