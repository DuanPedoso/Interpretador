import java.io.BufferedReader;  
import java.io.FileInputStream;  
import java.io.File;
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.StringTokenizer;
 
public class Lerarq{  
      
    FileReader fileR;
    BufferedReader buff;
    public String linha[]= new String[1000];
    public String ordem[]= new String[1000];    
    //Intepretator inter= new Intepretator();
    String arquivo;
    int i=0;
    int o=0;
    

    public Lerarq(File arqu)
    {
        try {
            fileR = new FileReader(arqu); //IMPRIME POR LINHA
            buff = new BufferedReader(fileR);
            //System.out.println("\nPOR LINHAS!\n");
            
            while (buff.ready())
            {
                linha[i] = buff.readLine();
                linha[i]=linha[i].replace(";"," ;");
                linha[i]=linha[i].replace(":"," : ");
                linha[i]=linha[i].replace("="," = ");
                linha[i]=linha[i].replace("+"," + ");
                linha[i]=linha[i].replace("-"," - ");
                linha[i]=linha[i].replace("*"," * ");
                linha[i]=linha[i].replace("/"," / ");
                linha[i]=linha[i].replace("÷"," / ");
                linha[i]=linha[i].replace("%"," % ");
                linha[i]=linha[i].replace("#"," # ");
                linha[i]=linha[i].replace("||"," || ");
                linha[i]=linha[i].replace("<"," < ");
                linha[i]=linha[i].replace(">"," > ");

                i++;
            }
            buff.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("Arquivo nao encontrado");
        }
         
        catch(IOException e){
            System.out.println("Erro na leitura");
        }

            
    }

    public void separa(){
        
        int x=0;
        //int o=0;
        
        while(x<i){
            StringTokenizer tokens = new StringTokenizer(linha[x]," "); // IMPRIME POR TOKENS
            //System.out.println("\n\n\n\nAGORA POR TOOKENS!\n");     
            while(tokens.hasMoreTokens())
            {
                ordem[o]=tokens.nextToken();
                ordem[o]=ordem[o].trim();
              //  System.out.println(ordem[o]);
                o++;         
            }
            x++;
        }
    }
}