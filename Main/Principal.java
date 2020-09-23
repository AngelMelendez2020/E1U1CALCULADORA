package Main;

import Logica.Operaciones;
import java.util.Scanner;


public class Principal {

  
    public static void main(String[] args) {
        Operaciones obj= new Operaciones();   
        Scanner leer=new Scanner(System.in);
        int opcion;
         
        do{
            
            System.out.println("1. Opción para sumar");
            System.out.println("2. Opción para restar");
            System.out.println("3. Opción para multiplicar");
            System.out.println("4. Opción para dividir");
             
  
            System.out.println("Elige una opcion");
            opcion=leer.nextInt();
             
                switch(opcion){
                    case 1: obj.sumar();
                    break;
                    
                    case 2: obj.restar();
                    break;
                    
                    case 3: obj.multiplicar();
                    break;
                    
                    case 4: obj.dividir();
                    break;
                    
                    default:
                        System.out.println("Opción incorrecta, vuelve a ingresar otra opción");
                } 
                
                System.out.println("¿Quieres continuar 1=si  0=No?");
                opcion=leer.nextInt();
                  
            }while(opcion !=0);
        }
    }
