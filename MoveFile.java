import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
  
public class MoveFile
{ 
    public static void main(String[] args) throws IOException 
    { 
        Path temp = Files.move 
        (Paths.get("C:/TestIO/test.txt"),  
        Paths.get("C:/TestIO/test2.txt")); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    } 
}
