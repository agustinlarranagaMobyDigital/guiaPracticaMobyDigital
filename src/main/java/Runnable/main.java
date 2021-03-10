package Runnable;

import Controllers.ClienteController;
import Controllers.PedidoController;
import Controllers.ProductoController;
import DAO.ClienteDAO;
import DAO.ConecctionDataBase;
import DAO.PedidoDAO;
import DAO.ProductoDAO;
import Models.Cliente;
import Models.Empresa;
import Models.Producto;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java. util. Scanner;
import java.sql.SQLException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        //Punto 4


        try {


            /*ClienteController.add();
            ClienteController.printAll();
           for (int i = 0; i < 6; i++) {
                ProductoController.add();
            }
            ProductoController.printAll();*/

            //PedidoController.hacerPedido();
            PedidoDAO.printAll();
            PedidoController.cobrar(1);

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }


}
