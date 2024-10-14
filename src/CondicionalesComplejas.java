public class CondicionalesComplejas {
    public static void main(String[] args) {

        //Desarrollar un programa que permita determinar la cantidad de cifras
        //de un número X teniendo en cuenta que el número únicamente puede
        //tener 4 cifras. Mostrar un mensaje por defecto si el número supera las
        //4 cifras.

        int num = 9999;

        if (num > 0 && num < 10){
            System.out.println("El numero tiene un solo digito");
        }else if (num > 9 && num < 100){
            System.out.println("El numero tiene dos digitos");
        } else if (num > 99 && num < 1000 ) {
            System.out.println("El numero tiene tres digitos");
        } else if (num > 999 && num <10000) {
            System.out.println("El numero tiene cuatro digitos");
        }else {
            System.out.println("el numero tiene mas de cuatro digitos");
        }

    }



}
