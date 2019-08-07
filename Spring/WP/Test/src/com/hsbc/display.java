package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class display
 */
@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public display() {
        super();
    }
    public void init( ServletConfig config ) throws ServletException
    {
        super.init( config );
        double count = 0;
        double avg=0;
        getServletContext().setAttribute( "counter", count );
        getServletContext().setAttribute( "avg", avg );
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String veryPoor= request.getParameter("veryPoor");
		String poor = request.getParameter("poor");
		String average = request.getParameter("average");
		String good = request.getParameter("good");
		String excellent = request.getParameter("excellent");
		HttpSession session=request.getSession();  
		ServletContext servletContext = getServletContext();
        double count = (Double) servletContext.getAttribute( "counter" );
        double avg = (Double) servletContext.getAttribute( "avg" );
		if(veryPoor!=null) {
			count++;
			avg+=1;
			servletContext.setAttribute( "counter", count );
			servletContext.setAttribute( "avg", avg );
			System.out.println("Rate :"+veryPoor);
		}
		else if(poor!=null) {
			avg += 2;
			count++;
			servletContext.setAttribute( "counter", count );
			servletContext.setAttribute( "avg", avg );
			System.out.println("Rate :"+poor);
		}
		else if(average!=null) {
			count++;
			avg+=3;
			servletContext.setAttribute( "counter", count );
			servletContext.setAttribute( "avg", avg );
			System.out.println("Rate :"+average);
		}
		else if(good!=null) {
			count++;
			avg+=4;
			servletContext.setAttribute( "counter", count );
			servletContext.setAttribute( "avg", avg );
			System.out.println("Rate :"+good);
		}
		else if(excellent!=null) {
			count++;
			avg+=5;
			servletContext.setAttribute( "counter", count );
			servletContext.setAttribute( "avg", avg );
			System.out.println("Rate :"+excellent);
		}
		
		PrintWriter writer = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
		rd.forward(request,response);
	}

}