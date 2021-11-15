package com.entrypoint.library;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileManager {
    
    private File ioObj;
    private FileWriter iObj;
    private FileReader reader;
    private JSONObject json;
    JSONParser jsonParser = new JSONParser();

    
    private String nameFile;
    private String path = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\JavaGestionale";
    private Boolean FileExisting = false;
    
    public FileManager(String FileName){
        
        if(!FileName.contains(".json"))
            nameFile = FileName + ".json";
        else
            nameFile = FileName;
        
        if(!new File( path ).mkdir())
            System.out.println("Folder Existing Yet : " + path);
        
        ioObj = new File(path + "\\" + nameFile);
        
        try{
            if(ioObj.createNewFile()){
                System.out.println("File Created : " + path + "/" + nameFile);
                
            }else{
                System.out.println("File Existing Yet : " + path + "/" + nameFile); 
            }
        }catch(IOException e){
            System.out.println("Problems Occured! Check if you have the rights permission! path : " + path + "/" + nameFile);
        }

    }
    
    
    public void GetData(ArrayList<Map<String,String>> Data){
        json = new JSONObject();
        int i = 0 ;
        for(Map a : Data){
            json.put(String.valueOf(i), a);
            i++;
        }
        
    }

    
    public Boolean Write(){
        try{
            iObj = new FileWriter(ioObj,false);
            json.writeJSONString(iObj);
            //iObj.write(json.toString());
            iObj.close();
            return true;
        }catch(IOException e){
            System.out.println("Writer not Initialized ! : " + e.getMessage());
            return false;
        }
    }   
    public ArrayList<Book> Load() {
        
        
            ArrayList<JSONObject> jbooks = new  ArrayList<JSONObject> ();
            ArrayList<Book> books = new  ArrayList<Book> ();
            JSONParser parser = new JSONParser();
            
            Object obj = parser.parse(new FileReader(path + "\\" + nameFile));
            JSONObject jsonFile = (JSONObject)obj; // file
            
            for(int i = 0 ; i < jsonFile.size() ; i++)
                jbooks.add((JSONObject)jsonFile.get(String.valueOf(i)));
            
            for(JSONObject a : jbooks) //tutti i libri
                books.add( new Book( a.get("Name").toString() , a.get("Genre").toString() , a.get("Author").toString()  )  );
            
            for(Book a : books)
                System.out.println(a.getName() + " - " + a.getAuthors() + " - " + a.getGenres() + "\n");
            
            
       
        return books;
    }
 
    
    public void Close(){
        try{
            iObj.close();
            
        }catch (Exception e){
            System.out.println("Can't close file : " + e.getMessage());
        }
    }
}
