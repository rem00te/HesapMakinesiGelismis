import java.util.Scanner;
public class main {

    static double summation(double a, double b){
        double result = a + b;
        System.out.println("Toplam : " + result );
        return result;
    }
    static double deduction(double a, double b){
        double result = a - b;
        System.out.println("Cıkarma : " + result);
        return result;
    }

    static double multiplication(double a,double b){
        double result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }

    static double division(double a, double b){
        double result = a / b;
        System.out.println("Bolme : " + result);
        return result;
    }

    static double exponentialNumber(double a, double b) {
        /*double result = 1;
        if (a == 0 && b == 0) {
            System.out.println("Gecersiz Giris");
        } else if (b <= -1) {
            b = b * (-1);
            double i;
            for (i = 1; i <= b; ) {
                i++;
                result = a * result;
            }
            result = 1 / result;
            System.out.println("Uslu Sayi : " + result);
        } else {
            for (double i = 1; i <= b;) {
                i++;
                result = a * result;
            }System.out.println("Uslu Sayi : " + result);
        }*/
        double result = Math.pow(a,b);
        System.out.println("Uslu Sayi : " + result);
        return result;
    }

    static double mod(double a, double b){
        double result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }

    static  double rectangle(double a,double b){
        double result = (2 * a) + (2 * b);
        System.out.println("Dikdortgen Cevresi : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;
        double number1, number2;



        boolean process = true;


        while (process) {

            System.out.println("İlk sayı : ");
            number1 = input.nextDouble();
            System.out.println("Yapmak istediginiz islemi giriniz :");
            System.out.println("+ Toplama\n- Cikarma\n* Carpma\n/ Bolme\nu Ustlu Sayi\n% Mod Alma\n# Dikdortgen Cevre Hesabi");
            operation = input.next();
            System.out.println("İkinci sayı :");
            number2 = input.nextDouble();

            switch (operation) {
                case "+":
                    summation(number1, number2);
                    break;

                case "-":
                    deduction(number1, number2);
                    break;

                case "*":
                    multiplication(number1, number2);
                    break;

                case "/":
                    division(number1, number2);
                    break;

                case "u":
                    exponentialNumber(number1, number2);
                    break;

                case "%":
                    mod(number1, number2);
                    break;

                case "#":
                    rectangle(number1, number2);
                    break;

                default:
                    System.out.println("Yanlıs Islem Girdiniz");

            }
            System.out.println("Çıkmak istiyor musun ? Evet - e / Hayir - h");
            String deger = input.next();
            if (deger.equals("e")){
                process = true;
            }else {
                process = false;
                System.out.println("Islem Bitmistir!!!");
            }
        }

    }
}
