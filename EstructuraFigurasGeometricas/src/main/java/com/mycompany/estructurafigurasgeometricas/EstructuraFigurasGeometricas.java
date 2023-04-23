/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurafigurasgeometricas;

/**
 *
 * @author rider
 */
import javax.swing.JOptionPane;

public class EstructuraFigurasGeometricas {
  
    public static class Figuras {
        
        public void AreaCirculo(double radio) {
            double area = Math.PI * Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null, "El area del circulo es: " + String.format("%5.5f", area));
        }
        
        public void AreaCuadrado(double lado) {
            double area = Math.pow(lado, 2);
            JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + String.format("%5.5f", area));
        }
        
        public void AreaTriangulo(double base, double altura) {
            double area = (base * altura) / 2;
            JOptionPane.showMessageDialog(null, "El area del triangulo es: " + String.format("%5.5f", area));
        }
        
        public void AreaRectangulo(double base, double altura) {
            double area = base * altura;
            JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + String.format("%5.5f", area));
        }
        
        public void AreaEsfera(double radio) {
            double area = 4 * Math.PI * Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null, "El area de la esfera es: " + String.format("%5.5f", area));
        }
        
        public void AreaCubo(double arista) {
            double area = 6 * Math.pow(arista, 2);
            JOptionPane.showMessageDialog(null, "El area del cubo es: " + String.format("%5.5f", area));
        }
    }
    
    public static class Datos {
        
        public void menu() {
            Figuras figuras = new Figuras();
            String opcion = JOptionPane.showInputDialog("Ingrese la figura geometrica que desea calcular su area:\n" +
                                                         "1. Circulo\n" +
                                                         "2. Cuadrado\n" +
                                                         "3. Triangulo\n" +
                                                         "4. Rectangulo\n" +
                                                         "5. Esfera\n" +
                                                         "6. Cubo");
            if (opcion != null) {
                switch(opcion) {
                    case "1":
                        String radioStr = JOptionPane.showInputDialog("Ingrese el radio del circulo:");
                        if (radioStr != null) {
                            double radio = Double.parseDouble(radioStr);
                            figuras.AreaCirculo(radio);
                        }
                        break;
                    case "2":
                        String ladoStr = JOptionPane.showInputDialog("Ingrese el lado del cuadrado:");
                        if (ladoStr != null) {
                            double lado = Double.parseDouble(ladoStr);
                            figuras.AreaCuadrado(lado);
                        }
                        break;
                    case "3":
                        String baseStr = JOptionPane.showInputDialog("Ingrese la base del triangulo:");
                        if (baseStr != null) {
                            double base = Double.parseDouble(baseStr);
                            String alturaStr = JOptionPane.showInputDialog("Ingrese la altura del triangulo:");
                            if (alturaStr != null) {
                                double altura = Double.parseDouble(alturaStr);
                                figuras.AreaTriangulo(base, altura);
                            }
                        }
                        break;
                    case "4":
                        String baseRectStr = JOptionPane.showInputDialog("Ingrese la base del rectangulo:");
                        if (baseRectStr != null) {
                            double baseRect = Double.parseDouble(baseRectStr);
                            String alturaRectStr = JOptionPane.showInputDialog("Ingrese la altura del rectangulo:");
                            if (alturaRectStr != null) {
                                double alturaRect = Double.parseDouble(alturaRectStr);
                                figuras.AreaRectangulo(baseRect, alturaRect);
}
}
break;
case "5":
String radioEsferaStr = JOptionPane.showInputDialog("Ingrese el radio de la esfera:");
if (radioEsferaStr != null) {
double radioEsfera = Double.parseDouble(radioEsferaStr);
figuras.AreaEsfera(radioEsfera);
}
break;
case "6":
String aristaStr = JOptionPane.showInputDialog("Ingrese la arista del cubo:");
if (aristaStr != null) {
double arista = Double.parseDouble(aristaStr);
figuras.AreaCubo(arista);
}
break;
default:
JOptionPane.showMessageDialog(null, "Opcion invalida.");
break;
}
} else {
JOptionPane.showMessageDialog(null, "Hasta luego.");
}
}
}    
public static void main(String[] args) {
    Datos datos = new Datos();
    datos.menu();
}
}
    

