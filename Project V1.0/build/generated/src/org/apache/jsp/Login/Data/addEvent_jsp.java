package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.NewEvent;
import model.NewLokasi;
import model.NewModaPerjalanan;
import model.NewModaTransit;
import model.NewTransportasiTerjadwal;
import model.NewTransportasiTidakTerjadwal;
import DAO.DAONewEvent;
import DAO.DAONewLokasi;
import DAO.DAONewModaTransit;
import DAO.DAONewTransportasiTerjadwal;
import DAO.DAONewTransportasiTidakTerjadwal;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t<title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&libraries=places\"></script>\r\n");
      out.write("        \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 header\">\r\n");
      out.write("\t\t<div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t<center><img class=\"img-responsive\" src=\"img/logo1.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\r\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-bell\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\r\n");
      out.write("\t\t\tFajar&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage\">\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-5 col-sm-12 col-xs-12 leftpage\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"none\">Dashboard</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"none\">My Calendar</li>\r\n");
      out.write("\t\t\t\t\t<a href=\"addEvent.jsp\"><li class=\"none\">Add Event</li></a> \r\n");
      out.write("\t\t\t\t\t<a href=\"mylist.jsp\"><li class=\"none\">My Event</li></a>\r\n");
      out.write("\t\t\t\t\t<li class=\"none\">History</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent\">\r\n");
      out.write("\t\t\t<article class=\"article\">                               \r\n");
      out.write("  \t\t\t<br><br>\r\n");
      out.write("  \t\t\t<h1 class=\"judul\">Create Event</h1>\r\n");
      out.write(" \t\t\t \r\n");
      out.write("  \t\r\n");
      out.write("    <!--____________________________Form Inputan Nama Event____________________________-->\r\n");
      out.write("\t\t\t    <div class=\"namaevent\">\r\n");
      out.write("\t\t\t      <h1 class=\"hnamaevent\">Event Name :</h1>\r\n");
      out.write("\t\t\t      <input type=\"text\" id=\"fname\" name=\"nama_event\" placeholder=\"Input Event Name\">\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"keteranganevent\">\r\n");
      out.write("\t\t\t      <h1 class=\"hketevent\">Event Description :</h1>\r\n");
      out.write("\t\t\t      <input type=\"text\" id=\"fname\" name=\"keterangan\" placeholder=\"Input Event Description\">\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <!--____________________________Form Inputan Waktu Event____________________________-->\r\n");
      out.write("\t\t\t    <div class=\"waktu\">\r\n");
      out.write("\t\t\t      <h1 class=\"hwaktu\">Event Time :</h1>\r\n");
      out.write("\t\t\t      <!--____________________________Form input waktu awal____________________________-->\r\n");
      out.write("\t\t\t      <input type=\"datetime-local\" name=\"waktu_mulai\" placeholder=\"start time\"> <i style=\"color: black;\">&nbsp;until&nbsp;</i>\r\n");
      out.write("\t\t\t      <!--____________________________Form input waktu akhir--> \r\n");
      out.write("\t\t\t      <input type=\"datetime-local\" name=\"waktu_selesai\" placeholder=\"End time\">   \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Awal____________________________-->\r\n");
      out.write("\t\t\t    <div class=\"LokasiAwal\">\r\n");
      out.write("\t\t\t      <div id=\"calculate-route\" name=\"calculate-route\" action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t            <h1 class=\"hlokasiawal\">Start Location :</h1>\r\n");
      out.write("\t\t\t            <input type=\"text\" id=\"txtSource\" placeholder=\"Input First Location\" size=\"30\" style=\"width: 85%;\" />\r\n");
      out.write("                                   \r\n");
      out.write("\t\t\t            <input type=\"submit\" id=\"from-link\" value=\"Now\" style=\"width: 14%;\" />\r\n");
      out.write("\t\t\t            <div class=\"LokasiAkhir\">\r\n");
      out.write("\t\t\t                <h1 class=\"hlokasiakhir\">End Location :</h1>\r\n");
      out.write("\t\t\t                <input type=\"text\" id=\"txtDestination\" placeholder=\"Input Last Location\" size=\"30\" style=\"width: 85%;\" />\r\n");
      out.write("                                        \r\n");
      out.write("                                        <input type=\"button\" value=\"Get Route\" style=\"width: 14%;\" onclick=\"GetRoute()\"/>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t            \r\n");
      out.write("\t\t\t      </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction openCity(evt, cityName) {\r\n");
      out.write("\t\t\t\t  var i, tabcontent, tablinks; //deklarasi variabel\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  document.getElementById(\"tipe_moda\").value = cityName;\r\n");
      out.write("\t\t\t\t  //mengambil element yang ada di class tabcontent dan menyembunyikan class \r\n");
      out.write("\t\t\t\t  tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("\t\t\t\t  for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("\t\t\t\t      tabcontent[i].style.display = \"none\";\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  //mengambil element yang ada di class tablinks dan menghapus yg aktif di display\r\n");
      out.write("\t\t\t\t  tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("\t\t\t\t  for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("\t\t\t\t      tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\r\n");
      out.write("\t\t\t\t  document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("\t\t\t\t  evt.currentTarget.className += \" active\";\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("                                  //--------------------------------------------------Bagian Google API----------------------------------------------------------------\r\n");
      out.write("\t\t\t\tvar source, destination;\r\n");
      out.write("        var directionsDisplay;\r\n");
      out.write("        var directionsService = new google.maps.DirectionsService();\r\n");
      out.write("        google.maps.event.addDomListener(window, 'load', function () {\r\n");
      out.write("            new google.maps.places.SearchBox(document.getElementById('txtSource'));\r\n");
      out.write("            new google.maps.places.SearchBox(document.getElementById('txtDestination'));\r\n");
      out.write("            directionsDisplay = new google.maps.DirectionsRenderer({ 'draggable': true });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function GetRoute() {\r\n");
      out.write("            var mumbai = new google.maps.LatLng(18.9750, 72.8258);\r\n");
      out.write("            var mapOptions = {\r\n");
      out.write("                zoom: 7,\r\n");
      out.write("                center: mumbai\r\n");
      out.write("            };\r\n");
      out.write("            map = new google.maps.Map(document.getElementById('dvMap'), mapOptions);\r\n");
      out.write("            directionsDisplay.setMap(map);\r\n");
      out.write("            directionsDisplay.setPanel(document.getElementById('dvPanel'));\r\n");
      out.write("\r\n");
      out.write("            //*********DIRECTIONS AND ROUTE**********************//\r\n");
      out.write("            source = document.getElementById(\"txtSource\").value;\r\n");
      out.write("            destination = document.getElementById(\"txtDestination\").value;\r\n");
      out.write("\r\n");
      out.write("            var request = {\r\n");
      out.write("                origin: source,\r\n");
      out.write("                destination: destination,\r\n");
      out.write("                travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("            };\r\n");
      out.write("            directionsService.route(request, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DirectionsStatus.OK) {\r\n");
      out.write("                    directionsDisplay.setDirections(response);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //*********DISTANCE AND DURATION WALKING**********************//\r\n");
      out.write("            var service = new google.maps.DistanceMatrixService();\r\n");
      out.write("            service.getDistanceMatrix({\r\n");
      out.write("                origins: [source],\r\n");
      out.write("                destinations: [destination],\r\n");
      out.write("                travelMode: google.maps.TravelMode.WALKING,\r\n");
      out.write("                unitSystem: google.maps.UnitSystem.METRIC,\r\n");
      out.write("                avoidHighways: false,\r\n");
      out.write("                avoidTolls: false\r\n");
      out.write("            }, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != \"ZERO_RESULTS\") {\r\n");
      out.write("                    var distance = response.rows[0].elements[0].distance.text;\r\n");
      out.write("                    var duration = response.rows[0].elements[0].duration.text;\r\n");
      out.write("                    var dvDistance = document.getElementById(\"dvDistance\");\r\n");
      out.write("                    var dvDuration = document.getElementById(\"dvDuration\");\r\n");
      out.write("                    dvDistance.innerHTML = \"\";\r\n");
      out.write("                    dvDistance.innerHTML += distance;\r\n");
      out.write("                    dvDuration.innerHTML += duration;\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"Unable to find the distance via road.\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //*********DISTANCE AND DURATION DRIVING**********************//\r\n");
      out.write("            service.getDistanceMatrix({\r\n");
      out.write("                origins: [source],\r\n");
      out.write("                destinations: [destination],\r\n");
      out.write("                travelMode: google.maps.TravelMode.DRIVING,\r\n");
      out.write("                unitSystem: google.maps.UnitSystem.METRIC,\r\n");
      out.write("                avoidHighways: false,\r\n");
      out.write("                avoidTolls: false\r\n");
      out.write("            }, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != \"ZERO_RESULTS\") {\r\n");
      out.write("                    var distance = response.rows[0].elements[0].distance.text;\r\n");
      out.write("                    var duration = response.rows[0].elements[0].duration.text;\r\n");
      out.write("                    var dvDistance = document.getElementById(\"dvDistance1\");\r\n");
      out.write("                    var dvDuration = document.getElementById(\"dvDuration1\");\r\n");
      out.write("                    dvDistance1.innerHTML = \"\";\r\n");
      out.write("                    dvDistance1.innerHTML += distance;\r\n");
      out.write("                    dvDuration1.innerHTML += duration;\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"Unable to find the distance via road.\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //*********DISTANCE AND DURATION BUS**********************//\r\n");
      out.write("            service.getDistanceMatrix({\r\n");
      out.write("                origins: [source],\r\n");
      out.write("                destinations: [destination],\r\n");
      out.write("                travelMode: google.maps.TravelMode.TRANSIT,\r\n");
      out.write("                    transitOptions: {\r\n");
      out.write("                    modes: ['BUS']\r\n");
      out.write("                  },\r\n");
      out.write("                unitSystem: google.maps.UnitSystem.METRIC,\r\n");
      out.write("                avoidHighways: false,\r\n");
      out.write("                avoidTolls: false\r\n");
      out.write("            }, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != \"ZERO_RESULTS\") {\r\n");
      out.write("                    var distance = response.rows[0].elements[0].distance.text;\r\n");
      out.write("                    var duration = response.rows[0].elements[0].duration.text;\r\n");
      out.write("                    var dvDistance = document.getElementById(\"dvDistance2\");\r\n");
      out.write("                    var dvDuration = document.getElementById(\"dvDuration2\");\r\n");
      out.write("                    dvDistance2.innerHTML = \"\";\r\n");
      out.write("                    dvDistance2.innerHTML += distance;\r\n");
      out.write("                    dvDuration2.innerHTML += duration;\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"Unable to find the distance via road.\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //*********DISTANCE AND DURATION RAIL**********************//\r\n");
      out.write("            service.getDistanceMatrix({\r\n");
      out.write("                origins: [source],\r\n");
      out.write("                destinations: [destination],\r\n");
      out.write("                travelMode: google.maps.TravelMode.TRANSIT,\r\n");
      out.write("                    transitOptions: {\r\n");
      out.write("                    modes: ['RAIL']\r\n");
      out.write("                  },\r\n");
      out.write("                unitSystem: google.maps.UnitSystem.METRIC,\r\n");
      out.write("                avoidHighways: false,\r\n");
      out.write("                avoidTolls: false\r\n");
      out.write("            }, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != \"ZERO_RESULTS\") {\r\n");
      out.write("                    var distance = response.rows[0].elements[0].distance.text;\r\n");
      out.write("                    var duration = response.rows[0].elements[0].duration.text;\r\n");
      out.write("                    var dvDistance = document.getElementById(\"dvDistance3\");\r\n");
      out.write("                    var dvDuration = document.getElementById(\"dvDuration3\");\r\n");
      out.write("                    dvDistance3.innerHTML = \"\";\r\n");
      out.write("                    dvDistance3.innerHTML += distance;\r\n");
      out.write("                    dvDuration3.innerHTML += duration;\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"Unable to find the distance via road.\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\t\t</script>\t\r\n");
      out.write("        <!--____________________________Tombol Submit or cancel____________________________--> \r\n");
      out.write("\t\t      <div class=\"col-12 enter\">\r\n");
      out.write("\t\t        <br>\r\n");
      out.write("\t\t        <input type=\"submit\" value=\"?\" style=\"background-color: green; width: 15%; float: right; margin-bottom: 20px;\">\r\n");
      out.write("\t\t        <input type=\"submit\" value=\"?\" style=\"background-color: red; width: 15%; margin-bottom: 20px; float: right;\">\r\n");
      out.write("\t\t        <br>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-7 col-sm-12 col-xs-12 rightpage\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil\">\r\n");
      out.write("                            <div id=\"dvMap\" style=\"width: 500px; height: 280px; margin-top:10px;\" ></div>\r\n");
      out.write("                            \r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 tablepilih\">\r\n");
      out.write("\t        <table class=\"table\" id=\"TabelFilter\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <th>Choose</th>\r\n");
      out.write("\t                <th>Transport</th>\r\n");
      out.write("\t                <th>Distance (KM) </th>\r\n");
      out.write("\t                <th>Estimated Time (Minutes)</th>\r\n");
      out.write("\t                <th>Departure Time</th>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">directions_walk</i> Walk</td>\r\n");
      out.write("                        <td title=\"Location\"><div id=\"dvDistance\"></div></td>\r\n");
      out.write("                        <td title=\"Ibu Kota\"><div id=\"dvDuration\"></div></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">directions_bike</i> Motorcycle</td>\r\n");
      out.write("\t                <td title=\"Location\"></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\"></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">directions_car</i> Car</td>\r\n");
      out.write("\t                <td title=\"Location\"><div id=\"dvDistance1\"></div></td>\r\n");
      out.write("                        <td title=\"Ibu Kota\"><div id=\"dvDuration1\"></div></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">directions_bus</i> Bus</td>\r\n");
      out.write("\t                <td title=\"Location\"><div id=\"dvDistance2\"></div></td>\r\n");
      out.write("                        <td title=\"Ibu Kota\"><div id=\"dvDuration2\"></div></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">directions_subway</i> Train</td>\r\n");
      out.write("\t                <td title=\"Location\"><div id=\"dvDistance3\"></div></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\"><div id=\"dvDuration3\"></div></td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"NO\"><input type=\"radio\" name=\"#\" value=\"#\"><br></td>\r\n");
      out.write("\t                <td title=\"Event Name\"><i class=\"material-icons\" style=\"float: left;font-size: 20px; color: grey;\">flight</i> Aeroplane</td>\r\n");
      out.write("\t                <td title=\"Location\">-</td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t                <td title=\"Ibu Kota\">-</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter\">&copy; Kelompok B1 | Made With ? by FrontEnd in Kosan Uda</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
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
