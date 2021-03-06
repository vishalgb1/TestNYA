package com.vishal.byahatti;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

public class NewYorkAppRedirectionTest extends Mockito {

	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	NewYorkAppRedirection newYorkAppRedirection = new NewYorkAppRedirection();

	@Test
	public void worldTest() throws Exception {
		newYorkAppRedirection.doGet(request, response);
		when(request.getParameter("value")).thenReturn("world");
		assertEquals("https://www.nytimes.com/section/world",
				newYorkAppRedirection.getSiteName() + request.getParameter("value"));
	}

	@Test
	public void politicsTest() throws Exception {
		newYorkAppRedirection.doGet(request, response);
		when(request.getParameter("value")).thenReturn("politics");
		assertEquals("https://www.nytimes.com/section/politics",
				newYorkAppRedirection.getSiteName() + request.getParameter("value"));
	}

	@Test
	public void businessTest() throws Exception {
		newYorkAppRedirection.doGet(request, response);
		when(request.getParameter("value")).thenReturn("business");
		assertEquals("https://www.nytimes.com/section/business",
				newYorkAppRedirection.getSiteName() + request.getParameter("value"));
	}

	@Test
	public void scienceTest() throws Exception {
		newYorkAppRedirection.doGet(request, response);
		when(request.getParameter("value")).thenReturn("science");
		assertEquals("https://www.nytimes.com/section/science",
				newYorkAppRedirection.getSiteName() + request.getParameter("value"));
	}

	@Test
	public void sportsTest() throws Exception {
		newYorkAppRedirection.doGet(request, response);
		when(request.getParameter("value")).thenReturn("sports");
		assertEquals("https://www.nytimes.com/section/sports",
				newYorkAppRedirection.getSiteName() + request.getParameter("value"));
	}
}