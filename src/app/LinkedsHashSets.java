package app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedsHashSets {
    
    public static void main(String[] args) throws Exception{
        

        LinkedHashSet<Integer>sequenciaNumeros = new LinkedHashSet<>();

        sequenciaNumeros.add(1);
        sequenciaNumeros.add(2);
        sequenciaNumeros.add(3);
        sequenciaNumeros.add(4);
        sequenciaNumeros.add(5);
        sequenciaNumeros.add(6);
        sequenciaNumeros.add(7);

        System.out.println(sequenciaNumeros);
       

        sequenciaNumeros.remove(1);

        System.out.println(sequenciaNumeros);
        //tamanho
        System.out.println(sequenciaNumeros.size());

        Iterator<Integer> Alunositerator = sequenciaNumeros.iterator();

        while(Alunositerator.hasNext()){

            System.out.println(Alunositerator.next());

        }
        
        for (Integer notas : sequenciaNumeros) {
            System.out.println(notas);
        }


        //retorna true ou false
        System.out.println(sequenciaNumeros.isEmpty());

    }

}