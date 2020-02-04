package app;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;


public class Queues {

    public static void main(String[] args) throws Exception {
       
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Bruno");
        filaBanco.add("Bruna");
        filaBanco.add("Pedro");
        filaBanco.add("Andreia");

        System.out.println(filaBanco);

        // poll() remove o primeiro da fila
        String clienteAtendido = filaBanco.poll();
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);
      

        String primeiroCliente = filaBanco.peek(); //faz retornar null se não houver valor
        
        
        
        System.out.println(primeiroCliente);
        // System.out.println(filaBanco);
        

        String primeiroElementoouErro = filaBanco.element(); //faz retornar erro se não houver valor ou o primeiro elemento
        System.out.println(primeiroElementoouErro);
        System.out.println(filaBanco);

        //foreach no java
        for(String cliente: filaBanco){
            System.out.println(cliente);
        }

        //Iterator no java
        Iterator<String> iteratorFilaBanco =  filaBanco.iterator();

        //enquanto o iterador tiver itens passar para o proximo
        while(iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

    }
}