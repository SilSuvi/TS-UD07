package UD07;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
		
		}

	public static void start() {
		//DECLARACI�N DE VARIABLES
		int numNotas;
		String notasEstudiantes = "";
		String respuesta;
		Hashtable <String, String> estudiantes = new Hashtable <String, String>();
		
		//BIENVENIDA AL PROGRAMA Y PRIMERA PREGUNTA 
		System.out.println("Bienvenidos a este programa que le permitir� a�adir notas de sus estudiantes");
		
		respuesta = JOptionPane.showInputDialog("�Desea introducir notas? Diga s� o no");
		respuesta = respuesta.toLowerCase().trim();
		
		//PRIMER CONDICIONAL CON UN DO WHILE PARA SEGUIR PREGUNTANDO
		if(respuesta.equals("si") || respuesta.equals("s�")) {
			do {	
				String cantidadNotas = JOptionPane.showInputDialog("Indique cantidad notas : ");
				numNotas = Integer.parseInt(cantidadNotas);
				String nombreEstudiante = JOptionPane.showInputDialog("Indique alumno : ");
				notasEstudiantes = String.valueOf(calculoMedia(numNotas));
				estudiantes.put(nombreEstudiante, notasEstudiantes);
				respuesta = JOptionPane.showInputDialog("�Desea seguir introduciendo notas? Diga s� o no");
			}while(respuesta.equals("si") || respuesta.equals("s�") );
				printColection(estudiantes);
		}else {
			JOptionPane.showMessageDialog(null, "Cerramos el programa, gracias por utilizarlo");
		}
	}
	
	//M�TODO QUE NOS CALCULA LA MEDIA
	public static double calculoMedia(int cantidadTotalNotas) {
		int total = 0;
		int notas;
		int calculoMedia;
		
		for(int i = 0; i < cantidadTotalNotas; i++) {
			String notaEstudiante = JOptionPane.showInputDialog("Introduzca aqu� nota: ");
			notas = Integer.parseInt(notaEstudiante);
			total += notas;
		}
		calculoMedia = total / cantidadTotalNotas;	
		
		return calculoMedia;
	}
	
	//M�TODO QUE IMPRIME LOS VALORES
	
	public static void printColection(Hashtable <String, String> estudiantes) {
		
		Enumeration <String> elements = estudiantes.elements(); 
		Enumeration <String> keys = estudiantes.keys();
		
		while(elements.hasMoreElements() && keys.hasMoreElements()) { 
			System.out.println("La media de las notas introducidas del estudiante " + keys.nextElement() + " es igual a " + elements.nextElement());
		}
	}
	
	}
