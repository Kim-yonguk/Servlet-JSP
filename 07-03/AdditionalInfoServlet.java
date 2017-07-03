package com.edu.test;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;

@WebServlet("/addInfo")

public class AdditionalInfoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request ������� Servlet</title></head>");
		out.print("<body>");
		out.print("<h6>�߰����� ��û ����</h6>");
		out.print("Request Method : " +req.getMethod()+"<br/>");
		out.print("Path info : " +req.getPathInfo()+"<br/>");
		out.print("Path Translated : " +req.getMethod()+"<br/>");
		out.print("Query String : " +req.getQueryString()+"<br/>");
		out.print("Content Length : " +req.getContentLength()+"<br/>");
		out.print("Content Type : " +req.getContentType()+"<br/>");
		out.print("</body></html>");
		out.close();
	}
}