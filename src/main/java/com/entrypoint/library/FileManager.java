/*
 * Class : FileManager
 *
 * Version info : 0.2.0
 *
 * Copyright notice : none
 */

package com.entrypoint.library;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Manager for write/read from file + json e.
 *
 * @version 0.2 16 Nov 2021
 * @author Riccardo Grassi
 */

public class FileManager {
    
    // <editor-fold defaultstate="collapsed" desc="Variables">  
    private File file;
    private FileWriter writer;
    private FileReader reader;
    private JSONObject json;
    JSONParser jsonParser;   
    private String nameFile;
    private String path;
    // </editor-fold>
   
    /*
    *   Public contructor.
    *   Variations:
    *       -None
    */
    public FileManager(String FileName){
        
        
        path = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\JavaGestionale";
        
        if(!FileName.contains(".json")) nameFile = FileName + ".json";
        else nameFile = FileName;
        
        if(!new File( path ).mkdir()){
            System.out.println("Folder Existing Yet : " + path);
            file = new File(path+"\\"+nameFile);  
        }
        
        
        try{
            if(file.createNewFile()) System.out.println("File Created : " + path + "/" + nameFile);    
            else System.out.println("File Existing Yet : " + path + "/" + nameFile);
            json = new JSONObject();
            jsonParser = new JSONParser();
            
        }catch(IOException e){
            System.out.println("Problems Occured! Check if you have the rights permission! path : " + path + "/" + nameFile);
        }
    
    }
    
    /*
    *   Generating Json File
    *   Variations:
    *       -None
    */
    public void GenerateJson(ArrayList<ArrayList<Map<String,String>>>  Data){
        
        int counterBooks = Data.size();
        
        
        //Map<String,Map<String,Map<String,String>>> root = new HashMap<>();
        Map<String,Map<String,String>> second = new HashMap<>();
        Map<String,String> secondA  = new HashMap<>();
        Map<String,String> secondG  = new HashMap<>();
        Map<String,String> titolo   = new HashMap<>();
        
        for(int i = 0 ; i < counterBooks ; i++){
          
            secondG = new HashMap<>();
            secondA = new HashMap<>();
            second = new HashMap<>();
            titolo = new HashMap<>();
            //root = new HashMap<>();
            
            //generare mappa secondG
            secondG = Data.get(i).get(2);
            secondA = Data.get(i).get(1);
            titolo = Data.get(i).get(0);
           
            
            //second
            second.put("Titolo",titolo);
            second.put("Authors",secondA);
            second.put("Genres",secondG);
           
            
            //root
            //root.put(String.valueOf(i+1),second);
            
            json.put(String.valueOf(i+1),second);
        }
        
        
    }

    /*
    *   Writing Json File
    *   Variations:
    *       -None
    */
    public Boolean Write(){
        
        try{
            writer = new FileWriter(file);
            json.writeJSONString(writer);
            writer.close();
            return true;
            
        }catch(IOException e){
            System.out.println("Writer not Initialized ! : " + e.getMessage());
            return false;
        }
        
    }   
    
    /*
    *   Loading Json File and converting Json into Book Object.
    *   Variations:
    *       -None
    */
    public ArrayList<Book> Load(){
        
            
            ArrayList<JSONObject> jsonBooks = new  ArrayList<> ();
            ArrayList<Book> books = new  ArrayList<> ();
            
            try{      
                
                reader = new FileReader(file);
                
                
                Object fileRead = jsonParser.parse(reader);
                
                reader.close();
                
                JSONObject jsonFile = (JSONObject) fileRead; 
                
                
                for(int i = 1; i <= jsonFile.size(); i++){
                    
                    Book temp = new Book();
                    ArrayList<String> sTemp = new ArrayList<>();
                    
                    JSONObject entireRoot = (JSONObject) jsonFile.get(String.valueOf(i));
                    JSONObject inField = new JSONObject();
                    //titolo
                    inField = (JSONObject) entireRoot.get("Titolo");    
                    temp._setTitle(inField.get("Title").toString());
                    
                    //Authors
                    inField = (JSONObject) entireRoot.get("Authors"); 
                    for(int j = 1 ; j <= inField.size(); j++)
                        sTemp.add(inField.get(String.valueOf(j)).toString());
                    temp._setAuthors(sTemp);
                    
                    //Genres
                    sTemp = new ArrayList<>();
                    inField = (JSONObject) entireRoot.get("Genres"); 
                    for(int j = 1 ; j <= inField.size(); j++)
                        sTemp.add(inField.get(String.valueOf(j)).toString());
                    temp._setGenres(sTemp);
                    
                    books.add(temp);
                    
                    
                }
            
                
                
                
            }   catch(IOException exp){ System.out.println("Can Read File, close file in other windows"); }
                catch(ParseException pexp) { System.out.println("Can Parse File, close file in other windows"); }
        return books;
    }
 
    
   
}
