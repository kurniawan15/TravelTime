package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAOKota;
import model.Kota;
import DAO.DAOProvinsi;
import model.Provinsi;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;

public final class kota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Super Admin</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
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
      out.write("    \t<li><a href=\"../logout.jsp\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"#\" >Jarak</a>\r\n");
      out.write("    <a class=\"selected\" href=\"#\">Kota</a>\r\n");
      out.write("    <a href=\"#\" >Lokasi</a>\r\n");
      out.write("    <a href=\"#\" >Provinsi</a>\r\n");
      out.write("    <a href=\"#\" >Perjalanan</a>\r\n");
      out.write("    <a href=\"#\" >Moda Trasportasi</a>\r\n");
      out.write("    <a href=\"#\" >Transportasi Pribadi</a>\r\n");
      out.write("    <a href=\"#\" >Transportasi Umum</a>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("    <div id=\"main\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t<div class=\"widget\">\r\n");
      out.write("            <div class=\"title\">Data Kota</div>\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>NO</th>\r\n");
      out.write("                        <th>Kode Kota</th>\r\n");
      out.write("                        <th>Id Provinsi</th>\r\n");
      out.write("                        <th>Kota</th>\r\n");
      out.write("                        <th>ket</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                      DAOKota kt = new DAOKota();
                      List<Kota> data = new ArrayList<Kota>();
                      String ket = request.getParameter("ket");
                      if (ket == null) {
                          data = kt.tampil();
                      } 
                      for (int x = 0; x < data.size(); x++) {
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(data.get(x).getIdKota());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(data.get(x).getIdProvinsi());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(data.get(x).getNamaKota());
      out.write("</td>\r\n");
      out.write("                        <td> <a href=\"../../provinsi?proses=edit-provinsi&id_provinsi=");
      out.print(data.get(x).getIdProvinsi());
      out.write("\"><input type=\"submit\" class=\"button1\" value=\"Edit\"></a>\r\n");
      out.write("                            <input type=\"submit\" class=\"button2\" onClick=\"opena()\" value=\"Hapus\" ></a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 
                    }
              
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            \r\n");
      out.write("\t</div>\r\n");
      out.write("        <div class=\"widget\">\r\n");
      out.write("        <div class=\"title\">Tambah Kota</div>\r\n");
      out.write("        <div class=\"imput\">\r\n");
      out.write("            <form action=\"../../kota?data=kota&proses=input-kota\" method=\"post\">\r\n");
      out.write("                Kode Provinsi\r\n");
      out.write("                <select class=\"pilih_kota\">\r\n");
      out.write("                 ");

                    DAOProvinsi dpro = new DAOProvinsi();
                    List<Provinsi> pro = new ArrayList<Provinsi>();
                    pro = dpro.tampil();
                    for (Provinsi p : pro) {
                    
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(p.getIdProvinsi());
      out.write('"');
      out.write('>');
      out.print(p.getNamaProvinsi());
      out.write("</option>\r\n");
      out.write("                ");
 
                       }
                
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                Nama Kota\r\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Nama Kota\" name=\"nama_kota\" required>\r\n");
      out.write("                <button type=\"submit\" name=\"Tambah\">Update Data</button>  \r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("  <script>\r\n");
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
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
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