package br.com.fiap.microservicesExemplo1.microservicesEntity;

public class Health {

	private String status;

	public Health() {
		super();
	}

	public Health(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
