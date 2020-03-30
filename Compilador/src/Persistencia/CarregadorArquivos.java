package Persistencia;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CarregadorArquivos {
    
    public static String carrega(String caminho){
        
        Scanner s = null;
        
        try {
            File f = new File(caminho);
            s = new Scanner(f);
           
            s.useDelimiter("\\Z");
        } catch (IOException ex) {
            Logger.getLogger(CarregadorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        String str ="";
        
        while(s.hasNext()){
            str += s.nextLine() + "\n";
        }

        s.close();
        return str;
    }

    public CarregadorArquivos() {
        
    }
    
}
