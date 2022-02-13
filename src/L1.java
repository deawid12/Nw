//import java.util.Scanner;
//
//public class L1 {
//    public static  void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        System.out.print("Podaj swoje imię: ");
//        name = scanner.next();                    // nextLine - pobiera całą linię a nie tylko pierwsze słowo
//        System.out.print("Hello " + name);  //formatowanie %s string; %d liczby; %f liczby zmiennoprzecinkowe
//                                            //np. ("Hello %s, name)
//
//    }
//
//}

//---------------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//    char zmChar; // char przechowuję tylko 1znak
//    zmChar = 'a';
//    System.out.println(zmChar);
//
//    //String
//    String zmString = "alaf";
//    System.out.println(zmString);
//
//    // Boolean prawda fałsz
//    boolean zmBoolean = true;
//    System.out.println(zmBoolean);
//
//    //byte
//    byte zmByte = Byte.MIN_VALUE;
//    byte zmByte2 = Byte.MAX_VALUE;
//    System.out.println("Byte: " + zmByte + "   " + zmByte2);
//
//    //short
//    short zmShort = Short.MIN_VALUE;
//    short zmShort2 = Short.MAX_VALUE;
//    System.out.println("Short: "+zmShort+"  "+zmShort2);
//
//    //int liczby całkowite
//    int zmInt = Integer.MIN_VALUE;
//    int zmInt2 = Integer.MAX_VALUE;
//    System.out.println("Int: " + zmInt + "   " + zmInt2);
//
//    //Long
//    long zmLong = Long.MIN_VALUE;
//    long zmLong2 = Long.MAX_VALUE;
//    System.out.println("Long: "+ zmLong + "   " + zmLong2);
//
//    //float zminnoprzecinkowe
//    //float zmFloat = 26.35f; // f musi być żeby było wiadomo że to liczba float
//    float zmFloat = Float.MIN_VALUE;
//    float zmFloat2 = Float.MAX_VALUE;
//    System.out.println("float: " + zmFloat + "   " + zmFloat2);
//
//    //double
//    //double ZmDouble = 26.47d;
//    double zmDouble = Double.MIN_VALUE;
//    double zmDouble2 = Double.MAX_VALUE;
//    System.out.println("double: " + zmDouble + "   " + zmDouble2);
//
//    //stała
//    final int liczba = 256;
//    }
//
//}

//---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//        int a = 25;
//        int b = 10;
//        //int wynik = a / b; // część ułamkowa jest ucinana
//        double wynik = (double)a / (double)b;
//        System.out.println("a/b: " + wynik);
//        int wyn = a % b;
//        System.out.println("reszta z dzielenia: " + wyn);
//        a += b;
//        System.out.println("a += b: " + a);
//        // potęgowanie za pomocy pętli lub:
//        System.out.println("potęgowanie 2^3: " + Math.pow(2, 3));
//        System.out.println("Pierwiastkowanie kwadratowe 9: " + Math.sqrt(9));
//        System.out.println("Wartość bezwzględna z -2: " + Math.abs(-2));
//        System.out.println("Wartość liczby Pi: " + Math.PI);
//        System.out.println("Wartość liczby E: " + Math.E);
//        System.out.println("a + 1: " + a++); // jeżeli piszmy tutaj to nie zwiększy bo tak jest, dopiero wywołanie drugi raz a da nam wynik a+1
//            // jeżeli chcemy aby w print było już a + 1 robimy println(++a)
//
//    }
//
//}

//---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//        int a = 6, b = 6;
//        boolean logiczna = a == b && 5==5; // == - równe   != różne  && - i   || - lub   !a - inne od a !(a) == b
//        System.out.println(logiczna);
//
//    }
//
//}

//---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//        int wiek = 16;
//
//        if (wiek >=18){
//            System.out.println("Pełnoletni");
//        }
//        else if(wiek>=16){
//            System.out.println("Możesz pracować");
//        }
//            else{
//                System.out.println("Nie możesz pracować");
//            }
//        String imie = wiek >= 18 ? "Bartek" : "Jan";
//                                //?-do funkcji Bartek jeżeli jest to prawda a Jan jeżeli fałsz
//        System.out.println(imie);
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//    int poraRoku = 3;
//    //switch oznacza przykładowo przełącznik    case - przypadek
//    switch(poraRoku){
//        case 1:
//            System.out.println("wiosna");
//            break;
//        case 2:
//            System.out.println("lato");
//            break;
//        case 3:
//            System.out.println("jesień");
//            break;
//        case 4:
//            System.out.println("zima");  // trzeba użyć breakna końcu aby nie wypisywał wszystkiego co jest dalej
//            break;
//        default:  // to jest po to aby zabezpieczyć program przed nieprzewidzianymi przypadkami
//            System.out.println("podałeś przypadek który nie może się wykonać");
//    }
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
////        int i = 5;
////        while (i > 0){
////            System.out.println(i);
////            i--;
////        }
//        // do while różni się od while tym że do while wykona się przynajmniej raz a dopiero sprawdzi warunek
////        do{
////            System.out.println(i);
////            i--;
////        }while(i>0);
//
//        for(int i = 5; i>0; i--){
//            System.out.println(i);
//        }
//
//    }
//
//}
// ---------------------------------------------------------------
//import java.util.Random;
//import java.util.Scanner;
//
//public class L1 {
//    public static  void main(String[] args){
//        int i = 0, los, odp;
//        Random rnd = new Random();
//        los = rnd.nextInt(10)+1;  // +1 aby pozbyć się zera
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Zgadnij liczbę od 1 do 10: ");
//        do{
//            i++;
//            System.out.println("Podaj liczbę: ");
//            odp = scanner.nextInt();
//            if(odp > los){
//                System.out.println("Moja liczba jest mniejsza ");
//            }
//            else if((odp < los)){
//                System.out.println("Moja liczba jest większa ");
//            }
//        }while(odp != los);
//
//        System.out.println("Barwo zgadłeś za " + i + " razem");
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//        String[] tab = new String[20];
//        tab[19] = "Ania";
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}
// ---------------------------------------------------------------
import java.util.Arrays;
public class L1 {
    public static  <T extends Comparable<T>> ArrayList<T> removeRepatedElement(T[] tab )
    {
        ArrayList<T> list  = new ArrayList<>();


        for (int i = 0; i < tab.length-1; i++) {
            if(!list.contains(tab[i]))
            {
                list.add(tab[i]);
            }

        }

        return list;
    }

}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}
// ---------------------------------------------------------------
//public class L1 {
//    public static  void main(String[] args){
//
//
//
//    }
//
//}