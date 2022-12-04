package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"login-left\">\r\n");
      out.write("                <div class=\"login-header\">\r\n");
      out.write("                    <div class=\"anh\">\r\n");
      out.write("                    <img src=\"../../img/f8.jpg\" alt=\"\" height=\"50px\"\" />\r\n");
      out.write("                    <img src=\"img/f8.jpg\" alt=\"\" height=\"50px\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h1>Đăng nhập vào F8</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form class=\"login-form\" method=\"post\" action=\"login\">\r\n");
      out.write("                    <div class=\"login-form-content\">\r\n");
      out.write("                        <div class=\"form-item\">\r\n");
      out.write("                            <label for=\"email\">Enter email</label>\r\n");
      out.write("                            <input type=\"email\" id=\"inputEmail\" name=\"inputEmail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-item\">\r\n");
      out.write("                            <label for=\"password\">Enter password</label>\r\n");
      out.write("                            <input type=\"password\" id=\"inputPassword\" name=\"inputPassword\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-item\">\r\n");
      out.write("                        <button type=\"submit\">Sign In</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                <a target=\"_blank\" href=\"registercontroller \">\r\n");
      out.write("                    Bạn chưa có tài khoản? Đăng kí.\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"anh1\">\r\n");
      out.write("                <p>Việc bạn tiếp tục sử dụng trang web này đồng nghĩa với bạn đồng ý với điều khoản sử dụng của chúng tôi.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("<!--            <div class=\"login-form-deep\">\r\n");
      out.write("                \r\n");
      out.write("            </div>-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
