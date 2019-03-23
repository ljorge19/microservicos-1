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
}
