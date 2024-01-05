import java.util.*;

public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder rvrs = new StringBuilder();

        String kalimat = input.nextLine();

        String[] kata = kalimat.split(" ");

        String ganti = kata[kata.length - 1 ];

        for(int i =0 ; i < kata.length - 1; i++){
            if(i % 2 != 0){
                kata[i] = kata[i].replaceAll("[aiueoAIUEO]", ganti);
                rvrs.append(kata[i]);
                rvrs.reverse();
                kata[i] = rvrs.toString();
                System.out.print(kata[i] + " ");
                rvrs.setLength(0);
            }else{
                kata[i] = kata[i].replaceAll("[aiueoAIUEO]", ganti);
                System.out.print(kata[i] + " ");
            }
            
        }

    }
    
}
