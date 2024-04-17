import java.util.Scanner;

public class evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0 ;
        double mediaEvaluaciones = 0;
        double  totalEvauaciones=0;

        while (nota!=-1) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();

            if (nota!=-1){
                mediaEvaluaciones += nota;
                totalEvauaciones++;
            }
        }
            System.out.println("La media de evaluaciones para matrix es : " + mediaEvaluaciones / totalEvauaciones);
    }
}
