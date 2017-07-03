package com.edu.test;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/netInfo")

public class NetinfoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request ���� ��� servlet</title></head>");
		out.print("<body>");
		out.print("<h3>��Ʈ��ũ ���� ��û ����</h3>");
		out.print("Request Schema : " + req.getScheme() + "<br/>");
		out.print("Server Name : " + req.getServerName() + "<br/>");
		out.print("Server Address : " + req.getLocalAddr() + "<br/>");
		out.print("Server Port : " + req.getServerPort() + "<br/>");
		out.print("Client Address : " + req.getRemoteAddr() + "<br/>");
		out.print("Client Host : " + req.getRemoteHost() + "<br/>");
		out.print("Client Port : " + req.getRemotePort() + "<br/>");
		out.print("</body></html>");
		out.close();
	}

}
