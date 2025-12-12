public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 9.2;

        double media = (9.2 + 8.0 + 9.0) / 3;
        System.out.println(media);

        //Trabajando con textos

        String sinopsis = """
                Matrix es una paradoja
                la mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) ((media)  / 2);
        System.out.println(clasificacion);
    }
}