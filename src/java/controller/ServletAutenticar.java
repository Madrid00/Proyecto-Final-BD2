/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autenticacion;
import model.ModeloConexion;

/**
 *
 * @author T-102
 */
public class ServletAutenticar extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    //Creamos la conexcion
      String login= request.getParameter("login");
      String password=request.getParameter("password");
      //Creamos el modelo
      
        boolean autenticado=Autenticacion.autenticar(login, password);
        if(autenticado){
        RequestDispatcher despachador=request.getRequestDispatcher("/bienvenidos.html");
            despachador.forward(request, response);
        }else{
    RequestDispatcher despachador=request.getRequestDispatcher("/error.html");
         despachador.forward(request, response);
        }
    }
    
}