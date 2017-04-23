/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author T-102
 */
import java.sql.CallableStatement;
import java.sql.Connection;

public class Procedimiento {
public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement registro=con.prepareCall("{call GUARDAR_PELICULA(?,?,?)}");
        registro.registerOutParameter(1,java.sql.Types.INTEGER);
        registro.setString(2,"rapido y furioso 8");
        registro.setString(3,"esta muy chida");
      
        registro.execute();
        int pk=registro.getInt(1);
        System.out.println("El id ingresado es:"+pk);
    }
    
}
 

