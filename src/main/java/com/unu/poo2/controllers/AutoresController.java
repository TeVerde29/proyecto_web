package com.unu.poo2.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.unu.poo2.beans.Autor;
import com.unu.poo2.model.AutoresModel;

/**
 * Servlet implementation class AutoresController
 */
public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AutoresModel modelo = new AutoresModel();

	public AutoresController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			if (request.getParameter("op") == null) {
				listar(request, response);
				return;
			}
			String operacion = request.getParameter("op");
			switch (operacion) {
			case "listar":
				listar(request, response);
			case "nuevo":
				// request.getRequestDispatcher("/autores/nuevoAutor.jsp").forward(request,response);
				break;
			case "insertar":
				// insertar(request, response);
				break;
			case "obtener":
				// obtener(request, response);
				break;
			case "modificar":
				// modificar(request, response);
				break;
			case "eliminar":
				// eliminar(request, response);
				break;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) {
		 try {
				request.setAttribute("listaAutores", modelo.listarAutores());
				
				Iterator<Autor> it = modelo.listarAutores().iterator();
				while(it.hasNext()) {
					Autor a = it.next();
					System.out.println(a.getIdAutor()+" "+a.getNombreAutor()+" "+a.getNacionalidad());
				}
				
				request.getRequestDispatcher("/autores/listaAutores.jsp").forward(request, response);
		 	} catch (ServletException | IOException ex) {
		 		Logger.getLogger(AutoresController.class.getName()).log(Level.SEVERE, null, ex);
		 	}
		 }

	
}
