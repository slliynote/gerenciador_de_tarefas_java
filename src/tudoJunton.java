import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class tarefaRafael {


    public static void dalva() {

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaN = new ArrayList<>();
        ArrayList<String> Menu = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
        ArrayList<Integer> teste = new ArrayList<>();

        Menu.add("1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );

        Scanner nome = new Scanner(System.in);
        int num;


        do {
            System.out.println(Menu);
            System.out.print("escolha uma ação: ");
            num = nome.nextInt();


            if (num == 1) {
                System.out.print("escreva uma tarefa: ");
                Scanner nome1 = new Scanner(System.in);
                String num2 = nome1.next();
                lista.add(num2);

                for (int i = 0; i < status.size(); i++) {
                    System.out.print("adicione um status: ");
                    Scanner nome7 = new Scanner(System.in);
                    String num6 = nome7.next();
                    teste.add(i + 1);
                    status.add(num6);

                }

                if(status.isEmpty()){
                    System.out.print(" adicione um status: ");
                    Scanner nome10 = new Scanner(System.in);
                    String num77 = nome10.next();
                    teste.add(1);
                    status.add(num77);
                }

            } else if (num == 2) {
                System.out.print("escreva uma tarefa: ");
                Scanner nome2 = new Scanner(System.in);
                String num3 = nome2.next();
                lista.add(num3);
                System.out.print("escreva escreva a data: ");
                Scanner nome3 = new Scanner(System.in);
                String num4 = nome3.next();
                listaN.add(num4);
                System.out.print("adicione um status: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                status.add(num6);


            } else if (num == 3) {
                System.out.println(teste + "" + "" + listaN + "" + lista + "" + status);

            } else if (num == 4) {
                System.out.println(lista + "\n" + "" + listaN + "\n" + status + "");
                System.out.print("digite o status que vocẽ quer alterar: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                System.out.print("digite o novo status: ");
                Scanner nome0 = new Scanner(System.in);
                String num8 = nome0.next();
                for (int i = 0; i < status.size(); i++) {
                   if(status.get(i).equals(num6)){
                       status.set(i,num8);
                   };
                }
            }

            else{
                    System.out.println("nenhuma das opções foi selecionada!");
                }
        }while (num != 6) ;



    }
}


    public static void main(String[] args) {
        tarefaRafael.dalva();
    }

