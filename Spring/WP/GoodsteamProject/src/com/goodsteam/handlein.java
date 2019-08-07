package com.goodsteam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class handlein
 */
@WebServlet(name = "handlein", urlPatterns = {"/handlein"})
public class handlein extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public handlein() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init( ServletConfig config ) throws ServletException
    {
        super.init( config );
        double count = 0;
        double sum = 0;
        double avg=0;
        getServletContext().setAttribute( "count", count );
        getServletContext().setAttribute( "sum", sum );
        getServletContext().setAttribute( "avg", avg );
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  	response.setContentType("text/html");
	       
	        String input = request.getParameter("in1");
	        System.out.println(input);
	        int in=0;
	        if(input.equals("Very Poor(1)"))
	        	in=1;
	        else if(input.equals("Poor(2)"))
	        	in=2;
	        else if(input.equals("Average(3)"))
	        	in=3;
	        else if(input.equals("Good(4)"))
	        	in=4;
	        else if(input.equals("Excellent(5)"))
	        	in=5;
	    	ServletContext servletContext = getServletContext();
	        double count = (Double) servletContext.getAttribute( "count" );
	        double avg = (Double) servletContext.getAttribute( "avg" );
	        double sum =  (Double) servletContext.getAttribute( "sum" );
	       
	        System.out.println("count "+count);
	        System.out.println("sum "+sum);
	        System.out.println("avg "+avg);
	        sum=sum+in;
	        count=count+1;
	        double newavg = sum/count;
	        servletContext.setAttribute("count",count);
	        servletContext.setAttribute("avg",newavg);
	        servletContext.setAttribute("sum",sum);
	        System.out.println("count "+count);
	        System.out.println("sum "+sum);
	        System.out.println("avg "+newavg);
	        RequestDispatcher rd = request.getRequestDispatcher("Welcome.html");
	        rd.forward(request, response);
	        

	       
	}

}
