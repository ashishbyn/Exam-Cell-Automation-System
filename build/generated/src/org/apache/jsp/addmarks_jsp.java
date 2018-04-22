package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addmarks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("<meta charset=utf-8 />\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               background-color: pink;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                padding-left: 10%;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("        <form  action=\"Addm\" method=\"post\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <center>\t\n");
      out.write("            <label>Id</label>\n");
      out.write("            <input type=\"text\" name=\"id\"><br><br>\n");
      out.write("                                        <label>Semester:</label>\n");
      out.write("                 <select name=\"sem\">\n");
      out.write("                     <option>--Select--</option>\n");
      out.write("                                <option>Sem I</option>\n");
      out.write("                                <option>Sem II</option>\n");
      out.write("                                <option>Sem III</option>\n");
      out.write("                                <option>Sem IV</option>\n");
      out.write("                                <option>Sem V</option>\n");
      out.write("                                <option>Sem VI</option>\n");
      out.write("                                <option>Sem VII</option>\n");
      out.write("                                <option>Sem VIII</option>\n");
      out.write("                                \n");
      out.write("                            </select>     \n");
      out.write("                                        \n");
      out.write("            </center>\t\n");
      out.write("    \t\t\t\t\t\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t<br><br>\n");
      out.write("                <table border=1 align=\"center\" id=\"first\"   >\n");
      out.write("    \t\t\t<thead>\n");
      out.write("    \t\t\t\t<tr >\n");
      out.write(" \t   \t\t\t\t\t<th>Subject</th>\n");
      out.write(" \t   \t\t\t\t\t\n");
      out.write(" \t   \t\t\t\t\t<th>Sem Marks</th>\n");
      out.write("                                                \n");
      out.write("                                                <th>Prac Marks</th>\n");
      out.write("                                                \n");
      out.write("                                                <th>Credits</th>\n");
      out.write("                                                \n");
      out.write("                                               \n");
      out.write("                                                \n");
      out.write("                                                <th>Total</th>\n");
      out.write("                                                \n");
      out.write("                                                <th>Grade</th>\n");
      out.write("                                               \n");
      out.write("                                                <th>G*C</th>\n");
      out.write("                                                \n");
      out.write("    \t\t\t\t</tr>\n");
      out.write("    \t\t\t</thead>\n");
      out.write("                        <tbody >\n");
      out.write("                            <tr >\n");
      out.write("                                <td>  <select name=\"s1\"><option>Subject 1</option></select></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"m1\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"p1\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"c1\"></td>\n");
      out.write("                               \n");
      out.write("                                <td><input type=\"textbox\" name=\"t1\"  value=\"");
      out.print( request.getAttribute("t1"));
      out.write("\" ></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"g1\" value=\"");
      out.print( request.getAttribute("g1"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"cgpa1\" value=\"");
      out.print( request.getAttribute("cgpa1"));
      out.write("\"></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                           \n");
      out.write("                            <tr>\n");
      out.write("                                <td >  <select name=\"s2\"><option>Subject 2</option></select></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"m2\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"p2\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"c2\"></td>\n");
      out.write("                                \n");
      out.write("                                <td><input type=\"textbox\" name=\"t2\"  value=\"");
      out.print( request.getAttribute("t2"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"g2\" value=\"");
      out.print( request.getAttribute("g2"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"cgpa2\" value=\"");
      out.print( request.getAttribute("cgpa2"));
      out.write("\"></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr >\n");
      out.write("                                <td >  <select name=\"s3\"><option>Subject 3</option></select></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"m3\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"p3\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"c3\"></td>\n");
      out.write("                                \n");
      out.write("                                <td><input type=\"textbox\" name=\"t3\"  value=\"");
      out.print( request.getAttribute("t3"));
      out.write("\" ></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"g3\" value=\"");
      out.print( request.getAttribute("g3"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"cgpa3\" value=\"");
      out.print( request.getAttribute("cgpa3"));
      out.write("\"></td>\n");
      out.write("                           \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr >\n");
      out.write("                                <td >  <select name=\"s4\"><option>Subject 4</option></select></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"m4\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"p4\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"c4\"></td>\n");
      out.write("                               \n");
      out.write("                                <td><input type=\"textbox\" name=\"t4\"   value=\"");
      out.print( request.getAttribute("t4"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"g4\" value=\"");
      out.print( request.getAttribute("g4"));
      out.write("\"></td>\n");
      out.write("                                <td><input type=\"textbox\" name=\"cgpa4\" value=\"");
      out.print( request.getAttribute("cgpa4"));
      out.write("\"></td>\n");
      out.write("                           \n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("    \t\t</table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <center>\n");
      out.write("                    <button id=\"sum\" name=\"b1\">Calculate</button>\n");
      out.write("                   \n");
      out.write("                </center> \n");
      out.write("                \n");
      out.write("               \n");
      out.write("            \n");
      out.write("               \n");
      out.write("    \t\t\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
