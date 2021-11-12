package com.mycompany.act11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cortez Ramos
 */
public class Main {
    public static BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        int propiedadCalc;
        String figura;
        double atributo;
        String opcion;
        do{
            System.out.println("Selecciona la propiedad a calcular: Área(1) o Perímetro(2)");
            propiedadCalc = Integer.parseInt(entrada.readLine());
            switch(propiedadCalc){
                case 1:
                    System.out.println("Seleccionaste calcular el Área");
                    System.out.println("Seleccionar la figura: Cuadrado, Triangulo o Circulo");
                    figura = entrada.readLine();
                    if (figura.equalsIgnoreCase("Cuadrado")){
                        System.out.println("Ingresa el atributo del cuadrado: La longitud de los lados");
                        atributo = Double.parseDouble(entrada.readLine());
                        Square square = new Square(atributo);
                        System.out.println("El área del cuadrado es de:");
                        System.out.println(square.getArea());
                    }else if(figura.equalsIgnoreCase("Triangulo")){
                        System.out.println("Ingresa el atributo del triangulo: La longitud de los lados");
                        atributo = Double.parseDouble(entrada.readLine());
                        Triangle triangle = new Triangle(atributo);
                        System.out.println("El área del triangulo es de:");
                        System.out.println(triangle.getArea());
                    }else if(figura.equalsIgnoreCase("Circulo")){
                        System.out.println("Ingresa el atributo del circulo: La longitud del radio");
                        atributo = Double.parseDouble(entrada.readLine());
                        Circle circle = new Circle(atributo);
                        System.out.println("El área del circulo es de:");
                        System.out.println(circle.getArea());
                    }else{
                        System.out.println("No ingresaste ninguna figura valida");
                    }
                    break;
                case 2:
                    System.out.println("Seleccionaste calcular el Perímetro");
                    System.out.println("Seleccionar la figura: Cuadrado, Triangulo o Circulo");
                    figura = entrada.readLine();
                    if (figura.equalsIgnoreCase("Cuadrado")){
                        System.out.println("Ingresa el atributo del cuadrado: La longitud de los lados");
                        atributo = Double.parseDouble(entrada.readLine());
                        Square square = new Square(atributo);
                        System.out.println("El perímetro del cuadrado es de:");
                        System.out.println(square.getPerimeter());
                    }else if(figura.equalsIgnoreCase("Triangulo")){
                        System.out.println("Ingresa el atributo del triangulo: La longitud de los lados");
                        atributo = Double.parseDouble(entrada.readLine());
                        Triangle triangle = new Triangle(atributo);
                        System.out.println("El perímetro del triangulo es de:");
                        System.out.println(triangle.getPerimeter());
                    }else if(figura.equalsIgnoreCase("Circulo")){
                        System.out.println("Ingresa el atributo del circulo: La longitud del radio");
                        atributo = Double.parseDouble(entrada.readLine());
                        Circle circle = new Circle(atributo);
                        System.out.println("El perímetro del circulo es de:");
                        System.out.println(circle.getPerimeter());
                    }else{
                        System.out.println("No ingresaste ninguna figura valida");
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
            System.out.println("¿Quieres realizar otro calculo? (S o N)");
            opcion = entrada.readLine();
        }while("s".equals(opcion) || "S".equals(opcion)); 
    }
}
