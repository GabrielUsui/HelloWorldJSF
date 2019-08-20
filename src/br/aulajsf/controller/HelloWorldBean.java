package br.aulajsf.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldBean 
{
	public String getWorld() 
	{
		return "Hello World";
	}
}
