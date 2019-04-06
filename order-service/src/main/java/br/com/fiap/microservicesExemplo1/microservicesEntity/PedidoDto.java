package br.com.fiap.microservicesExemplo1.microservicesEntity;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDto {

    private Long idPedido;
    private String nomeCliente;
    private String itemAdquirido;
    private String email;
    private String Nome;
    private String shipping;
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getItemAdquirido() {
		return itemAdquirido;
	}
	public void setItemAdquirido(String itemAdquirido) {
		this.itemAdquirido = itemAdquirido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

}
