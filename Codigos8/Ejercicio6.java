package Codigos8;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 inst = new Ejercicio6();
        //Ejemplo de list
        inst.listMetodo();
        //Ejemplo set
        inst.setMetodo();
        //Treeset
        inst.treesetMetodo();
        //Queue
        inst.QueueMetodo();
        //Map
        inst.mapMetodo();

        }
    public void QueueMetodo(){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Oscar");
        queue.add("Roberto");
        queue.add("Ingrid");
        queue.add("Ivan");
        System.out.println("Tamaño de la lista: " +queue.size());
        queue.stream().forEach(System.out::println);
        System.out.println();
    }
    public void setMetodo(){
        Set<String > listaset = new HashSet<>();
        HashSet<Object> listahash = new HashSet<>();
        System.out.println("Lista inicializada como un objeto: " +listahash);
        listaset.add("Oscar");
        listaset.add("Oscar");
        listaset.add("Leo");
        listaset.add("Noe");
        listaset.add("Isacc");
        System.out.println("Tamaño de la lista: " +listaset.size());
        listaset.stream().forEach(System.out::println);
        System.out.println(Arrays.toString(listaset.toArray()));
    }
    public void treesetMetodo(){
        Set<String > listatreeset = new TreeSet<>();
        listatreeset.add("pelota");
        listatreeset.add("canica");
        listatreeset.add("iguana");
        listatreeset.add("iguana");
        listatreeset.add("plastico");
        listatreeset.add("figura");
        listatreeset.stream().forEach(System.out::println);
        listatreeset.remove("iguana");
        System.out.println();
        listatreeset.stream().forEach(System.out::println);
        System.out.println();
    }

    public void listMetodo(){
        List<Object> lista = new ArrayList<>();
        List <String> listaString = new LinkedList<>();
        ArrayList arrayList;
        listaString.add("Hola como andan");
        listaString.add("Hola como andan");
        listaString.add("Hola toy bien");
        listaString.add("Hola como tai io bien");
        System.out.println("Tamaño de la lista: " +listaString.size());
        listaString.stream().forEach(System.out::println);
        System.out.println("Conseguir en el indice " +1+": "+listaString.get(1));
        listaString.add(2,"Cambiando y hola como tai");
        System.out.println("Conseguir en el indice " +2+": "+listaString.get(2));
        System.out.println("La lista esta vacia? = " + listaString.isEmpty());
        System.out.println("Hascode de la lista: "+listaString.hashCode());
        System.out.println(listaString.lastIndexOf("Hola como andan"));
    }

    public void mapMetodo(){
        Map <String ,String> listaMap = new HashMap<>();
        listaMap.put("524324E","Juan Pablo");
        listaMap.put("347345U","Audenard Osorio");
        listaMap.put("347345U","Copia jeje");
        listaMap.put("546556O","Eduardo Molina");
        System.out.println("Tamaño de la lista: " +listaMap.size());
        System.out.println(listaMap.get("546556O"));
        System.out.println(listaMap.containsKey("347345U"));
        System.out.println(listaMap.containsValue("Eduardo Molina"));
        System.out.println(listaMap.values());
        System.out.println();
        for (String key : listaMap.keySet()){
            System.out.println(key + " => " + listaMap.get(key));
        }
    }




}
