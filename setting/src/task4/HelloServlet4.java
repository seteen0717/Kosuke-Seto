package task4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task3.HtmlTemplate;
@WebServlet("/HelloServlet4")
public class HelloServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");

		String[] array = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Random random = new Random();
		int i = random.nextInt(6);
		PrintWriter out = response.getWriter();

		HtmlTemplate.header(out);
		out.println("<p>↓占い結果↓</p>");
		out.println("<h1>" + array[i] + "</h1>");
		HtmlTemplate.footer(out);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
