package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calender_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Super Admin</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/2.css\"/>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/fullcalendar.css\">\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"lib/jquery.min.js\"> </script>\r\n");
      out.write("    <script src=\"lib/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/fullcalendar.min.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("/*----------------------------edit buat mav----------------------------------------------*/\r\n");
      out.write("    function openSlideMenu(){\r\n");
      out.write("      document.getElementById('side-menu').style.width = '250px';\r\n");
      out.write("      document.getElementById('main').style.marginLeft = '250px';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function closeSlideMenu(){\r\n");
      out.write("      document.getElementById('side-menu').style.width = '0';\r\n");
      out.write("      document.getElementById('main').style.marginLeft = '0';\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("/*-------------------------Membuat modal Pop Up-----------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("\tfunction openo()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"block\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction opena()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"block\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction tutup()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"none\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction tutup2()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"none\"\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("/*--------------------------------scrip calendar----------------------------------------*/\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#calendar').fullCalendar({\r\n");
      out.write("\t\t\theader: {\r\n");
      out.write("\t\t\t\tleft: 'prev,next today',\r\n");
      out.write("\t\t\t\tcenter: 'title',\r\n");
      out.write("\t\t\t\tright: 'month,agendaWeek,agendaDay,listWeek'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdefaultDate: '2017-09-12',\r\n");
      out.write("\t\t\tnavLinks: true, // can click day/week names to navigate views\r\n");
      out.write("\t\t\teditable: true,\r\n");
      out.write("\t\t\teventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("\t\t\tevents: [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'All Day Event',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-01',\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Long Event',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-07',\r\n");
      out.write("\t\t\t\t\tend: '2017-09-10'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tid: 999,\r\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-09T16:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tid: 999,\r\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-16T16:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Conference',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-11',\r\n");
      out.write("\t\t\t\t\tend: '2017-09-13'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T10:30:00',\r\n");
      out.write("\t\t\t\t\tend: '2017-09-12T12:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Lunch',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T12:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T14:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Happy Hour',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T17:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Dinner',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T20:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Birthday Party',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-13T07:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Click for Google',\r\n");
      out.write("\t\t\t\t\turl: 'http://google.com/',\r\n");
      out.write("\t\t\t\t\tstart: '2017-09-28'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <style>\r\n");
      out.write("      body\r\n");
      out.write("      {\r\n");
      out.write("        margin: 40px 10px;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        font-family: \"Lucida Grande\",Helvetica, Arial, Verdana,sans-serif;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        background-color: cyan;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #calendar\r\n");
      out.write("      {\r\n");
      out.write("          width: 50%;\r\n");
      out.write("          height: 20%;\r\n");
      out.write("          margin-top: auto;\r\n");
      out.write("          margin-left: auto;\r\n");
      out.write("          margin-right: auto;\r\n");
      out.write("          margin-bottom: 10%;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"navbar\">\r\n");
      out.write("    <span class=\"open-slide\">\r\n");
      out.write("      <a href=\"#\" onclick=\"openSlideMenu()\">\r\n");
      out.write("        <svg width=\"30\" height=\"30\">\r\n");
      out.write("            <path d=\"M0,5 30,5\" stroke=\"#fff\"stroke-width=\"5\"/>\r\n");
      out.write("            <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("            <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("      </a>\r\n");
      out.write("    </span>\r\n");
      out.write("    <ul id=\"dropdown\">\r\n");
      out.write("    \t<li><a href=\"../logout\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a class=\"selected\" href=\"calender.jsp\">Calendar</a>                                                                                   \r\n");
      out.write("    <a href=\"DataPlace.jsp\">Manage Place</a>\r\n");
      out.write("    <a href=\"distance.jsp\">Manage Distance</a>\r\n");
      out.write("    <a href=\"time.jsp\">Manage Time</a>\r\n");
      out.write("    <a href=\"transportation.jsp\">Manage Transpotation</a>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("\t  <div id=\"main\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("                            Calendar\r\n");
      out.write("                                <div id=\"calendar\">\r\n");
      out.write("                      \r\n");
      out.write("                                </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("           <div class=\"tex\">\r\n");
      out.write("               <p>\r\n");
      out.write("                   \r\n");
      out.write("               </p>\r\n");
      out.write("           </div>\r\n");
      out.write("\t\t</div>      \r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"confirm\" class=\"confirm2\">\r\n");
      out.write("\t<div class=\"confirm-content\">\r\n");
      out.write("    <span onClick=\"tutup()\" class=\"exit\" >&times;</span>\r\n");
      out.write("    \t<div class=\"form\">\r\n");
      out.write("        \t<label style=\"font-weight:bold\">\r\n");
      out.write("            \t<a>Edit Place</a>\r\n");
      out.write("            </label>\r\n");
      out.write("    \t\t<input type=\"text\" placeholder=\"Enter New Place\" name=\"#\" required>\r\n");
      out.write("            <button type=\"submit\" onClick=\"tutup()\" name=\"#\">Update Data</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"ask\" class=\"confirm2\">\r\n");
      out.write("\t<div class=\"ask-content\">\r\n");
      out.write("    \t<span onClick=\"tutup2()\" class=\"exit\" >&times;</span>\r\n");
      out.write("        <div class=\"ask\">\r\n");
      out.write("            <label style=\"font-weight:bold\">\r\n");
      out.write("                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <button onClick=\"tutup2()\" class=\"b1\" type=\"submit\" name=\"#\">NO</button>  <button onClick=\"tutup2()\" class=\"b2\" type=\"submit\" name=\"#\">YES </button>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
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
