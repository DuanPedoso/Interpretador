package mypackage;

import java.io.BufferedReader;  
import java.io.FileInputStream;  

import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.FileReader;

import java.util.StringTokenizer;
 
public class Lerarq{  
      
    FileReader fileR;
    BufferedReader buff;
    String linha[]= new String[100];
    String ordem[]= new String[100];    
    String arquivo;
    int i=0;
    int o=0;
    Comando c = new Comando();


    public Lerarq()
    {
        try {
            fileR = new FileReader("arq.duan"); //IMPRIME POR LINHA
            buff = new BufferedReader(fileR);
            //System.out.println("\nPOR LINHAS!\n");
            
            while (buff.ready())
            {
                linha[i] = buff.readLine();
                arquivo += linha[i];
                //System.out.println(linha[i]);
                i++;
            }
            buff.close();
        }
        catch(IOException e){
        
        }
/*
        //System.out.println("\n\n\n\n\n\nAGORA TUDOXUNTO!\n"); //IMPRIME TUDOXUNTO
        //System.out.println(arquivo);



        while(o<i){
                StringTokenizer tokens = new StringTokenizer(linha[o]," "); // IMPRIME POR TOKENS
                //System.out.println("\n\n\n\nAGORA POR TOOKENS!\n");     
                while(tokens.hasMoreTokens())
                {
                    ordem[o]=tokens.nextToken();
                    System.out.println(ordem[o]+" "+o);
                    o++;
                }
                i++;
            }
            */
            
    }

    public void separa(){
        
        int x=0;
        int o=0;
        
        while(x<i){
            StringTokenizer tokens = new StringTokenizer(linha[x]," "); // IMPRIME POR TOKENS
            System.out.println("\n\n\n\nAGORA POR TOOKENS!\n");     
            while(tokens.hasMoreTokens())
            {
                ordem[o]=tokens.nextToken();
                System.out.println(ordem[o]);
                o++;
         
            }
            x++;
            
        }
    }

}

  