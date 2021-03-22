
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet{ 
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)
  throws ServletException,IOException{

  response.setContentType("text/html");
  String filename = "/WEB-INF/versie.txt";
  ServletContext context = getServletContext();

  PrintWriter pw = response.getWriter();

/* Un-comment the code below to make the build break on Sonar */

/***
 *   String UseLess;
 *     if (true) {
 *       }  
 *
 *       ****/

  pw.println("<html>");
  pw.println("<head><title>Hello World</title></head>");

/* Choose a backgroundcolor The 17 standard colors are: aqua, black, blue, fuchsia, gray, green, lime, maroon, navy, olive, orange, purple, red, silver, teal, white, and yellow.
 * ******/

  pw.println("<body bgcolor='red'>");

/* Display the version of the servlet that has been deployed from a file*/

  InputStream inp = context.getResourceAsStream(filename);
  if (inp != null) {
      InputStreamReader isr = new InputStreamReader(inp);
      BufferedReader reader = new BufferedReader(isr);
      String text = "";
      while ((text = reader.readLine()) != null) {
              pw.println("<h2>version: "+text+"</h2>");     
      }
  }


  pw.println("<br><br><br><br><br>");
  pw.println("<h1 style='font-family:rockwell;color:white;font-size:96px;'><center>I started this company</center></h1>");
  pw.println("<br><br>");



  

  pw.println("</body></html>");

  }
}

