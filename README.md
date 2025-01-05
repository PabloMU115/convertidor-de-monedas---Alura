# convertidor-de-monedas---Alura
En este repositorio se contiene el proyecto que corresponde al challenge de la plataforma de cursos alura, el cual consiste de un convertidor de monedas.

## Estructura del Proyecto

### Archivos principales:
1. **`Monedas.java`**
   - Clase que almacena los datos de la conversión, como la tasa de conversión y el resultado obtenido.
   - Métodos principales:
     - `getValorMoneda()`: Retorna la tasa de conversión.
     - `getResultadoConversion()`: Retorna el resultado de la conversión.
     - `valores()`: Devuelve ambos valores como un arreglo.

2. **`MonedasWraper.java`**
   - Clase envoltorio para contener los datos de la conversión: la tasa de conversión (`conversion_rate`) y el resultado de la conversión (`conversion_result`).
   - Usa el tipo `record` para simplificar el almacenamiento de datos inmutables.

3. **`Principal.java`**
   - La clase principal que contiene el menú interactivo y la lógica de ejecución.
   - Funciones principales:
     - Ofrecer opciones para diferentes tipos de conversiones entre monedas.
     - Registrar un historial de transacciones con fecha y hora.
     - Visualizar y vaciar el historial.

## Funcionalidades

- **Monedas Soportadas**:
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Colombiano (COP)
  - Colón Costarricense (CRC)
  - Peso Chileno (CLP)

- **Opciones del Menú**:
  - Convertir entre monedas (de USD a otras o viceversa).
  - Visualizar el historial de conversiones realizadas.
  - Vaciar el historial de transacciones.
  - Salir del programa.

- **Historial de Transacciones**:
  - Guarda detalles de cada conversión, como cantidad convertida, resultado, y fecha/hora.

## Requisitos

- **Java Development Kit (JDK)** 11 o superior.
- Conexión a Internet para obtener tasas de conversión actualizadas a través de una API externa (probablemente implementada en una clase `ConsumirAPI` no incluida aquí).

## Ejecución

1. Clonar o descargar el proyecto.
2. Compilar los archivos Java:
   ```bash
   javac -d . Monedas.java MonedasWraper.java Principal.java
