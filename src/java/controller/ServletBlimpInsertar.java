/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOBlimp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author T-102
 */
public class ServletBlimpInsertar extends HttpServlet{
     
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //PEDIMOS DATOS AL CLIENTE
       String titulo= request.getParameter("titulo");
       String sinopsis=request.getParameter("sinopsis");
       System.out.println("NOs lelgo el titulo:"+titulo);
      try{
            //Se invoca el procedimiento
         out.println( DAOBlimp.guardarPelicula(titulo, sinopsis));
            
            
      }catch(Exception e){  }
        
    }
}

