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


@WebServlet(name = "DeconnexionController", urlPatterns = {"/DeconnexionController"})
public class DeconnexionController extends HttpServlet {

   
    ClientService clientdeconnecteservice = new ClientService();
    EmployeService employedeconnecteservice = new EmployeService();
    Client clientdeconnecte;
    Employe employedeconnecte;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        // session stock de maniere temporaire les données de user qui visite le site
        
//        if(clientdeconnecte != null){
//        clientdeconnecte = (Client) session.getAttribute("clientconnecté") ;
//        clientdeconnecteservice.getByEmail(clientdeconnecte.getEmail()).setLoggedornot(0);
//        }
//       
//        if(employedeconnecte != null){
//        employedeconnecte = (Employe) session.getAttribute("employeconnecté") ;
//        employedeconnecteservice.getByEmail(employedeconnecte.getEmail()).setLoggedornot(0);
//        
//        }
//        
        
        
           
    
        session.invalidate();
        
        
       
        
        // detruite la session = perdre les données de session de user actuelle = deconnexion
        response.sendRedirect("Authentification.jsp");
        
        
        
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
