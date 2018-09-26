package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Col?");
        int c = in.nextInt();
        System.out.print("Row?");
        int r = in.nextInt();
        ////////START////////////
        int row = 1;

        if (c >= 10 && r >= 10) {
           System.out.print("вы ввели недопустимое количество :)");
        }

        while (row <= 10) {
            /////////START///////////
            int col = 1;
            while(col <= 10){
                if(row == r && col == c && c < 10 && r < 10 ){
                    System.out.print("*");
                }

                else if (row < 10 && col == c && !(row == 1 || row == 10 || col == 1 || col == 10) ) {
                    System.out.print("|");
                }

                else if (col < 10 && row == r && !(row == 1 || row == 10 || col == 1 || col == 10)) {
                   System.out.print("---");
                }

                if(row == 1 || row == 10 ){
                  System.out.print("#  ");
                }


                else{

                    if(row == 11 || col == 1 ){
                       System.out.print("#  " );
                    }



                    else{
                        if (!(row < 10 && col == c || col < 10 && row == r)) {
                            System.out.print("...");
                        }
                    }
                }
                col++;
            }
            /////////FINISH///////////
            if(row == 1 || row == 10){
                System.out.println(""+row);
            }
            if(row > 1 && row < 10){
                System.out.println("  "+row);
            }
            row++;
        }
        /////////FINISH///////////
    }
}
