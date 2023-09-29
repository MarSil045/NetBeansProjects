package guia4ej1consulta;

import java.time.LocalDate;
import java.time.Month;

public class Guia4ej1consulta {

    public static void main(String[] args) {
        scanner opcion=new Scanner(Systyem.in)
        Velero velero = new Velero(3, "ASD567", 2020, 25);
        BarcoMotor barcoMotor=new BarcoMotor(4,"hgdt567",2020,34);
        
        Alquiler alquiler1 = new Alquiler("pablo", "32456789", LocalDate.of(2023, 1, 25),LocalDate.of(2023, 1, 20),23,velero);
        Alquiler alquiler2 =new Alquiler("pablo","32456789",LocalDate.of(2023, 1, 25),LocalDate.of(2023, 1, 20),23, barcoMotor);
       System.out.println("costo alquiler " + alquiler1.costoAlquiler());
        System.out.println("costo alquiler"+alquiler2.costoAlquiler());
