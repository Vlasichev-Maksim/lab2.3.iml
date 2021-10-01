import java.util.Scanner;
public class Book {
    private String Author;
    private String Name;
    private String Date;
    private String Genre;
    public  String getAuthor(){
        return Author;
    }
    public  String getName(){
        return Name;
    }
    public  String getDate(){
        return Date;
    }
    public  String getGenre(){
        return Genre;
    }
    public void setAuthor(String author){
        Author = author;
    }
    public  void setName(String name){
        Name = name;
    }
    public void setDate(String  date){
        Date = date;
    }
    public void setGenre(String  genre){
        Genre = genre;
    }
}