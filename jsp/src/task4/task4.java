package task4;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task3.FortuneBean;

@WebServlet("/task4")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date today = new Date();
		String[] fortune = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Random random = new Random();
		int i = random.nextInt(6);
		FortuneBean fortuneBean = new FortuneBean();
		fortuneBean.setToday(today);
		fortuneBean.setFortune(fortune[i]);
		request.setAttribute("FORTUNE",fortuneBean);

		request.getRequestDispatcher("/WEB-INF/jsp/fortune_result.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
