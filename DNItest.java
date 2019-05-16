

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.junit.Test;

public class DNItest {

	@Test
	public void TestLetraBNn()  {
		int n = 43473749;
		String resultado = (String) DNI.GenerarLetra(n);
		String esperado= "T";
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestLetraML()  {
		int n = 43473749;
		String resultado = (String) DNI.GenerarLetra(n);
		String esperado= "E";
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestDNI() {
		Pattern patron = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
		java.util.regex.Matcher mat = patron.matcher(DNI.getDNI());
		
		if(mat.matches()){
	        System.out.println("FORMATO CORRECTO");
	    }else{
	        System.out.println("FORMATO INCORRECTO");
	    }
	}
}
