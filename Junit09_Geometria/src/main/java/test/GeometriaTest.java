package test;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import JUnit.Junit09_Geometria.dto.Geometria;


class GeometriaTest {

	
		
		
		@Test
		public void testareacuadrado() {
			
			int resultado = Geometria.areacuadrado(2);
			int esperado = 4;
			assertEquals(esperado,resultado);
			
		}
		
		
		
		@Test
		public void testareacirculo() {
			final double PI=3.1416; 
			int r = 3;
			double resultado = Geometria.areaCirculo(3);
			double esperado = PI * Math.pow(r,2);
			assertEquals( esperado, resultado, 0.2);
			
		}
		@Test
		public void testareatriangulo() {
			int a = 1;
			int b = 2;
			int resultado = Geometria.areatriangulo(a,b);
			int esperado = (a*b)/2;
			assertEquals(esperado,resultado);
		}
		@Test
		public void testarearectangulo() {
			int b = 2;
			int h = 2;
			int resultado = Geometria.arearectangulo(b,h);
			int esperado = b*h;
			assertEquals(esperado, resultado);
			
		}
		
		@Test
		public void testareapentagono() {
			int p = 2;
			int a = 2;
			int resultado = Geometria.areapentagono( p,  a);
			int esperado = (p*a) / 2;
			assertEquals(esperado, resultado);	
			
		}
		
		@Test
		public void testarearombo() {
			
			int D = 2;
			int d = 2;
			int resultado = Geometria.arearombo( D, d);
			int esperado = (D*d) / 2;
			assertEquals(esperado, resultado);	
			
			
		}
		@Test
		public void testarearomboide() {
			
			int b = 2;
			int h = 2;
			int resultado = Geometria.arearomboide(b,h);
			int esperado = b*h;
			assertEquals(esperado, resultado);
		}
		
		@Test
		public void testareatrapecio() {
			int B = 2;
			int b = 2;
			int h = 2;
			int resultado = Geometria.areatrapecio(B,b,h);
			int esperado = ((B+b)/2)*h;
			assertEquals(esperado, resultado);
		
		
		
			}
		
		
		
		@Test
		public void testfigura() {
		
		for (int i=1;i<9;i++)	{
			int fiCode = i;
			String Figura="";
			
			switch (fiCode) 
			{
			case 1: Figura= "cuadrado";
				break;
			case 2: Figura= "Circulo";
				break;
			case 3: Figura= "Triangulo";
				break;
			case 4: Figura= "Rectangulo";
				break;
			case 5: Figura= "Pentagono";
				break;
			case 6: Figura= "Rombo";
				break;
			case 7: Figura= "Romboide";
				break;
			case 8: Figura= "Trapecio";
				break;
			default:
				Figura= "Default";
				break;
																 
			}
			int esperadoInt = i;
			String esperadoString = Figura;
			int resultadoInt = fiCode;
			String resultadoString = Figura;
			assertEquals(esperadoInt,resultadoInt);
			 assertEquals(esperadoString,resultadoString);
		}
			
		}
		
	}


