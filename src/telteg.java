import java.util.Scanner;


/*
* File: ButtonPanel.java
* Author: Andó Attila 
* Copyright: 2021, Nagy János
* Group: Szoft I/1/N
* Date: 2023-02-20
* Github: https://github.com/halando/Dolgozat2.git
* Licenc: GNU GPL
*/
 




public class telteg {


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Andó Attila");
        System.out.println("Szoft I/1/N");
        System.out.println("2023-02-20");
        System.out.println("0354 Feladat");
        
        

        Scanner scanner = new Scanner(System.in);
       System.out.println("Kérem adja meg az egyik oldal hosszt(a)!");
        String oldal = scanner.nextLine();
       double a = Double.parseDouble(oldal);
       System.out.println("Kérem adja meg a másik oldal hosszt(b)!");
       String oldal2 = scanner.nextLine();
       double b = Double.parseDouble(oldal2);

       double terulet =(2*a*2*b)/2;
       System.out.println("Telek területe:" +terulet);

      scanner.close();
    }

  
}
