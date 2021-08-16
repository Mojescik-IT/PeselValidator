public class PeselValidator {

    public static void main(String[] args) {


        // https://obywatel.gov.pl/pl/dokumenty-i-dane-osobowe/czym-jest-numer-pesel
        //       deklaracja tablicy np. 61101771233
                 int[] pesel = {6,1,1,0,1,7,7,1,2,3,3};
                 //Pomnóż każdą cyfrę z numeru PESEL przez odpowiednią wagę: 1-3-7-9-1-3-7-9-1-3.
                 int[] mnozniki = {1,3,7,9,1,3,7,9,1,3}; // obliczanie sumy kontrolnej

                 int suma = 0;

                 for (int i = 0; i<mnozniki.length; i = i+1){
                    int mnozenie = mnozniki[i] * pesel[i];
                    if (mnozenie >= 10){
                        suma = suma + (mnozenie % 10);

                    }else {
                        suma = suma + mnozenie;
                    }

                 }
        if (suma >= 10) {
            suma = (suma % 10);
        }


        int sumaKontrolna = 10 - suma;
        if (sumaKontrolna == pesel[10]){
            System.out.println("PESEL poprawny");
        }else {
            System.out.println("PESEL nie poprawny");
        }

    }

}
