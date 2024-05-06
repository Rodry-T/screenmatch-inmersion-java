import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido Rodrigo");
        int fechaDeLanzamiento=1999;
        double evaluacion=4.5;
        boolean incluidoEnElPlanBasico=true;
        String nombre="Matrix";
        String sinopsis= """
                La mejor pelicula del milenio
                """;
        double mediaUsuario=0;
        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de Lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evalucion: "+evaluacion);
        System.out.println(incluidoEnElPlanBasico);
         double mediaEvalucion=(4.5+4.8+3)/3;
        System.out.println("Media de Evaluacion de Matrix: "+mediaEvalucion);

        if (fechaDeLanzamiento>=2023){
            System.out.println("Pelicula popular en el momento");
        }else {
            System.out.println("Pelicula retro");
        }
        for (int i = 0; i < 3; i++) {
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingresa la nota o Evalucion a Matrix");
            double notaMatrix=leer.nextDouble();
            mediaUsuario=mediaUsuario+notaMatrix;
        }
        System.out.println("La media Calculada es: "+mediaUsuario/3);
    }
}