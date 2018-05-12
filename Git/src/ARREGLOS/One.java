/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARREGLOS;

/**
 *
 * @author Alumno
 */
public class One 
{
    public static void main(String[] args) 
    {
     /*  otra forma de declarar 
        
      int arregloEntero [] = {5,6,7,8,9,15,16,18,10,15};
      //                              pocision
       System.out.println(arregloEntero[5]);*/
    
      
       int[] arregloEntero = new int [5] ; 
       int[] arregloEntero1 = new int [20];
       int[][] arregloEnterom = new int [10][10];
       int n=1;
      //  int [] arregloEntero  = new int [5];
      /*  arregloEntero [0] = 3;
        arregloEntero [1] = 6;
        arregloEntero [2] = 9;
        arregloEntero [3] = 20;
        arregloEntero [4] = 25;*/
       
       
        
     //          inicio ; final ;tamaño paso   
       for( int i=0 ; i<5 ; i++)
        {
            if( i %2 != 0)
            {
                arregloEntero [i]= i;
              System.out.println("Pocisiones Impares\n" + arregloEntero[i]);   //imprime las "pocisiones" IMPARES
            }
            
        }
        System.out.println("Termino el FOR");
        
   // <------------MULTIPLOS DE 3 ----------->
            for( int i=3 ; i<20 ; i++)
        {
            
                arregloEntero1[i]=i*3;    //llena
        }
            
           for( int i=0; i<20 ; i++)           //imprime
         {
           if (arregloEntero1[i]%2 != 0)  
           {
               System.out.println("impares " + arregloEntero1[i]);
           }
         }
        System.out.println("Termino el FOR");
        
    // ----------------------------------------------
        for( int i=0; i<10; i++ )     //filas
        {
         for(int j=0 ; j<10; j++)      //columnas
         {
             arregloEnterom [i][j]= n;
             n++;
         
         }
        }
        
        for( int i=0; i <10; i++ )     //filas
        {
         for(int j=0 ; j<10; j++)      //columnas
         {
             System.out.print("\t" + arregloEnterom [i][j]);
         }
            System.out.println("");
     }
        
     //--------------------------------------------------
     
}
}
