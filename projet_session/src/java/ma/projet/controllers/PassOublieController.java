/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entities.Client;
import ma.projet.entities.Employe;
import ma.projet.services.ClientService;
import ma.projet.services.EmailSender;
import ma.projet.services.EmployeService;


/**
 *
 * @author pc
 */
@WebServlet(name = "PassOublieController", urlPatterns = {"/PassOublieController"})
public class PassOublieController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");

        ClientService cls = new ClientService();
        EmployeService els = new EmployeService();

        Client client = cls.getByEmail(email);
        Employe employe = els.getByEmail(email);

        if (client != null) {

            double i = Math.random() * 100000;
            String code = (i + "").substring(0, 4);
            HttpSession session = request.getSession();
            session.setAttribute("code", code);
            session.setAttribute("client", client);
            EmailSender.sendEmail(email,"Code Activaton",code);
            response.sendRedirect("traitement.jsp");      
//            RequestDispatcher dispatcher = null;
//            dispatcher = request.getRequestDispatcher("/traitement.jsp");
//            dispatcher.forward(request, response);

        }else if (employe != null) {

            double i = Math.random() * 100000;
            String code = (i + "").substring(0, 4);
            HttpSession session = request.getSession();
            session.setAttribute("code", code);
            session.setAttribute("employe", employe);
            EmailSender.sendEmail(email,"Code Activaton",code);
            response.sendRedirect("traitement.jsp");      
//            RequestDispatcher dispatcher = null;
//            dispatcher = request.getRequestDispatcher("/traitement.jsp");
//            dispatcher.forward(request, response);

        } else {
            response.sendRedirect("passoublie.jsp?msg=Email n’existe pas ");
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
