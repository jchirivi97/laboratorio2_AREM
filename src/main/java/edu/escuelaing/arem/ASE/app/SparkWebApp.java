package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.*;

import static spark.Spark.get;
import static spark.Spark.port;

import spark.Request;
import spark.Response;

public class SparkWebApp {
	
	
	/**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>CALCULADORA DE DESVIACION ESTANDAR</h2>"
                + "<form action=\"/results\">"
                + "  Inserte los numeros a calcular:<br>"
                + "  <input type=\"text\" name=\"numero\">"
                + "  </br>"
                + "  <br></br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
    	float media,desviasion;
    	principal princ = new principal();
    	String [] datos = req.queryParams("numero").split(",");
    	for (int i = 0; i < datos.length; i++ ) {
    		float flotante = Float.parseFloat(datos[i]);
    		princ.list.add(flotante);
    	}
    	media = princ.mean();
    	desviasion = princ.StandardDesviation();
    	String cadena = Float.toString(media);
    	String cadena2 = Float.toString(desviasion);
    	
    	String respuesta = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>CALCULADORA DE DESVIACION ESTANDAR</h2>"
                + "<p>"+"La media es :" + cadena+ "</p>"
                + "<p>"+"La desviacion estandar es :" + cadena2+ "</p>"
                + "</body>"
                + "</html>";
    	
        return respuesta;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4176; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
