/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3lombeidaanatutoria8;

import java.util.Scanner;

/**
 *
 * @author gisse
 */
public class U3LombeidaAnaTutoria8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new    Scanner  (System.in);
         int opcion ;
         do{
         
         System.out.println("MENU DE ARREGLOS ");
         System.out.println("1.REGRISTRO DE DATOS ");
         System.out.println("2. INGRESO DE NUMEROS ");
         System.out.println("3.SALIR ");
         opcion=leer.nextInt();

         switch(opcion){
              case 1:
                      registroDatos();
                     
                     break;
                     
                 case 2:
                     ingresoNumeros();
                    break;
                    
                 case 3: 
                      System.out.println("MUCHAS GRACIAS POR INGRESAR ");
                       break;
                 default:
                     System.out.println("OPCION INGRESADA ES INCORRECTA ");
         }     
         }while( opcion!=3);
      
         
 
}
    

static void registroDatos()  {

Scanner leer=new Scanner(System.in);
System.out.println("INGRESA LA CANTIDAD DE PERSONAS QUE VA A REGRISTRAR ");
 int canPersonas=leer.nextInt();
 //creamos arreglo para el ingreso
 String[] nombres = new String [canPersonas ];
 int  [] edades=new int [canPersonas ];
 String [] direcciones=new String [canPersonas ];

   for (int i =0; i <canPersonas; i ++){
   
   System.out.println("PERSONAS"+(i+1)+":");
   System.out.println("NOMBRES");
   leer.nextLine();
   String nombre=leer.nextLine();
    leer.nextLine();
   System.out.println("EDAD");
   int edad=leer.nextInt();
   leer.nextLine();
   System.out.println("DIRECCIONES");
   String direccion=leer.nextLine();
   direcciones[i]=direccion;
   
     System.out.println("========================");
     System.out.println("RESGRISTRO DE DATOS");
     System.out.println("========================");
     for ( i = 0; i < canPersonas; i++){
     System.out.println("DATOS DE PERSONAS"+(i+1)+":");
     System.out.println("NOMBRE"+nombres[i]);
     System.out.println("EDAD"+edades[i]);
     System.out.println("DIRRECCION"+direcciones[i]);


     }
   
   
   }

 
 
 



}  
static void ingresoNumeros(){
Scanner leer=new Scanner(System.in);
     System.out.println("INGRESA LA CANTIDAD DE NUMEROS");
     int n=leer.nextInt();
     ///ARREGLO NUMEROS
     int []numeros=new  int [n];
     for(int i=0; i<n; i++){
     System.out.println("INGRESE EL NUMERO"+(i+1)+":");
     numeros[i]=leer.nextInt(); 
     System.out.println("LOS NUMEROS INGRESADOS SON:");
     for(i = n-1; i >=0; i--){
           System.out.println(numeros[i]);
      }
     }
     
     }
   
        
    }      




         
