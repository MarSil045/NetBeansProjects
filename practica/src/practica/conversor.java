
package practica;


public class conversor {
private static final double tipo_cambio=390;
public conversor (){}
public static double convertorApesos(double dolares){
    return tipo_cambio*dolares;
public static double convertorAdolares(double pesos){
    return tipo_cambio/390;
public static void main (string[]args){
    system.out.println(conversor.convertirApesos(500));
    System.out.println(conversor.convertirAdolares(195000));
    
   


