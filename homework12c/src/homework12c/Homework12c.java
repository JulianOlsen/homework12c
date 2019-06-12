package homework12c;

import java.util.Scanner;

public class Homework12c {
    
   void output(int num)
        {
         
             String name = ("*");
             int i;
             for (i=0;i<num;++i)
            {
             System.out.print(name);    
            }
      
        }
    public static void main(String[] args) {
        Homework12c main = new Homework12c(); 
        
        while(true){   
        System.out.println("type in a number to print stars");
        Scanner SC = new Scanner(System.in);
        int num;
        try {
        num = SC.nextInt();
                main.output(num);
                break;
        }
        catch (Exception e){
             System.out.println("not a number or positive number");       
            
        }
        }
      

        }
         
} 