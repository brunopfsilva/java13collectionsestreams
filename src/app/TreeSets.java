package app;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSets {
    
    public static void main(String[] args) throws Exception{
        

        TreeSet<String>treeset = new TreeSet<>();

        treeset.add("Filme 1");
        treeset.add("Filme 11");
        treeset.add("Filme 12");
        treeset.add("Filme 13");
        treeset.add("Filme 14");

      

        System.out.println(treeset);
        

        //retorna o primeiro item o topo da arvore
        System.out.println(treeset.first());   
        //retorna o ultimo item da arvore
        System.out.println(treeset.last());
        
        
        //retorna o elemento abaixo do filme 11
        System.out.println(treeset.lower("Filme 11"));

        //retorna o elemento acima do filme 12
        System.out.println(treeset.higher("Filme 12"));
       

        System.out.println(treeset.pollFirst()); // retorna o primeiro item da arvore, removendo do set

        System.out.println(treeset.pollLast()); // retorna o ultimo item da arvore, removendo do set

    
        Iterator<String> treesetIterator = treeset.iterator();


        while(treesetIterator   .hasNext()){

            System.out.println(treesetIterator.next());

        }
        
        for (String sequencia : treeset) {
            System.out.println(sequencia);
        }


        //retorna true ou false para vazio
        System.out.println(treeset.isEmpty());

    }

}