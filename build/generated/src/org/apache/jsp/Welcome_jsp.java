package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <link class=\"jsbin\" href=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script class=\"jsbin\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\n");
      out.write("<script class=\"jsbin\" src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js\"></script>\n");
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
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("         <div class=\"container\">\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t<h1>Register</h1>\n");
      out.write("            \n");
      out.write("\t<form>\n");
      out.write("\t\t<label for=\"first\">First Name:</label>\n");
      out.write("\t\t<input name=\"first\" id=\"first\" type=\"text\" placeholder=\"first name\" required>\n");
      out.write("\t\t<label for=\"last\">Last Name:</label>\n");
      out.write("\t\t<input name=\"last\" id=\"last\" type=\"text\" placeholder=\"last name\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label for=\"male\">Male</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\">\n");
      out.write("\t\t\t<label for=\"female\">Female</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"female\" value=\"female\">\n");
      out.write("\t\t\t<label for=\"other\">Other</label>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"gender\" id=\"Other\" value=\"Other\">\n");
      out.write("\t\t</div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <input type='file' onchange=\"readURL(this);\" />\n");
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
      out.write("\t\t<label for=\"last\">Enter Password:\n");
      out.write("\t\t<input name=\"Password\" id=\"last\" type=\"password\" placeholder=\"Password\" require>\n");
      out.write("\t\t</label>\n");
      out.write("\t\t</div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label>\n");
      out.write("\t\t\t\tBirthday:\n");
      out.write("\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t<option>Date</option>\n");
      out.write("\t\t\t\t\t<option>1</option>\n");
      out.write("\t\t\t\t\t<option>2</option>\n");
      out.write("\t\t\t\t\t<option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("\t\t\t\t\t<option>5</option>\n");
      out.write("\t\t\t\t\t<option>6</option>\n");
      out.write("                                        <option>7</option>\n");
      out.write("\t\t\t\t\t<option>8</option>\n");
      out.write("\t\t\t\t\t<option>9</option>\n");
      out.write("                                        <option>10</option>\n");
      out.write("\t\t\t\t\t<option>11</option>\n");
      out.write("\t\t\t\t\t<option>12</option>\n");
      out.write("                                        <option>13</option>\n");
      out.write("\t\t\t\t\t<option>14</option>\n");
      out.write("\t\t\t\t\t<option>15</option>\n");
      out.write("                                        <option>16</option>\n");
      out.write("\t\t\t\t\t<option>17</option>\n");
      out.write("\t\t\t\t\t<option>18</option>\n");
      out.write("                                        <option>19</option>\n");
      out.write("\t\t\t\t\t<option>20</option>\n");
      out.write("\t\t\t\t\t<option>21</option>\n");
      out.write("                                        <option>22</option>\n");
      out.write("\t\t\t\t\t<option>23</option>\n");
      out.write("\t\t\t\t\t<option>24</option>\n");
      out.write("                                        <option>25</option>\n");
      out.write("\t\t\t\t\t<option>26</option>\n");
      out.write("\t\t\t\t\t<option>26</option>\n");
      out.write("                                        <option>28</option>\n");
      out.write("\t\t\t\t\t<option>29</option>\n");
      out.write("\t\t\t\t\t<option>30</option>\n");
      out.write("                                        <option>31</option>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t<option>Month</option>\n");
      out.write("\t\t\t\t\t<option>Jan</option>\n");
      out.write("\t\t\t\t\t<option>Feb</option>\n");
      out.write("\t\t\t\t\t<option>March</option>\n");
      out.write("                                        <option>April</option>\n");
      out.write("\t\t\t\t\t<option>May</option>\n");
      out.write("\t\t\t\t\t<option>June</option>\n");
      out.write("                                        <option>July</option>\n");
      out.write("\t\t\t\t\t<option>Aug</option>\n");
      out.write("\t\t\t\t\t<option>Sept</option>\n");
      out.write("                                        <option>Oct</option>\n");
      out.write("\t\t\t\t\t<option>Nov</option>\n");
      out.write("\t\t\t\t\t<option>Dec</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t<option>Year</option>\n");
      out.write("                                        <option>1991</option>\n");
      out.write("                                        <option>1992</option>\n");
      out.write("\t\t\t\t\t<option>1993</option>\n");
      out.write("\t\t\t\t\t<option>1994</option>\n");
      out.write("\t\t\t\t\t<option>1995</option>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<option>1996</option>\n");
      out.write("\t\t\t\t\t<option>1997</option>\n");
      out.write("\t\t\t\t\t<option>1998</option>\n");
      out.write("                                        <option>1999</option>\n");
      out.write("\t\t\t\t\t<option>2000</option>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</label>\n");
      out.write("\t\t</div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label for=\"agreed\">I agree to the terms and conditions</label>\n");
      out.write("\t\t\t<input id=\"agreed\" name=\"agreed\" type=\"checkbox\">\n");
      out.write("\t\t</div>\n");
      out.write("<br>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-2.2.4.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
