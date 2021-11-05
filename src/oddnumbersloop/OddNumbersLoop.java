/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddnumbersloop;

/**
 *
 * @author AhmedTawfik
 */
public class OddNumbersLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int count = 0;

        while (count++ < 10) {

            if (count % 2 == 0) {
                continue;
            }

            System.out.println(count);

        }

    }

}
