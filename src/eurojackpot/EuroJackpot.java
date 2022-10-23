/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eurojackpot;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author itsso
 */
public class EuroJackpot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hány mezőt játszunk?");
        Scanner  be = new Scanner(System.in);
        int mezoszam = be.nextInt();
        Random rnd = new Random();
        
        for (int i=1;i<=mezoszam;i++) {
            
            int[] mezo_a= new int[5];
            int[] mezo_b= new int[2];
        
        for (int y=0;y<=mezo_a.length-1;y++){
            
            
                
            
                int vizsgal = rnd.nextInt(50)+1;
                
                mezo_a[y]=vizsgal;
            
            
            
            
        }
        for (int y=0;y<=(mezo_b.length-1);y++){ 
            mezo_b[y]= rnd.nextInt(12)+1;
        }
        Arrays.sort(mezo_a);
        Arrays.sort(mezo_b);
        
        for (int y=1;y<=mezo_a.length-1;y++){
            int min = y-1;
            if(mezo_a[y]-mezo_a[min]==0){
//            System.out.println("Egyezés : " + mezo_a[y]);
            mezo_a[y]= rnd.nextInt(50)+1;
            Arrays.sort(mezo_a);
            y=0;
            }
        }
        for (int y=0;y<2;y++){
        if(mezo_b[0]==mezo_b[1]){
        
//            System.out.println("Egyezés : " + mezo_b[y]);
        
            mezo_b[1]= rnd.nextInt(12)+1;
        
        
            y=0;
        }
            }
        for (int j=0;j<=mezo_a.length-1;j++){
            System.out.print(mezo_a[j]+ " ");
    }
            
            System.out.print("   " + mezo_b[0] + "  " + mezo_b[1]);
            System.out.println();
           
        }
    }
    
}
