/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-21 04:43:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GetFormData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"keywords\" content=\"simple jquery validation html form\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>JSP and Servlet ITMD566 Assignment 2</title>\r\n");
      out.write("<style>\r\n");
      out.write("*{\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("}\r\n");
      out.write("#content { background-color:#f9f9f9; padding:20px;  }\r\n");
      out.write("h1 {\r\n");
      out.write("   font-family:\"Palatino Linotype\", \"Book Antiqua\", Palatino, serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("    background-color: #00a2d1;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("#header a\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\tfont-size:35px;\r\n");
      out.write("\tfont-family:Tahoma, Geneva, sans-serif;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#register-form {\r\n");
      out.write("\tbackground:#fff;\r\n");
      out.write("    border: 1px solid #DFDCDC;\r\n");
      out.write("    border-radius: 15px 15px 15px 15px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    padding: 25px 50px 10px;\r\n");
      out.write("    width: 350px;\r\n");
      out.write("\tfont-family:Tahoma, Geneva, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#register-form .fieldgroup {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 8px 10px;\r\n");
      out.write("    width: 340px;\r\n");
      out.write("}\r\n");
      out.write("fieldset{\tborder:none; }\r\n");
      out.write("\r\n");
      out.write("#register-form .fieldgroup input{\r\n");
      out.write("    margin: 10px 0;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tborder:solid #cdcdcd 1px;\r\n");
      out.write("\tborder-radius:3px;\r\n");
      out.write("\tpadding-left:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#register-form .submit {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    height: 40px !important;\r\n");
      out.write("\tbackground:#00a2d1;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\tfont-weight:bolder;\r\n");
      out.write("\tborder:solid #cdcdcd 1px;\r\n");
      out.write("\tborder-radius:3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#register-form .fieldgroup label.error {\r\n");
      out.write("    color: #FB3A3A;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-weight:500;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("       $('document').ready(function()\r\n");
      out.write("\t   { \r\n");
      out.write("            $(\"#register-form\").validate({\r\n");
      out.write("                rules: {\r\n");
      out.write("                    firstname: \"required\",\r\n");
      out.write("                    lastname: \"required\",\r\n");
      out.write("                    email: {\r\n");
      out.write("                        required: true,\r\n");
      out.write("                        email: true\r\n");
      out.write("                    },\r\n");
      out.write("                    password: {\r\n");
      out.write("                        required: true,\r\n");
      out.write("                        minlength: 8\r\n");
      out.write("                    },\r\n");
      out.write("                },\r\n");
      out.write("                messages: {\r\n");
      out.write("                    firstname: \"Please enter your firstname\",\r\n");
      out.write("                    lastname: \"Please enter your lastname\",\r\n");
      out.write("                    password: {\r\n");
      out.write("                        required: \"Please provide a password\",\r\n");
      out.write("                        minlength: \"Password at least have 8 characters\"\r\n");
      out.write("                    },\r\n");
      out.write("                    email: \"Please enter a valid email address\"\r\n");
      out.write("                },\r\n");
      out.write("                submitHandler: function(form) {\r\n");
      out.write("                    form.submit();\r\n");
      out.write("                }\r\n");
      out.write("            });  \r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<div id=\"page-wrap\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("        <a href=\"#\">Assignment 2</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"/login\" method=\"post\" id=\"register-form\">\r\n");
      out.write("    <div id=\"form-content\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Customer Name\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write("                <input type=\"text\" name=\"SSN\" placeholder=\"SSN\" required maxlength=\"11\" minlength=\"11\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"fieldgroup\">\r\n");
      out.write("\t\t\t\t<input type=\"number\" name=\"zipCode\" placeholder=\"6-digit Zip Code\" required   />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write(" \t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Your E-mail ID\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write("               <input type=\"text\" name=\"address\" placeholder=\"Street Address\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"fieldgroup\">\r\n");
      out.write("               <input type=\"text\" name=\"city\" placeholder=\"City\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write("            \t\r\n");
      out.write("    \t\t<label for=\"state\">State</label>\r\n");
      out.write("    \t\t\t<select id=\"state\" name=\"state\">\r\n");
      out.write("\t\t\t      <option value=\"AL\">AL</option>\r\n");
      out.write("\t\t\t      <option value=\"AK\">AK</option>\r\n");
      out.write("\t\t\t      <option value=\"AZ\">AZ</option>\r\n");
      out.write("\t\t\t      <option value=\"DC\">DC</option>\r\n");
      out.write("\t\t\t      <option value=\"MA\">MA</option>\r\n");
      out.write("\t\t\t      <option value=\"IN\">IN</option>\r\n");
      out.write("\t\t\t      <option value=\"IL\">IL</option>\r\n");
      out.write("    \t\t</select>\r\n");
      out.write("           </div>         \r\n");
      out.write("            \r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"fieldgroup\">\r\n");
      out.write("                <input type=\"submit\" value=\"Sign UP\" class=\"submit\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
