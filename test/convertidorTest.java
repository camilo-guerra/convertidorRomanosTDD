import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.udea.appemp.convertidor;



public class convertidorTest {
    convertidor c;
    String resultado;
	@Test
	public void convertiI() {
		c = new convertidor();
		resultado = c.convertir(1);
		assertEquals("I",resultado);
	}
	@Test
	public void convertiII() {
		c = new convertidor();
		resultado = c.convertir(2);
		assertEquals("II",resultado);
	}
	@Test
	public void convertiIII() {
		c = new convertidor();
		resultado = c.convertir(3);
		assertEquals("III",resultado);
	}
	@Test
	public void convertiIV() {
		c = new convertidor();
		resultado = c.convertir(4);
		assertEquals("IV",resultado);
	}
	@Test
	public void convertiV() {
		c = new convertidor();
		resultado = c.convertir(5);
		assertEquals("V",resultado);
	}
	@Test
	public void convertiVI() {
		c = new convertidor();
		resultado = c.convertir(6);
		assertEquals("VI",resultado);
	}
	@Test
	public void convertiVII() {
		c = new convertidor();
		resultado = c.convertir(7);
		assertEquals("VII",resultado);
	}
	@Test
	public void convertiVIII() {
		c = new convertidor();
		resultado = c.convertir(8);
		assertEquals("VIII",resultado);
	}
	@Test
	public void convertiIX() {
		c = new convertidor();
		resultado = c.convertir(9);
		assertEquals("IX",resultado);
	}
	@Test
	public void convertiX() {
		c = new convertidor();
		resultado = c.convertir(10);
		assertEquals("X",resultado);
	}
	@Test
	public void convertiXIV() {
		c = new convertidor();
		resultado = c.convertir(14);
		assertEquals("XIV",resultado);
	}
	@Test
	public void convertiXV() {
		c = new convertidor();
		resultado = c.convertir(15);
		assertEquals("XV",resultado);
	}
	@Test
	public void convertiXIX() {
		c = new convertidor();
		resultado = c.convertir(19);
		assertEquals("XIX",resultado);
	}
	@Test
	public void convertiXX() {
		c = new convertidor();
		resultado = c.convertir(20);
		assertEquals("XX",resultado);
	}
	@Test
	public void convertiXXX() {
		c = new convertidor();
		resultado = c.convertir(30);
		assertEquals("XXX",resultado);
	}
	@Test
	public void convertiXL() {
		c = new convertidor();
		resultado = c.convertir(40);
		assertEquals("XL",resultado);
	}
	@Test
	public void convertiL() {
		c = new convertidor();
		resultado = c.convertir(50);
		assertEquals("L",resultado);
	}
	@Test
	public void convertiLX() {
		c = new convertidor();
		resultado = c.convertir(60);
		assertEquals("LX",resultado);
	}
	@Test
	public void convertiXC() {
		c = new convertidor();
		resultado = c.convertir(90);
		assertEquals("XC",resultado);
	}
	@Test
	public void convertiC() {
		c = new convertidor();
		resultado = c.convertir(100);
		assertEquals("C",resultado);
	}
	@Test
	public void convertiCX() {
		c = new convertidor();
		resultado = c.convertir(110);
		assertEquals("CX",resultado);
	}
	@Test
	public void convertiCXL() {
		c = new convertidor();
		resultado = c.convertir(140);
		assertEquals("CXL",resultado);
	}
	@Test
	public void convertiCL() {
		c = new convertidor();
		resultado = c.convertir(150);
		assertEquals("CL",resultado);
	}
	@Test
	public void convertiCLX() {
		c = new convertidor();
		resultado = c.convertir(160);
		assertEquals("CLX",resultado);
	}
	@Test
	public void convertiCXC() {
		c = new convertidor();
		resultado = c.convertir(190);
		assertEquals("CXC",resultado);
	}
	@Test
	public void convertiCC() {
		c = new convertidor();
		resultado = c.convertir(200);
		assertEquals("CC",resultado);
	}
	@Test
	public void convertiCD() {
		c = new convertidor();
		resultado = c.convertir(400);
		assertEquals("CD",resultado);
	}
	@Test
	public void convertiD() {
		c = new convertidor();
		resultado = c.convertir(500);
		assertEquals("D",resultado);
	}
	@Test
	public void convertiDCC() {
		c = new convertidor();
		resultado = c.convertir(700);
		assertEquals("DCC",resultado);
	}
	@Test
	public void convertiCM() {
		c = new convertidor();
		resultado = c.convertir(900);
		assertEquals("CM",resultado);
	}
	@Test
	public void convertiCMXCIX() {
		c = new convertidor();
		resultado = c.convertir(999);
		assertEquals("CMXCIX",resultado);
	}
	@Test
	public void convertiM() {
		c = new convertidor();
		resultado = c.convertir(1000);
		assertEquals("M",resultado);
	}
	

}
