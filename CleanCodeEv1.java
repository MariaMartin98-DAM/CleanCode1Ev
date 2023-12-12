
package cleancodeev1;

public class CleanCodeEv1 {
    public static void main(String[] args) {
        //Creación de un Objeto Coche vacío
        Coche cocheVacio = new Coche();
        //Creación de Objetos Coche con atributos predeterminados
        Coche primerCoche = new Coche("BMW", "negro", 430.47f, 0.84f, 6.5f);
        Coche segundoCoche = new Coche("Mercedes", "gris", 150.95f, 1.02f, 6.5f);
        Coche tercerCoche = new Coche("VW", "blanco", 93.62f, 0.65f, 6.5f);
        Coche cuartoCoche = new Coche("Fiat", "rojo", 694.22f, 0.58f, 6.5f);
        
        //Impresión de los atributos de cada Objeto coche y el coste del viaje completo de cada uno
            //Primer Orbjeto coche
        cocheVacio.imprimirCoche(primerCoche);
        System.out.printf("Gasto total del viaje: %20.2f \n", cocheVacio.gastosGasolinaViaje(primerCoche));
            //Segundo Orbjeto coche
        cocheVacio.imprimirCoche(segundoCoche);
        System.out.printf("Gasto total del viaje: %20.2f \n", cocheVacio.gastosGasolinaViaje(segundoCoche));
            //Tercer Orbjeto coche
        cocheVacio.imprimirCoche(tercerCoche);
        System.out.printf("Gasto total del viaje: %20.2f \n", cocheVacio.gastosGasolinaViaje(tercerCoche));
            //Cuarto Orbjeto coche
        cocheVacio.imprimirCoche(cuartoCoche);
        System.out.printf("Gasto total del viaje: %20.2f \n", cocheVacio.gastosGasolinaViaje(cuartoCoche));

    }  
}


