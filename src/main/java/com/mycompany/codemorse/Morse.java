package com.mycompany.codemorse;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Morse extends JFrame 

    { 



       private static String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 

             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 

             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 

             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 

             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 

             ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 

             "...-", ".--", "-..-", "-.--", "--.."}; 


     
     
 

       public static void main(String[] args) 

       { 
    	   while (true){

    		   System.err.println("entrez votre phrase à coder  (exit pour arreter l'application)");    		   
        Scanner sc = new Scanner(System.in);
        String codage = sc.nextLine();
        if(codage.equals("exit")){
        	break;
        }
        
        System.out.println(coder(codage));
        
		   System.err.println("entrez votre phrase à décoder (exit pour arreter l'application)");

 String decodage = sc.nextLine();
 if(codage.equals("exit")){
 	break;
 }
 
 System.out.println(decoder(decodage));
    	   }

       } 

     


       public static String coder(String chaine) 

       { 

  

          StringBuilder resultat = new StringBuilder(); 

     

          int ajuste = 'a'; 



          char c; 

          int num; 

          for(int i = 0; i < chaine.length(); i++) 

          { 


             c = chaine.charAt(i); 

     


             if(c == ' ')  

             { 

                resultat.append("   "); 

             } 

             else 

             { 


                num = Character.toLowerCase(c) - ajuste; 


                if(num >= 0 && num < 26) 

                { 

                   resultat.append(morseLetters[num]); 

                   resultat.append(' '); 

                } 


                else 

                { 


                } 

             } 

          } 

     


          return resultat.toString(); 

       } 

     


       public static String decoder(String chaine) 

       { 


          StringBuilder resultat = new StringBuilder(); 



          int ajuste = 'a'; 

     

          chaine = chaine.replaceAll("   ", "___"); 

          StringTokenizer mots = new StringTokenizer(chaine, "___"); 

     


          StringTokenizer lettres; 

          String lettre; 

          int num; 

          while(mots.hasMoreTokens()) 

          { 


             lettres = new StringTokenizer(mots.nextToken(), " "); 



             while(lettres.hasMoreTokens()) 

             { 

   
                lettre = lettres.nextToken(); 

                num = chercherCode(lettre); 

                if(num == -1) 

                { 

                   resultat.append("?"); 

                } 

                else if(num != -1) 

                { 

                   resultat.append(((char) (num + ajuste))); 

                } 

             } 

     


             resultat.append(" "); 

          } 

 

          return resultat.toString(); 

       } 

     


       public static int chercherCode(String cle) 

       { 

          for(int i = 0; i < morseLetters.length; i++) 

          { 

             if(cle.compareTo(morseLetters[i]) == 0) 

             { 

                return i; 

             } 

          } 

     

          return -1; 

       } 

    } 

