package com.carwebsite.authentication;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ServletFilter
 */
@WebFilter("/*")
public class AuthenticationFilter implements Filter {
	private ServletContext context;

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("AuthenticationFilter initialized");
	}

	/**
	 * Default constructor.
	 */
	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		HttpServletResponse res = (HttpServletResponse) response;
		String uri = req.getRequestURI();

		this.context.log("Requested Resource::" + uri);

		HttpSession session = req.getSession(false);

		System.out.println(session);

		if (session == null
				&& (uri.endsWith("Create") || uri.endsWith("DoEdit")
						|| uri.endsWith("ShowEdit")
						|| uri.endsWith("create.jsp") || uri
							.endsWith("edit.jsp"))) {
			this.context.log("Unauthorized access request");
			String message = "Unauthorized access request,Please Login first";
			request.setAttribute("message", message);
			request.getRequestDispatcher("index.jsp").forward(req, res);
		} else if (session != null) {
			if (session.getAttribute("id") == null
					&& (uri.endsWith("Create") || uri.endsWith("DoEdit")
							|| uri.endsWith("ShowEdit")
							|| uri.endsWith("create.jsp") || uri
								.endsWith("edit.jsp"))) {
				System.out.println("hi");
				this.context.log("Unauthorized access request");
				String message = "Unauthorized access request,Please Login first";
				request.setAttribute("message", message);
				request.getRequestDispatcher("index.jsp").forward(req, res);
				;
			} else {
				chain.doFilter(request, response);
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
