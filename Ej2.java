import java.util.Scanner;

/**
 * Write a description of class Ej2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej2
{
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);  
        int num = 0; 
        char car = 'y';
        do{
            num = tc.nextInt();
            car = tc.nextLine().trim().charAt(0);
            int altura = ((num*2)-1);
            int larguraPrimerTri = (num-1);
            int mitad = ((altura +1) /2);
            if((num!=0) && (car != '0')){
                for(int f = 1; f <= altura; f++){
                    if(f<=mitad){
                        for(int i = (larguraPrimerTri-(f-1)); i>0;i--){
                            System.out.print(" ");
                        }
                        for(int relleno = 0; relleno<(num+(2*(f-1)));relleno++){
                            System.out.print(car);
                        }
                        System.out.println();
                    }
                    if(f>mitad){
                        for(int seg = (f-mitad);  seg>0;seg--){
                        System.out.print(" ");
                        }
                        
                        for(int relle2 = 3+((-1+((num-1)*3)+(-1-(2*(f-mitad)))));relle2>0; relle2--){
                        System.out.print(car);
                        }                          
                        System.out.println();
                    }
                }
            }
        }while((num!=0) && (car != '0'));
    }
}
