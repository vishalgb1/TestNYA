package com.vishal.byahatti;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewYorkAppRedirection
 */
public class NewYorkAppRedirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String StringBuffer = null;       
	private String defaultSite = new String("https://www.nytimes.com/section/");
    
    private void RedirectingLogic(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
    	String name = null;
    	String site = new String("https://www.nytimes.com/section/");
    	if(request.getParameter("value")!=null && request.getParameter("value").length() > 0)
    	{
    		name=request.getParameter("value");
   			site = site.concat(name);
   			//System.out.println(site);
    		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    		response.setHeader("Location", site);
    		
    	}
        
    }
    public String getSiteName(){
    	return defaultSite;
    }

    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RedirectingLogic(request, response);
		}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
		
		
	

}
