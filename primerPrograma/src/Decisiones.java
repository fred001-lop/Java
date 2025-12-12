public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 9.2;
        String tipoDeplan = "plus";

//        if (fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.println("Peliculas retro que aun vale la pena ver");
//        }

        if (incluidoEnElPlan && tipoDeplan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
