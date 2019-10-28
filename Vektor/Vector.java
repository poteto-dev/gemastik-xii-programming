import java.util.*;
public class Vektor {
    public static void main(String[] args) {
        System.out.println("start");
        Scanner in = new Scanner(System.in);
        String[] vek = in.nextLine().split("[ ]");
        Arrays.sort(vek);
        int val = 0;
        if(vek.length % 2 == 1){
            int n = vek.length-1;
            boolean l = false;
            if(n+1 > 3){
                val -= Integer.valueOf(vek[n]);
                val += Integer.valueOf(vek[n-1]);
                val += Integer.valueOf(vek[n-2]);
            } else{
                val += Integer.valueOf(vek[n])/2;
                val += Integer.valueOf(vek[n-1])/2;
                n += 1;
            }
            for(int i = 0; i <= n-3; i++){
                if(l){
                    val += Integer.valueOf(vek[i]);
                    l = false;
                } else{
                    val -= Integer.valueOf(vek[i]);
                    l = true;
                }
            }
        }
        else{
            int n = vek.length-1;
            boolean l = false;
            for(int i = 0; i <= n; i++){
                if(l){
                    val += Integer.valueOf(vek[i]);
                    l = false;
                } else{
                    val -= Integer.valueOf(vek[i]);
                    l = true;
                }
            }
        }
        if(val == 0) System.out.println("MUNGKIN");
        else System.out.println("MUSTAHIL");
    }
} 
