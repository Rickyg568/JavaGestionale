package com.entrypoint.library;

import java.util.ArrayList;
import java.util.Map;

public class Controller {
    private ArrayList<Book> Books;
    
    public Controller(){
        Books = new ArrayList<Book>();
    }
    
    public void AddBook(Book book){
        Books.add(book);
    }
    
    public void ModBook(String Name,String Author, String Genre, int position){
        Books.remove(position);
        Books.add(position, new Book(Name,Genre,Author));
    }
    public void ModBook(String Name,String Author, String Genre, Book book){
        Books.set(Books.indexOf(book), new Book(Name,Genre,Author));
    }
    public void ModBook(Book book,int position){
        Books.remove(position);
        Books.add(position, book);
    }
    
    public void DeleteBook(Book book){
        Books.remove(book);
    }
    public void DeleteBook(int position){
        Books.remove(position);
    }
    
    
    public void LoadData(){
        FileManager a = new FileManager("LocalSaves");
        Books.clear();
        Books = a.Load();
    }
    public void SaveData(){
        FileManager a = new FileManager("LocalSaves");
        a.GetData(GetJsonData());
        a.Write();
    }
    
    public ArrayList<Book> GetList(){
        return Books;
    }
    public ArrayList<Map<String,String>> GetJsonData(){
        ArrayList<Map<String,String>> toReturn = new ArrayList<Map<String,String>>();
        
        for(Book a : Books)
            toReturn.add(a.GetMapData());
        
        return toReturn;
    }
}
