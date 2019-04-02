package br.com.fiap.microservicesExemplo1.microservicesController;

import br.com.fiap.microservicesExemplo1.microservicesEntity.Person;
import br.com.fiap.microservicesExemplo1.microservicesEntity.PedidoDto;
import br.com.fiap.microservicesExemplo1.microservicesHandlingException.OrderNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.*;


@Slf4j
@RestController
@RequestMapping(value = "/order-service")
public class MicroservicesExemploController {

    ArrayList<PedidoDto> listaPedidos = new ArrayList<PedidoDto>();



    @GetMapping("/pedido")
    public PedidoDto retornaPedido() {

        PedidoDto item = new PedidoDto();

        item.setIdPedido(1L);
        item.setNomeCliente("leandro Jorge");
        item.setItemAdquirido("Placa arduino");
        item.setEmail("leandro.jorge19@gmail.com");
        item.setShipping("frei inacio da conceição 635, SP vila são luis");

        return item;
    }

    @GetMapping("/findById/{id}")
    public PedidoDto retornaPedido(@PathVariable(value = "id", required = true) int id) throws OrderNotFoundException {

        PedidoDto item = null;

        for (PedidoDto pedidoDto : listaPedidos) {
            if (pedidoDto.getIdPedido() == id) {



                item = new PedidoDto();

                item.setIdPedido(pedidoDto.getIdPedido());
                item.setEmail(pedidoDto.getEmail());
                item.setItemAdquirido(pedidoDto.getItemAdquirido());
                item.setNome(pedidoDto.getNome());
                item.setNomeCliente(pedidoDto.getNomeCliente());
                item.setShipping(pedidoDto.getShipping());

                System.out.printf("item do findById", item);

            }

        }

        if (item == null) {

            System.out.printf("passei aqui item", item);
             throw  new OrderNotFoundException(PedidoDto.class, "id", "pedido não encontrado");


        }

        return item;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Void> create(@RequestBody PedidoDto pedido, UriComponentsBuilder ucBuilder) {


        listaPedidos.add(pedido);
        System.out.println("Criado o pedido " + pedido.getItemAdquirido());
        System.out.println("nome do cliente " + pedido.getNomeCliente());
        return null;
    }


    @GetMapping("/delete/{id}")
    public void deletaPedido(@PathVariable(value = "id", required = true) int id) {



        PedidoDto item = null;

                for (int i = 0; i < listaPedidos.size(); i++) {
                    if (listaPedidos.get(i).getIdPedido() == id) {
                        listaPedidos.remove(i);

                System.out.printf("item do removido");

            }

        }

    }

    @RequestMapping(value = "/alterar/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> alterar(@RequestBody PedidoDto pedido, UriComponentsBuilder ucBuilder,
                                        @PathVariable(value = "id", required = true) int id) {

        PedidoDto item = null;

        for (int i = 0; i < listaPedidos.size(); i++) {
            if (listaPedidos.get(i).getIdPedido() == id) {

                listaPedidos.remove(i);

                item = new PedidoDto();
                item.setIdPedido(pedido.getIdPedido());
                item.setEmail(pedido.getEmail());
                item.setItemAdquirido(pedido.getItemAdquirido());
                item.setNome(pedido.getNome());
                item.setNomeCliente(pedido.getNomeCliente());
                item.setShipping(pedido.getShipping());

                listaPedidos.add(item);

                System.out.printf("item alterado");

            }
        }

        return null;
    }


}
