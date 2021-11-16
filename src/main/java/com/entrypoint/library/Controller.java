/*
 * Class : Controller
 *
 * Version info : 0.2.0
 *
 * Copyright notice : none
 */
package com.entrypoint.library;
import java.util.ArrayList;
import java.util.Map;

/**
 * Controller for all operations.
 *
 * @version 0.2 16 Nov 2021
 * @author Riccardo Grassi
 */

public class Controller {
    //Variables
    private ArrayList<Book> Books;
    private final String savesFileName = "BackUp";
    private final FileManager fileManager;
    /*
    *   Public constructor.
    *   Variations:
    *       -None
    */
    public Controller(){
        Books = new ArrayList<Book>();
        fileManager = new FileManager(savesFileName);
    }
    
    /*
    *   Add Operation.
    *   Variations:
    *       -New initialization
    */
    public void AddBook(Book book){
        Books.add(book);
    }
    public void AddBook(String Title, ArrayList<String> Authors, ArrayList<String> Genres){
        Books.add( new Book(Title, Authors, Genres) );
    }
    
    /*
    *   Alteration Operation.
    *   Variations:
    *       -New initialization + position
    *       -New initialization + Book Replace
    *       -Object + position
    *       -Object + Book Replace
    */
    public void AlterBook(String Title,ArrayList<String> Authors, ArrayList<String> Genres, int Position){
        Books.remove(Position);
        Books.add(Position, new Book(Title,Authors,Genres));
    }
    public void AlterBook(String Title,ArrayList<String> Authors, ArrayList<String> Genres, Book book){
        Books.set(
                Books.indexOf(book),
                new Book(Title,Authors,Genres)
                    );
    }
    public void AlterBook(Book book,int Position){
        Books.remove(Position);
        Books.add(Position, book);
    }
    public void AlterBook(Book book,Book ToReplace){
        Books.set(
                Books.indexOf(ToReplace),
                book
                    );
    }
    
    /*
    *   Remove Operation.
    *   Variations:
    *       -Object
    *       -Position
    */
    public void RemoveBook(Book book){
        Books.remove(book);
    }
    public void RemoveBook(int Position){
        Books.remove(Position);
    }
    
    
    /*
    *   Save Operation.
    *   Variations:
    *       -None
    */
    public void SaveData(){
        fileManager.GenerateJson(GetListMap());
        fileManager.Write();
    }
    
    /*
    *   Load Saves Operation.
    *   Variations:
    *       -None
    */
    public void LoadData(){
        Books.clear();
        Books = fileManager.Load();
    }
    
    /*
    *   Getters.
    *   Variations:
    *       -None
    */
    public ArrayList<Book> GetBooks(){
        return Books;
    }
    public ArrayList<ArrayList<Map<String,String>>>  GetListMap(){
        
        ArrayList<ArrayList<Map<String,String>>> MapList = new ArrayList<>();
        
        Books.forEach( book -> {
            MapList.add(book.GetMapData());
        });
        
        return MapList;
    }
}
