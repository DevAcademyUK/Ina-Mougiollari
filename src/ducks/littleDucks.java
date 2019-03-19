package ducks;

import java.util.Scanner;

public class littleDucks {

    public static void main(String[] args){

    littleDucks ducksong = new littleDucks();
        ducksong.ducks();

}
    private void ducks(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" How many ducks? ");
        int ducks = myScanner.nextInt();

        String word = "ducks";
        if (ducks == 1){
            word = "duck";
        }

        for (int i = ducks; i > 0; i--) {
            System.out.println(i + " little " + word + " went swimming one day ");
            System.out.println(" over the hill and far away");
            System.out.println(" Mother duck said, 'quack, quack, quack ");


            if (ducks > 1) {
                if (i > 1) {
                    if ((i - 1) == 1) {
                        word = "duck";
                    }
                    System.out.println(" And only " + (i - 1) + " little " + word + " come back ");
                } else {
                    System.out.println(" And all her " + ducks + " little ducks came back ");
                }
            } else{
                    System.out.println(" And her lonely little come back ");
                }
            }

    }
}

