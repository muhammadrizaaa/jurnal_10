import java.util.*;

public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int besar = input.nextInt();

        String[][] deretHuruf = new String[besar][besar];

        for(int i = 0; i < deretHuruf.length; i++){
            for(int b = 0; b < deretHuruf[i].length; b++){
                deretHuruf[i][b] = input.next();
            }
        }

        for(int i = 0; i < deretHuruf.length; i++){
            String temp1 = "";
            String temp2 = "";
            for(int b = 0; b < deretHuruf[i].length; b++){
                if(b % 2 == 0){
                    temp1 = deretHuruf[i][b];
                }else{
                    temp2 = deretHuruf[i][b];
                }
            }

            for(int k = 0; k < deretHuruf[i].length; k++){
                if(k % 2 == 0){
                    deretHuruf[i][k] = temp2;
                }else{
                    deretHuruf[i][k] = temp1;
                }

                System.out.print(deretHuruf[i][k]);
            }
            System.out.println();
        }
    }
}
