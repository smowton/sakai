package org.sakaiproject.cheftool;

import javax.servlet.http.HttpServletRequest;

import org.sakaiproject.util.ParameterParser;

public class RunData
{
	protected ParameterParser m_params = null;

	protected HttpServletRequest m_req = null;

	public RunData(HttpServletRequest req, ParameterParser params)
	{
		m_req = req;
		m_params = params;
	}

	public ParameterParser getParameters()
	{
	    return new ParameterParser();
	}

	public HttpServletRequest getRequest()
	{
		return m_req;
	}
}
