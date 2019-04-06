package br.com.fiap.microservicesExemplo1;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import br.com.fiap.microservicesExemplo1.microservicesController.MicroservicesExemploController;
import br.com.fiap.microservicesExemplo1.microservicesEntity.PedidoDto;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MicroservicesExemploControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private MicroservicesExemploController controller;

	@Before
	public void setUp() {
		

		PedidoDto item = new PedidoDto();

		item.setIdPedido(1L);
        item.setNomeCliente("leandro Jorge");
        item.setItemAdquirido("Placa arduino");
        item.setEmail("leandro.jorge19@gmail.com");
        item.setShipping("frei inacio da conceição 635, SP vila são luis");
        
        //Mockito.when(controller.retornaPedido()).thenReturn(item);
		
        
	}

	@Test
	public void Teste_pedido() throws Exception {
		Long codigoPedido = 1L;

		PedidoDto dto = new PedidoDto();
		dto.setIdPedido(codigoPedido);

		mockMvc.perform(get("/order-service/pedido").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
		assertThat(dto.getIdPedido()).isEqualTo(1L);
		//.andExpect(jsonPath("$.content.idPedido", is(dto.getIdPedido())));
}
	
	}
