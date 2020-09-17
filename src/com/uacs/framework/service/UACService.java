package com.uacs.framework.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.uacs.framework.data.Result;

@Path("/service001")
public class UACService {

	@Context
	HttpServletRequest request;

	@Context
	HttpServletResponse response;

	@javax.ws.rs.core.Context
	ServletContext context;
	
	@POST
	@Path("greeting")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Result sayHello(Result result){
		Result res = new Result();
		res.setMsgCode("0000");
		res.setMsgDesc("LogIn Successfully");
		res.setUserId(result.getUserId() +"Server Side");
		res.setPhNo(result.getPhNo() + "Server Side");
		return res;
	}
}
