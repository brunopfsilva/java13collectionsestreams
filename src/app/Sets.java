package app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    
    public static void main(String[] args) throws Exception{
        

        Set<Double>notaAlunos = new HashSet<>();

        notaAlunos.add(1.1);
        notaAlunos.add(12.1);
        notaAlunos.add(13.1);
        notaAlunos.add(14.1);
        notaAlunos.add(15.1);
        notaAlunos.add(16.1);
        notaAlunos.add(17.1);

        System.out.println(notaAlunos);
       

        notaAlunos.remove(1.1);

        System.out.println(notaAlunos);

        Iterator<Double> Alunositerator = notaAlunos.iterator();

        while(Alunositerator.hasNext()){

            System.out.println(Alunositerator.next());

        }
        
        for (Double notas : notaAlunos) {
            System.out.println(notas);
        }


        //retorna true ou false
        System.out.println(notaAlunos.isEmpty());

    }

}