package com.edu.test;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h6>요청 헤더 정보</h6>");
		Enumeration<String> em=req.getHeaderNames();
		while(em.hasMoreElements()){
			String s=em.nextElement();
			out.println(s+" : "+req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

}
