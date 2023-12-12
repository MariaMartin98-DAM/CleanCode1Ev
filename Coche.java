
package cleancodeev1;

public class Coche {
    //Atributos de la clase
    String modelo;
    String color;
    float nroKilometros;
    float precioGasolina;
    float consumo;

    //Cosntructor de la clase
    public Coche(String modelo, String color, float nroKilometros, float precioGasolina, float consumo) {
        this.modelo = modelo;
        this.color = color;
        this.nroKilometros = nroKilometros;
        this.precioGasolina = precioGasolina;
        this.consumo = consumo;
    }
    //Cosntructor vacío de la clase
    public Coche(){
        modelo = "";
        color = "";
        nroKilometros = 0f;
        precioGasolina = 0f;
        consumo = 0f;
    }
    
    //Getter y Setter de los atributos de la clase
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getNroKilometros() {
        return nroKilometros;
    }
    public void setNroKilometros(float nroKilometros) {
        this.nroKilometros = nroKilometros;
    }
    public float getPrecioGasolina() {
        return precioGasolina;
    }
    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }
    public float getConsumo() {
        return consumo;
    }
    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", color=" + color + ", nroKilometros=" + nroKilometros + 
                ", precioGasolina=" + precioGasolina + ", consumo=" + consumo + '}';
    }
    
    //Método para calcular el coste total de la gasolina de un coche
    public double gastosGasolinaViaje(Coche vehiculo){
        float costeTotal= (vehiculo.nroKilometros * 2 / vehiculo.consumo) * vehiculo.precioGasolina;
        return costeTotal;
    }
    
    //Método para imprimir los atributos de un Objeto de la clase
    public void imprimirCoche(Coche coche){
        System.out.printf("CARACTERISTICAS: \n\tModelo: %26s \n\tColor: %27s \n\tNumero de Kilometros ida: %8s \n\tPrecio combustible: %14s \n"
                , coche.modelo, coche.color, String.valueOf(coche.nroKilometros), String.valueOf(coche.precioGasolina));
    }
}



