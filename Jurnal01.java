import java.util.*;

public class Soal01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int besar = input.nextInt();

        int maksimal = input.nextInt();

        int[] barang = new int[besar];

        int total = 0;
        int counter = 0;
        for(int i = 0; i < barang.length; i++){
            barang[i] = input.nextInt();
        }

        for(int i = 0; i < barang.length; i++){
            if(total + barang[i] <= maksimal){
                total += barang[i];
                counter++;
                if(counter == 4){
                    System.out.print((i + 1 ));
                }else{
                    System.out.print((i + 1 ) + " ");
                }
                
            }
        }
        System.out.print("\n" + counter + " barang, dengan total ");

        System.out.print(total);

    }
}