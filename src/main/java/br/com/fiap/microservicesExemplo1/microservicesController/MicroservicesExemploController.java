package br.com.fiap.microservicesExemplo1.microservicesController;

import br.com.fiap.microservicesExemplo1.microservicesEntity.Person;
import br.com.fiap.microservicesExemplo1.microservicesEntity.PedidoDto;
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
public class MicroservicesExemploController {

    ArrayList<PedidoDto> listaPedidos = new ArrayList<PedidoDto>();

    @GetMapping("/exemplo-1/{firstName}/{lastName}")
    public ResponseEntity getHello(@PathVariable(value = "firstName", required = true) String firstName,
                                   @PathVariable(value = "lastName", required = true) String lastName) {
        System.out.printf("Hello %s %s", firstName, lastName);

        log.info("Hello %s %s", firstName, lastName);

        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/exemplo-1")
    public ResponseEntity getHello(Person person) {

        log.info("Hello %s %s", person.getFirstName(), person.getLastName());

        return new ResponseEntity<>(person, HttpStatus.OK);

    }

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
    public PedidoDto retornaPedido(@PathVariable(value = "id", required = true) int id) {

        PedidoDto item = null;

        for (PedidoDto pedidoDto : listaPedidos) {
            if (pedidoDto.getIdPedido() == id) {

                item = new PedidoDto();

                item.setIdPedido(pedidoDto.getIdPedido());
                item.setEmail(pedidoDto.getEmail());
                item.setItemAdquirido(pedidoDto.getItemAdquirido());
                item.setNome(pedidoDto.getNome());
                item.setShipping(pedidoDto.getShipping());

                System.out.printf("item do findById", item);

            }

        }

        return item;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody PedidoDto pedido, UriComponentsBuilder ucBuilder) {


        listaPedidos.add(pedido);
        System.out.println("Criado o pedido " + pedido.getItemAdquirido());
        System.out.println("Lista " + listaPedidos.toString());
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


}