import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, """
                A continuacion debe ingresar la funcion que desee realizar\s
                La primer palabra debe ser la operacion (`suma` `resta` `multiplica` `divide`\s
                Seguido debe ingresar el primer operando, y luego el segundo operando
                Por ej: `suma dos mas dos y divide por cuatro
                O, `multiplica cinco por ocho y suma cuatro`""");
        String[] arreglo = str.split("\\s+");

        int numero1 = 99999;
        int numero2 = 99999;
        int numero3 = 99999;
        int resultadoint = 99999;
        String resultado = null;
        int ultimo = arreglo.length-1;

        switch (arreglo[1]) {
            case "cero" -> numero1 = 0;
            case "uno" -> numero1 = 1;
            case "dos" -> numero1 = 2;
            case "tres" -> numero1 = 3;
            case "cuatro" -> numero1 = 4;
            case "cinco" -> numero1 = 5;
            case "seis" -> numero1 = 6;
            case "siete" -> numero1 = 7;
            case "ocho" -> numero1 = 8;
            case "nueve" -> numero1 = 9;
            default -> JOptionPane.showMessageDialog(null, "El primer numero ingresado no es correcto");
        }
        switch (arreglo[3]) {
            case "cero" -> numero2 = 0;
            case "uno" -> numero2 = 1;
            case "dos" -> numero2 = 2;
            case "tres" -> numero2 = 3;
            case "cuatro" -> numero2 = 4;
            case "cinco" -> numero2 = 5;
            case "seis" -> numero2 = 6;
            case "siete" -> numero2 = 7;
            case "ocho" -> numero2 = 8;
            case "nueve" -> numero2 = 9;
            default -> JOptionPane.showMessageDialog(null, "El segundo numero ingresado no es correcto");
        }
        switch (arreglo[ultimo]) {
            case "cero" -> numero3 = 0;
            case "uno" -> numero3 = 1;
            case "dos" -> numero3 = 2;
            case "tres" -> numero3 = 3;
            case "cuatro" -> numero3 = 4;
            case "cinco" -> numero3 = 5;
            case "seis" -> numero3= 6;
            case "siete" -> numero3 = 7;
            case "ocho" -> numero3 = 8;
            case "nueve" -> numero3 = 9;
            default -> JOptionPane.showMessageDialog(null, "El ultimo numero ingresado no es correcto");
        }
        switch (arreglo[0]) {
            case "suma" -> {
                resultado = String.valueOf(numero1 + numero2);
                resultadoint = (numero1 + numero2);
            }
            case "resta" -> {
                resultado = String.valueOf(numero1 - numero2);
                resultadoint = (numero1 - numero2);
            }
            case "divide" -> {
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                } else {
                    resultado = String.valueOf(numero1 / numero2);
                    resultadoint = (numero1 / numero2);
                }
            }
            case "multiplica" -> {
                resultado = String.valueOf(numero1 * numero2);
                resultadoint = (numero1 * numero2);
            }
            default -> JOptionPane.showMessageDialog(null, "La funcion no es correcta");
        }

        if(arreglo[5].contains("ma")){
            resultado = String.valueOf(resultadoint+numero3);
        }
        else if (arreglo[5].contains("re")){
            resultado = String.valueOf(resultadoint-numero3);
        }
        else if(arreglo[5].contains("di")){
            if(numero3 == 0){
                JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
            }
            else{
                resultado = String.valueOf(resultadoint/numero3);
            }
        }
        else if(arreglo[5].contains("mul")){
            resultado = String.valueOf(resultadoint*numero3);
        }
        else{
            JOptionPane.showMessageDialog(null, "La segunda operacion es incorrecta");
        }

        JOptionPane.showMessageDialog(null, "El resultado de la operacion es " + resultado);

        }
    }
