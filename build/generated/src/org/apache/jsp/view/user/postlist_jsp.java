package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>Data Tables</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"http://code.jquery.com/jquery-3.3.1.min.js\"\r\n");
      out.write("            integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\" ></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h2>Post List</h2>\r\n");
      out.write("            \r\n");
      out.write("            <button>Add New Post</button>\r\n");
      out.write("            \r\n");
      out.write("            <table class=\"table table-fluid\" id=\"myTable\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("                        <th>Title</th>\r\n");
      out.write("                        <th>Category</th>\r\n");
      out.write("                        <th>Author</th>\r\n");
      out.write("                        <th>Status</th>\r\n");
      out.write("                        <th>Action</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr><td>1</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button style=\"margin-left: 10px\">Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>2</td><td>InterNet</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button style=\"margin-left: 10px\">Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>3</td><td>Cartoon</td><td>Twitter</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>4</td><td>Cinema</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>5</td><td>sient</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>6</td><td>Coach</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>7</td><td>Kafy</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>8</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>9</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>10</td><td>Socalmedia</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>11</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>12</td><td>Socalmedia</td><td>Twitter</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>13</td><td>Socalmedia</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>14</td><td>Socalmedia</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>15</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>16</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>17</td><td>Socalmedia</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>18</td><td>Socalmedia</td><td>Facebook</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>19</td><td>Socalmedia</td><td>Twitter</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>20</td><td>Socalmedia</td><td>Telegram</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>21</td><td>Socalmedia</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>22</td><td>InterNet</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button style=\"margin-left: 10px\">Delete</button></td></tr>\r\n");
      out.write("                    <tr><td>23</td><td>InterNet</td><td>Insta</td><td>Taylor Swift</td><td>Draft</td><td><button>Edit</button><button style=\"margin-left: 10px\">Delete</button></td></tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#myTable').DataTable();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
