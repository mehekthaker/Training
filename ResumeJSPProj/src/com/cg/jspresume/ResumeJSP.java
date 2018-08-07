package com.cg.jspresume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResumeJSP
 */
@WebServlet("/ResumeJSP")
public class ResumeJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public ResumeJSP() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Resume resume = new Resume(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("gender"), request.getParameter("highestQualification"), request.getParameter("dob"), request.getParameter("hobbies"), request.getParameter("address"), request.getParameter("skills"), request.getParameter("email"), request.getParameter("website"), request.getParameter("contactNumber"), request.getParameter("summary"));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
