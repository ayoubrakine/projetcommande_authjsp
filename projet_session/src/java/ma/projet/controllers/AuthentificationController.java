/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entities.Client;
import ma.projet.entities.Employe;
import ma.projet.services.ClientService;
import ma.projet.services.EmployeService;
import ma.projet.util.Util;

/**
 *
 * @author pc
 */
@WebServlet(name = "AuthentificationController", urlPatterns = {"/AuthentificationController"})
public class AuthentificationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        ClientService cs = new ClientService();
        Client client = cs.getByEmail(email);

        EmployeService es = new EmployeService();
        Employe employe = es.getByEmail(email);

        if (client != null) {

            if (client.getPassword().equals(Util.MD5(password))) {

                HttpSession session = request.getSession();
                session.setAttribute("client", client);
                //client.setLoggedornot(1);
               // cs.update(client);
                
               // request.setAttribute("msg", "succes");
                response.sendRedirect("Welecome.jsp");
            } else {
                response.sendRedirect("Authentification.jsp?msg=Incorrect Password");
            }

        } else if (employe != null) {

            if (employe.getPassword().equals(Util.MD5(password))) {

                HttpSession session = request.getSession();
                session.setAttribute("employe", employe);
                //employe.setLoggedornot(1);
                //es.update(employe);

                response.sendRedirect("Welecome.jsp");

            } else {
                response.sendRedirect("Authentification.jsp?msg=Incorrect Password");
            }

        } else {
            response.sendRedirect("Authentification.jsp?msg=There is no user registred with this adress");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
