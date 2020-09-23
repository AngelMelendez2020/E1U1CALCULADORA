package Logica;
import java.util.*;

public class Operaciones {
  Scanner entrada=new Scanner(System.in);
  double num1=0.0;
  double num2=0.0;
  
  public void sumar(){
      System.out.println("Escriba un numero: ");
      num1=entrada.nextDouble();
      System.out.println("Escriba otro numero: ");
      num2=entrada.nextDouble();
      
      double suma= num1+num2;
      
      System.out.println("La suma es " + suma);
      
  }
   
  public void restar(){
      System.out.println("Escribe un numero: ");
      num1=entrada.nextDouble();
      System.out.println("Escribe otro numero: ");
      num2=entrada.nextDouble();
      
      double resta= num1-num2;
      
      System.out.println("La resta es: " +resta);
  }
  
  public void multiplicar(){
      System.out.println("Escribe un numero: ");
      num1=entrada.nextDouble();
      System.out.println("Escribe otro numero: ");
      num2=entrada.nextDouble();
      
      double mul= num1*num2;
      
      System.out.println("La multiplicación es: " +mul);
  }
  
  public void dividir(){
      System.out.println("Escribe el numero dividendo: ");
      num1=entrada.nextDouble();
      System.out.println("Escribe el numero divisor: ");
      num2=entrada.nextDouble();
      
      double div= num1/num2;
      
      System.out.println("La división es: " +div);
  }
}
