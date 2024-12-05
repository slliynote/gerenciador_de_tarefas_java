package main;

import main.menu;

import java.util.Scanner;

public class main {

   public static void executar_programa(){

       int num;

       do{
           // Mostra o menu

           System.out.println(menu.mostraMenu());
           System.out.print("escolha uma ação: ");
           Scanner nome = new Scanner(System.in);
           num = nome.nextInt();

           switch (num){


           }



       }while (num != 6 );




   };


    public static void main(String[] args) {

        executar_programa();

    }
}
