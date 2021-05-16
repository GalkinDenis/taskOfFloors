package com.example.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class levels {
    public static void main(String[] args) {
        int h = 0;
        int max = 0;
        int indexOf = 0;
        boolean count = true;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] vysoty = bf.readLine().split(" ");
            int[] intVysoty = new int[vysoty.length];
            for (String s : vysoty) {
                intVysoty[h] = Integer.parseInt(s);
                h++;
            }
            for (int c = 0; c < intVysoty.length; c++) {
                if ((c != intVysoty.length-1) && ((intVysoty[c] != intVysoty[c+1]))) {
                    count = false;
                }
                if (max < intVysoty[c]) {
                    max = intVysoty[c];
                    indexOf = c;
                }
            }
            if(!count){
                for(int g = indexOf; g < intVysoty.length; g++) {
                    if ((intVysoty[g] == max) && (max < 5)) {
                        intVysoty[g] = 5;
                    }
                }
                if (indexOf != 0 && indexOf != 1) {
                    int p = 0;
                    int y = 0;
                    int x = 0;
                    int q = indexOf;
                    for (; ; ) {
                        y++;
                        if ((intVysoty[q - 2] > intVysoty[q - 1]) & (intVysoty[q - 1] != 5)) {
                            if (intVysoty[q - 2] > 5 && (intVysoty[q - 1] < 5)) {
                                intVysoty[q - 1] = 5;
                            } else {
                                intVysoty[q - 1] = intVysoty[q - 2];
                            }
                        } else {
                            x++;
                        }
                        if ((q - 2) == 0) {
                            if (x == y) {
                                break;
                            }
                            y = 0;
                            x = 0;
                            q = indexOf;
                            continue;
                        }
                        q--;
                    }
                }
                //вправо
                if(
                        (indexOf != (intVysoty.length - 1)) &&
                                (indexOf != (intVysoty.length - 2))
                )
                {
                    int n = 0;
                    int m = 0;
                    int u = indexOf;
                    for (; ; ) {
                        n++;
                        if ((intVysoty[u + 1] < intVysoty[u + 2]) & (intVysoty[u + 1] != 5)) {
                            if (intVysoty[u + 2] > 5 && (intVysoty[u + 1] < 5)) {
                                intVysoty[u + 1] = 5;
                            } else {
                                intVysoty[u + 1] = intVysoty[u + 2];
                            }
                        } else {
                            m++;
                        }
                        if ((u + 2) == (intVysoty.length - 1)) {
                            if (n == m) {
                                break;
                            }
                            n = 0;
                            m = 0;
                            u = indexOf;
                            continue;
                        }
                        u++;
                    }
                }
                for (int o = 0; o < intVysoty.length; o++) {
                    System.out.print(intVysoty[o] + " ");
                }
                System.out.println();
            }else{
                for (int z = 0; z < intVysoty.length; z++) {
                    if(max < 6){
                        intVysoty[z] = 5;}
                    System.out.print(intVysoty[z] + " ");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
