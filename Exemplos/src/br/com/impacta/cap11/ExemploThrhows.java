package br.com.impacta.cap11;

public class ExemploThrhows {
	   
	
	  public void metodo1() throws Exception {
		  
		  
	       
		  try {
	            metodo2();
	        } 
	        
	        catch (Exception e) {
	            throw new Exception("Exceção enviada no metodo1", e);
	        }
	    }

	    public void metodo2() throws Exception {
	        throw new Exception("Exceção enviada no metodo2");
	    }
	}


