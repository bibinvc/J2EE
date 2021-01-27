/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import bean.Bean;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bvcbi
 */
@WebServlet(name = "Servlet_p3", urlPatterns = {"/Servlet"})
public class Servlet_p3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Enumeration NomsParam = request.getParameterNames();
                List<Bean> the_list = new ArrayList();
                        int i = 0; 
        Bean the_bean = new Bean();
        while (NomsParam.hasMoreElements()) {
            String NomParam = (String) NomsParam.nextElement();
            String[] ValeursParam = request.getParameterValues(NomParam);
            for (int j = 0; j < ValeursParam.length; j++) {
                try {
                    the_bean = the_list.get(j);
                    the_bean.setContent(ValeursParam[j]);
                    the_bean.setBonuscal();
                } catch (Exception ex) {
                    the_bean = new Bean();
                    the_bean.setTitle(ValeursParam[j]);
                    the_list.add(the_bean);
                }
            }
        }
        request.setAttribute("list", the_list);
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonus.jsp").forward(request, response);


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
