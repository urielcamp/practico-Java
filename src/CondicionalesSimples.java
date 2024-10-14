public class CondicionalesSimples {

    public static void main(String[] args) {


        //Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
        //(Math.random) y por medio de una condicional determinar sí el número
        //es menor a 50 o mayor.


        double numRandom = (Math.random() * 100) - 1;

        System.out.println(numRandom);
        System.out.println("---------------------");

        if (numRandom > 50){
            System.out.println(numRandom + " es mayor a 50");
        }else{
            System.out.println(numRandom + " es menor a 50");
        }




    }
}
