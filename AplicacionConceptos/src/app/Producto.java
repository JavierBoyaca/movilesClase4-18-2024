package app;

import java.util.Scanner;

public class Producto {

    int idProducto;
    String nombreProducto;
    double precio;
    double costo;
    double cantidad;
    String descripcion;
    boolean disponible;

    Scanner sc = new Scanner(System.in);
    String [][] productos = new String[3][7]; //Matriz que va a guardar arrays o vectores



    public  void registrarProductos(){



        int fila = 0;

        while (fila < productos.length) {

            String [] producto = new String[7]; //Vector o arreglo estatico


            System.out.println("Digite el Id del producto");
            idProducto = sc.nextInt();
            producto[0] = idProducto + ""; //Parseo cuando es un dato numerico
            sc.nextLine();
            System.out.println("Digite el nombre del producto");
            nombreProducto = sc.nextLine();
            producto[1] = nombreProducto;
            System.out.println("Digite el precio del producto");
            sc.nextDouble();
            producto[2] = precio + "";
            sc.nextLine();
            System.out.println("Digite el costo del producto");
            costo = sc.nextDouble();
            producto[3] = costo + "";
            sc.nextLine();
            System.out.println("Digite la cantidad del producto");
            cantidad = sc.nextDouble();
            producto[4] = cantidad + "";
            System.out.println("Escriba la descripcion del producto");
            descripcion = sc.nextLine();
            producto[5] = descripcion;
            System.out.println("El producto esta disponible?");
            disponible = sc.nextBoolean();
            producto[6] = disponible + "";

            productos[fila] = producto;

            fila++;

        }
        }
        public void verProductos(){

        for (int i = 0 ; i< productos.length; i++){
            for(int j = 0; j< productos[i].length; j++){
                System.out.println(productos[i][j]);
            }
        }
        }

}
