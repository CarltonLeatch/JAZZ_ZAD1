import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import servlets.CalcServlet;


public class CalcServletTest extends Mockito{
	
	public void servlet_should_not_greed_when_kkredytu_is_null() throws IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);	
	PrintWriter writer = mock(PrintWriter.class);
	when(response.getWriter()).thenReturn(writer); 
	CalcServlet servlet = new CalcServlet();
	
	when(request.getParameter("kwota_kredytu")).thenReturn(null);
	when(request.getParameter("ilosc_rat")).thenReturn(null);
	when(request.getParameter("procent")).thenReturn(null);
	
	servlet.doPost(request,response);
	
	verify(response).sendRedirect("/");
	
	}
	
	public void servlet_should_not_greed_when_kkredytu_is_empty() throws IOException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);	
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer); 
		CalcServlet servlet = new CalcServlet();
		
		when(request.getParameter("kwota_kredytu")).thenReturn("");
		when(request.getParameter("ilosc_rat")).thenReturn("");
		when(request.getParameter("procent")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/");
		
		}
	
	@Test
public void test() {
		String name = "Vinny";
		  assertEquals(5, name.length());
	}

}
