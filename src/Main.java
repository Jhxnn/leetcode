import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//        List<String> listStr = new ArrayList<>();
//
//        for(int i = 1; i <= num; i++){
//            list.add(i);
//        }
//
//        for(int numList : list){
//            if(numList % 3 == 0 && numList % 5 == 0){
//                listStr.add("foobar");
//            }
//            else if(numList % 3 == 0){
//                listStr.add("foo");
//            }
//
//            else if(numList % 5 == 0){
//                listStr.add("bar");
//            }
//
//            else{
//                listStr.add(String.valueOf(numList));
//            }
//
//        }
//
//
//
//        System.out.println(listStr);
//
//        sc.close();


//        #leetcode 2


//        String texto = "a1b2c34d8";
//
//        List<String> listaTexto = new ArrayList<>(Arrays.asList(texto.split("")));
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for(String item : listaTexto){
//
//            try{
//                int number = Integer.parseInt(item);
//                numbers.add(number);
//            }
//            catch (NumberFormatException e){
//
//            }
//
//
//        }
//        int soma = numbers.stream().mapToInt(num -> num).sum();
//        System.out.println(soma);


//        #leetcode #3
//
//        List<Integer> lista = new ArrayList<>(Arrays.asList(1,13,4,5,6));
//        int maior = 0;
//
//        for(int y = 0; y < lista.size(); y++){
//            for(int x = 1; x < lista.size(); x++){
//                for(int z = 2; z < lista.size(); z++){
//                   int num = lista.get(y) + lista.get(x) + lista.get(z);
//
//
//                   if(num > maior){
//                       System.out.println("y :  " + lista.get(y));
//                       System.out.println("x :  " + lista.get(x));
//                       System.out.println("z :  " + lista.get(z));
//                       maior = num;
//                   }
//
//                }
//            }
//        }
//        System.out.println(maior);


//        #LEETCODE #4

//        List<List<Integer>> list = new ArrayList<>();
//
//
//        List<Integer> subList1 = new ArrayList<>(Arrays.asList(1, 3));
//        List<Integer> subList2 = new ArrayList<>(Arrays.asList(2, 6));
//        List<Integer> subList3 = new ArrayList<>(Arrays.asList(8, 10));
//        List<Integer> subList4 = new ArrayList<>(Arrays.asList(15, 10));
//
//        list.add(subList1);
//        list.add(subList2);
//        list.add(subList3);
//        list.add(subList4);
//
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).get(1) > list.get(i + 1).get(0)) {
//                list.get(i).remove(1);
//                list.get(i + 1).remove(0);
//                System.out.println(list.get(i + 1).get(0));
//            }
//        }
//
//
//        int[] vetor = new int[10];
//        int x =1;
//        while(x < 4) {
//            try {
//                System.out.println(vetor[11]);
//                x = 4;
//            } catch (Exception e) {
//                System.out.println(e + "        Tentativa: " + x);
//                x++;
//                if(x == 3){
//                    vetor = new int[12];
//                }
//            }
//        }



        //Two SUM

//        int target = 10;
//        int[] lista = {1,4,5,10,6,5};
//
//        for(int i = 0;  i < lista.length; i++){
//            for (int y = 1; i < lista.length; i++){
//                if(lista[i] + lista[y] == target){
//                    System.out.println("Item 1 : " + lista[i] + " Item 2: " + lista[y]);
//                    break;
//                }
//            }
//        }


        //Valid Parentheses

//        String s = "(]])(]";
//
//        String[] lista = s.split("");
//        boolean count = false;
//        for(int i = 0; i < lista.length; i++){
//            for(int y = 1;  y < lista.length; y++){
//                if(lista[i].equals("(") && lista[y].equals(")")){
//                    count = true;
//                    break;
//
//                }
//            }
//        }
//        System.out.println(count);




    }






}