package conversorMonedas;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsumirAPI datos = new ConsumirAPI();
        int opcion = 0;
        double[] arreglo;
        String formattedDateTime;
        ArrayList<String> historial = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while(opcion == 0){
            System.out.println("------------------------------");
            System.out.println("Bienvenido al conversor de monedas:\nSeleccione la opción que desee utilizar");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar");
            System.out.println("3) Dólar => Real Brasileño");
            System.out.println("4) Real Brasileño => Dólar");
            System.out.println("5) Dólar => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dólar");
            System.out.println("7) Dólar => Colón Costarricense");
            System.out.println("8) Colón Costarricense => Dólar");
            System.out.println("9) Dólar => Peso Chileno");
            System.out.println("10) Peso Chileno => Dólar");
            System.out.println("11) Historial.");
            System.out.println("12) Vaciar Historial.");
            System.out.println("13) Salir.");
            System.out.println("------------------------------");

            try{
                Scanner lectura = new Scanner(System.in);
                int busqueda = Integer.valueOf(lectura.nextLine());
                if(busqueda > 0 && busqueda < 14){
                    switch(busqueda) {
                        case 1:
                            System.out.println("Inserte la cantidad de Dolares que desea convertir a Pesos Argentinos:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"USD","ARS");
                            System.out.println("Cantidad de Pesos Argentinos que equivalen al valor de un Dólar: "+arreglo[0]);
                            System.out.println("Cantidad de Dolares: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Dolar a Peso Argentino:\n" +
                                    "Cantidad de Dolares: "+busqueda+"\n" +
                                    "Resultado de la conversion en Pesos Argentinos: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 2:
                            System.out.println("Inserte la cantidad de Pesos Argentinos que desea convertir a Dolares:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"ARS","USD");
                            System.out.println("Valor del Dolar en relación a un Peso Argentino: "+arreglo[0]);
                            System.out.println("Cantidad de Pesos Argentinos: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Peso Argentino a Dolar:\n" +
                                    "Cantidad de Pesos Argentinos: "+busqueda+"\n" +
                                    "Resultado de la conversion en Dolares: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 3:
                            System.out.println("Inserte la cantidad de Dolares que desea convertir a Reales Brazileños:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"USD","BRL");
                            System.out.println("Cantidad de Reales Brazileños que equivalen al valor de un Dólar: "+arreglo[0]);
                            System.out.println("Cantidad de Dolares: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Dolar a Real Brazileño:\n" +
                                    "Cantidad de Dolares: "+busqueda+"\n" +
                                    "Resultado de la conversion en Reales Brazileños: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 4:
                            System.out.println("Inserte la cantidad de Reales Brazileños que desea convertir a Dolares:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"BRL","USD");
                            System.out.println("Valor del Dolar en relación a un Real Brasileño: "+arreglo[0]);
                            System.out.println("Cantidad de Reales Brazileños: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Real Brazileño a Dolar:\n" +
                                    "Cantidad de Reales Brazileños: "+busqueda+"\n" +
                                    "Resultado de la conversion en Dolares: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 5:
                            System.out.println("Inserte la cantidad de Dolares que desea convertir a Pesos Colombianos:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"USD","COP");
                            System.out.println("Cantidad de Pesos Colombianos que equivalen al valor de un Dólar: "+arreglo[0]);
                            System.out.println("Cantidad de Dolares: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Dolar a Peso Colombiano:\n" +
                                    "Cantidad de Dolares: "+busqueda+"\n" +
                                    "Resultado de la conversion en Pesos Colombianos: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 6:
                            System.out.println("Inserte la cantidad de Pesos Colombianos que desea convertir a Dolares:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"COP","USD");
                            System.out.println("Valor del Dolar en relación a un Peso Colombiano: "+arreglo[0]);
                            System.out.println("Cantidad de Pesos Colombianos: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Peso Colombiano a Dolar:\n" +
                                    "Cantidad de Pesos Colombianos: "+busqueda+"\n" +
                                    "Resultado de la conversion en Dolares: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 7:
                            System.out.println("Inserte la cantidad de Dolares que desea convertir a Colones Costarricenses:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"USD","CRC");
                            System.out.println("Cantidad de Colones Costarricenses que equivalen al valor de un Dólar: "+arreglo[0]);
                            System.out.println("Cantidad de Dolares: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Dolar a Colón Costarricense:\n" +
                                    "Cantidad de Dolares: "+busqueda+"\n" +
                                    "Resultado de la conversion en Colones Costarricenses: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 8:
                            System.out.println("Inserte la cantidad de Colones Costarricenses que desea convertir a Dolares:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"CRC","USD");
                            System.out.println("Valor del Dolar en relación a un Colón Costarricense: "+arreglo[0]);
                            System.out.println("Cantidad de Colones Costarricenses: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Colón Costarricense a Dólar:\n" +
                                    "Cantidad de Colones Costarricenses: "+busqueda+"\n" +
                                    "Resultado de la conversion en Dolares: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 9:
                            System.out.println("Inserte la cantidad de Dolares que desea convertir a Pesos Chilenos:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"USD","CLP");
                            System.out.println("Cantidad de Pesos Chilenos que equivalen al valor de un Dólar: "+arreglo[0]);
                            System.out.println("Cantidad de Dolares: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Dolar a Peso Chileno:\n" +
                                    "Cantidad de Dolares: "+busqueda+"\n" +
                                    "Resultado de la conversion en Pesos Chilenos: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 10:
                            System.out.println("Inserte la cantidad de Pesos Chilenos que desea convertir a Dolares:");
                            lectura = new Scanner(System.in);
                            busqueda = Integer.valueOf(lectura.nextLine());
                            arreglo = datos.obtenerDatos(busqueda,"CLP","USD");
                            System.out.println("Valor del Dolar en relación a un Peso Chileno: "+arreglo[0]);
                            System.out.println("Cantidad de Pesos Chilenos: "+busqueda);
                            System.out.println("Resultado de la conversión: "+arreglo[1]);
                            formattedDateTime = LocalDateTime.now().format(formatter);
                            System.out.println(formattedDateTime);
                            historial.add("Conversion de Peso Chileno a Dolar:\n" +
                                    "Cantidad de Pesos Chilenos: "+busqueda+"\n" +
                                    "Resultado de la conversion en Dolares: "+arreglo[1]+"\n" +
                                    "Fecha y hora: "+formattedDateTime);
                            break;
                        case 11:
                                if(historial.isEmpty()){
                                    System.out.println("Historial de Transacciones realizadas:\n");
                                    for(int i = 0; i < historial.size(); i++) {
                                        System.out.println(historial.get(i));
                                        System.out.println("---------------------------------");
                                }
                                }else System.out.println("El Historial de transacciones se encuentra vacío.");
                            break;
                        case 12:
                            System.out.println("Historial de Transacciones vaciado correctamente");
                            historial = new ArrayList();
                            break;
                        case 13:
                            System.out.println("Gracias por utilizar el sistema de conversiones.");
                            opcion = 999;
                    }
                }else System.out.println("Opción invalida, intentelo de nuevo.");
            }catch (NumberFormatException e){
                System.out.println("Opción invalida, intentelo de nuevo.");
            }
        }
    }
}
