package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>      \n");
      out.write("\n");
      out.write("<meta charset=utf-8 />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               background-color: pink;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                padding-left: 10%;\n");
      out.write("                padding-top: 7%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            {\n");
      out.write("                function readURL(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('#blah')\n");
      out.write("                    .attr('src', e.target.result)\n");
      out.write("                    .width(150)\n");
      out.write("                    .height(200);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form action=\"Register\" method=\"post\">\n");
      out.write("       \n");
      out.write("         <div class=\"container\">\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t<h1>Register</h1>\n");
      out.write("            \n");
      out.write("\t \n");
      out.write("             \n");
      out.write("\t\t<label for=\"first\">First Name:</label>\n");
      out.write("\t\t<input name=\"first\" id=\"first\" type=\"text\" placeholder=\"first name\" required>\n");
      out.write("\t\t<label for=\"last\">Last Name:</label>\n");
      out.write("\t\t<input name=\"last\" id=\"last\" type=\"text\" placeholder=\"last name\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label for=\"male\">Male</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\" required>\n");
      out.write("\t\t\t<label for=\"female\">Female</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"female\" value=\"female\" required>\n");
      out.write("\t\t\t<label for=\"other\">Other</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"Other\" value=\"Other\" required>\n");
      out.write("\t\t</div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <input type='file' name=\"image\" onchange=\"readURL(this);\"/>\n");
      out.write("                 <img id=\"blah\" src=\"#\" alt=\"Your Image\"/>\n");
      out.write("                \n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t<label for=\"first\">Enter Your Email:\n");
      out.write("\t\t<input name=\"E-mail\" id=\"first\" type=\"email\" placeholder=\"Your email\" required>\n");
      out.write("\t\t</label>\n");
      out.write("                    <br>\n");
      out.write("                <br>\n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("\n");
      out.write("\t\t<div>\t\t\n");
      out.write("                      <label >Date Of Birth(YYYY/MM/DD):\n");
      out.write("\t\t<input name=\"date\"  type=\"text\" placeholder=\"Enter Birthday Date\" required>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</label>\n");
      out.write("\t\t</div>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("\n");
      out.write(" <label>Semester:</label>\n");
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
      out.write("                            </select>                \n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label for=\"agreed\">I agree to the terms and conditions</label>\n");
      out.write("\t\t\t<input id=\"agreed\" name=\"agreed\" type=\"checkbox\" required>\n");
      out.write("\t\t</div>\n");
      out.write("<br>\n");
      out.write("                \n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Submit\" name=\"submit\">\n");
      out.write("\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-2.2.4.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
