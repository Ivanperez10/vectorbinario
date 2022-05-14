import java.util.*;
//Desarrollar un programa que crea un vector de lonngitud N con numeros enteros positivos y negativoa,
//a partir de este vector genear un nuevo vector binario, donde los numeros negativos seon 0's y los positivos 1's.
//Por ejemplo dado un vector de 5 elementos:
//Vector inicial=[1, -12, -8, -4, 5]
//Vector resultante=[1, 0, 0, 0, 1]
public class VectorBinario {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int x;
      System.out.println("introduzca el  numero de elementos de su vector");
      x=sc.nextInt();
      int[] vec = new int[x];
      System.out.println("ingrese los valores del arreglo: ");
      for(int i=0; i<x; i++){
          System.out.print((i+1)+".-");
            vec[i]=sc.nextInt();
      }
      System.out.println("los elementos de su vector original son: ");
        for(int i=0; i<x;i++){
            System.out.print("{"+vec[i]+"}");
        }
      System.out.println("\nlos elementos de vector convertido son:");
       for(int i=0; i<x;i++){
           if(vec[i]>=0){
               vec[i]=1;
           }
           else if(vec[i]<0){
               vec[i]=0;
           }
           System.out.print("{"+ vec[i]+"}");
       } 
    }
}
