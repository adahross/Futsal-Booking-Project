package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tLanded by HTML5 UP\n");
      out.write("\thtml5up.net | @ajlkn\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Login Form</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a href=\"index.html\">Futsal Court Booking System</a></h1>\n");
      out.write("\t\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Signin.jsp\" class=\"button special\">Sign In</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Signup.jsp\" class=\"button special\">Sign Up</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Main -->\n");
      out.write("\t\t\t\t<div id=\"main\" class=\"wrapper style1_1\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t<header class=\"major\">\n");
      out.write("\t\t\t\t\t\t\t<h2>LOG IN FORM</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Please enter the required field.</p>\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Content -->\n");
      out.write("\t\t\t\t\t\t\t<section id=\"content\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<form method=\"post\" action=\"LoginUserServlet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  align=\"center\"  class=\"row uniform 50%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"6u -3u\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"name\" value=\"\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row uniform 50%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"6u -3u\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"name\" value=\"\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row uniform 50%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"12u\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Log In\" class=\"special\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Footer -->\n");
      out.write("\t\t\t\t<footer id=\"footer\">\n");
      out.write("\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span class=\"label\">LinkedIn</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-github\"><span class=\"label\">GitHub</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-envelope\"><span class=\"label\">Email</span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.dropotron.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
