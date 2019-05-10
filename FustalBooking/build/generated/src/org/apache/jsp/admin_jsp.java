package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.User;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.adminprofile == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
 response.sendRedirect(request.getContextPath() + "/adminSessionTerminate.jsp"); 
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\n');
      out.write('\n');
      Bean.User adminprofile = null;
      synchronized (session) {
        adminprofile = (Bean.User) _jspx_page_context.getAttribute("adminprofile", PageContext.SESSION_SCOPE);
        if (adminprofile == null){
          adminprofile = new Bean.User();
          _jspx_page_context.setAttribute("adminprofile", adminprofile, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>HOME - ADMIN</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"landing\">\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerAdmin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<!-- Banner -->\n");
      out.write("\t\t\t\t<section id=\"banner\">\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>- WELCOME - <br>\n");
      out.write("\t\t\t\t\t\t\tARE YOU READY? <br>\n");
      out.write("\t\t\t\t\t\t\t- LET'S GET STARTED -</h2><br>\n");
      out.write("\t\t\t\t\t\t\tHere we provide some features for you as listed below.\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<a href=\"#two\" class=\"goto-next scrolly\">Next</a>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Two -->\n");
      out.write("\t\t\t\t<section id=\"two\" class=\"spotlight style2 right\">\n");
      out.write("\t\t\t\t\t<span class=\"image fit main\"><img src=\"images/profile.png\" alt=\"\" /></span>\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>PROFILE</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>With this features, each admin can view and edit their profile easily.</p>\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<ul class=\"actions\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewprofileadmin.jsp\" class=\"button\">Click Here</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<a href=\"#three\" class=\"goto-next scrolly\">Next</a>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Three -->\n");
      out.write("\t\t\t\t<section id=\"three\" class=\"spotlight style3 left\">\n");
      out.write("\t\t\t\t\t<span class=\"image fit main bottom\"><img src=\"images/801185742_565.jpg\" alt=\"\" /></span>\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>MANAGE COURT</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>With this features, admin can add, manage, and view booking of the courts. </p>\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t<ul class=\"actions\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"button\">Click Here</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</section>\n");
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
      out.write("\t\t\t\t\t\t<li>&copy; Untitled. All rights reserved.</li><li>Design: JEMAH'S</li>\n");
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
