import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

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

        //
        //merge two sorted list

//        int[] lista1 = {1,3,5};
//        int[] lista2 = {2,5,6};
//        List<Integer> lista3 = new ArrayList<>();
//
//        for(int i = 0; i < lista1.length; i++){
//            for(int y = 0; y < lista2.length; y++){
//                if(lista1[i] > lista2[y]){
//                    lista3.add(lista2[i]);
//
//                }
//            }
//        }
//
//        System.out.println(lista3);

      //Best time do buy and sell stock
//
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int best = 0;
//        int bestDayToBuy = 0;
//        int bestDayToSell = 0;
//
//        for(int i = 0; i < prices.length; i++){
//            for(int y =1; y<prices.length; y++){
//                if(prices[i] < prices[y]){
//                    int price = prices[y] - prices[i];
//                    if( price > best){
//                        best = price;
//                        bestDayToBuy = i + 1;
//                        bestDayToSell = y + 1;
//
//                    }
//                }
//
//            }
//        }
//        System.out.println("comprar: dia "  + bestDayToBuy);
//        System.out.println("vender: dia " + bestDayToSell);
//        System.out.println("lucro: " + best);
//
         //Valid anagram

//        String s = "car";
//
//        String r = "arcc";
//
//        String[] listaS = s.split("");
//        String[] listaR = r.split("");
//
//        if(listaR.length ==  listaS.length){
//            Arrays.sort(listaS);
//            Arrays.sort(listaR);
//            if(Arrays.equals(listaR, listaS)){
//                System.out.println("é anagrama");
//            }
//            else{
//                System.out.println("nao é anagram");
//            }
//        }else {
//            System.out.println("nao é anagrama");
//        }

//         binary Search
//        int target = 15;
//
//        int[] nums = {1,5,8,10,11,13,15,14,15,20,1,2,3,4,5,90,11,18,82,58};
//        Arrays.sort(nums);
//
//        int inicio = 0;
//        int fim = nums.length - 1;
//        int i = 1;
//        while (inicio <= fim) {
//            int meio = (inicio + fim) / 2;
//            System.out.println(i);
//            if (nums[meio] == target) {
//                System.out.println(meio);
//                break;
//            } else if (nums[meio] < target) {
//                inicio = meio + 1;
//            } else {
//                fim = meio - 1;
//            }
//            i++;
//        }








//        int[] lista = {1,24,5,6,100,15,22,38,90,81,6,10};
//
//        int inicio = 0;
//
//        int target = 38;
//
//        Arrays.sort(lista);
////
////        int ultimo = lista.length - 1;
////        int z = 1;
////
////        while(inicio <= ultimo){
////            int meio = (inicio + ultimo) / 2;
////            System.out.println(z);
////            if(lista[meio] == target){
////                System.out.println("Tem aqui");
////                break;
////            }else if(target > meio){
////                inicio = meio + 1;
////            }
////            else {
////                ultimo = meio - 1;
////            }
////            z++;
////
////
////        }
//
//           int[] lista = {0,0,1,1,1,2,2,3,3,4};
//            int[] lista2 = new int[lista.length];
//            for(int i = 0; i < lista.length; i++){
//                for(int y = 1; y < lista.length; y++){
//                    if(lista[i] != lista[y]){
//                        lista2[i] = lista[y];
//
//                    }
//                }
//            }
//        for (int i : lista) {
//            System.out.println(i);
//        }
//
//
//        String s = "LMC";
//        Map<Character,Integer> romanos = new HashMap<>();
//        romanos.put('I',1);
//        romanos.put('V',5);
//        romanos.put('X',10);
//        romanos.put('L',50);
//        romanos.put('C',100);
//        romanos.put('D',500);
//        romanos.put('M',1000);
//
//
//        int anterior = 0;
//        int resultado = 0;
//
//        for(int i = s.length() -1; i >=0 ; i--){
//            int atual = romanos.get(s.charAt(i));
//            if(atual < anterior){
//                resultado -= atual;
//            }
//            else {
//                resultado += atual;
//            }
//            anterior = atual;
//        }
//
//        System.out.println(resultado);



        }

}