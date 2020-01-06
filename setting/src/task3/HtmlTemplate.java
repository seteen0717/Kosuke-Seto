package task3;


public class HtmlTemplate {
	public static void header(java.io.PrintWriter out) {
		out.println("<!DOCTYPE html");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Servlet Kadai</title>");
		out.println("</head>");
		out.println("<body>");
	}
	public static void footer(java.io.PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}
