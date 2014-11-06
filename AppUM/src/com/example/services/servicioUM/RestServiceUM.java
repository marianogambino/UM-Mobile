package com.example.services.servicioUM;

import android.util.Log;
import ar.edu.unimoron.model.LoginResponse;

import com.example.restClient.connectionRest.RestConnection;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author mariano
 *
 */
public class RestServiceUM {

	private RestConnection rest;
	
	
	
	public RestServiceUM( ){
		this.rest = new RestConnection();
	}
	  
	
	/**
	 * 
	 * @param usuario
	 * @param password TODO: a futuro hay que encriptarla y enviarla al servicioUM
	 * @return
	 * @throws JsonProcessingException 
	 */
	public String login(String usuario, String password){
		LoginResponse response = null; 
		String login = null;
		try {
				response = rest.getRestTemplate().getForObject( String.format( UrlServicesUM.LOGIN , usuario , password ) ,
						LoginResponse.class);
				login = new ObjectMapper().writeValueAsString(  response );
				
		 }catch (JsonProcessingException e) {
			 Log.v("LoginResponse : JsonProcessingException: ", e.getMessage() );
			 //showLoading( String.format("Ocurrio un Error de JSON: %s", e.getMessage() ) );
		 }catch(Exception e){
			 Log.v("LoginResponse : Exception: ", e.getMessage() );
			 //showLoading( String.format("Ocurrio un Error: %s", e.getMessage() ) );
		 }		
		return login;
	}
	
	
}
