import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Write a description of class Ej3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej3
{
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        int numExamenes = 0;
        do{
            numExamenes= tc.nextInt();
            tc.nextLine();
            if(numExamenes!= 0){
                int[] examenesSuelo= new int[60];
                List<Integer> mesa = new ArrayList<>();
                List<Integer>  cajon = new ArrayList<>();
                int maxExamenes= 0;
                int contador=0;
                for(int coger = 0; coger<numExamenes; coger++){
                    int examen = tc.nextInt();
                    if(mesa.contains(examen)){
                        cajon.add(examen);
                        cajon.add(examen); 
                        Iterator<Integer> iterador = mesa.iterator();
                        while(iterador.hasNext()){
                            if(iterador.equals(examen)){
                                iterador.remove();
                            }
                            iterador.next();
                        }
                        contador--;
                    }else{
                        mesa.add(examen);
                        contador++;
                        if(contador>maxExamenes){
                            maxExamenes= contador;
                        }
                    }
                }

                System.out.println(maxExamenes);
            }
        }while(numExamenes!= 0);
    }
}
