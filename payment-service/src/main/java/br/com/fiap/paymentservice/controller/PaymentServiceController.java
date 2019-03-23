package br.com.fiap.paymentservice.controller;

import java.util.ArrayList;

import br.com.fiap.paymentservice.dto.PaymentServiceDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("payment")
public class PaymentServiceController {

    PaymentServiceDto paymentDto = new PaymentServiceDto();

    @GetMapping("/{id}")
    public ResponseEntity<PaymentServiceDto> load(@PathVariable(value="id",required = true) Integer id){

        log.info("getPayments Id: {}", id );

        return new ResponseEntity<>(paymentDto, HttpStatus.OK);

    }

    @GetMapping()
    public ResponseEntity<ArrayList<PaymentServiceDto>> all(){

        log.info("getPayments All");

        ArrayList<PaymentServiceDto> paymentDto = new ArrayList<>();

        return new ResponseEntity<>(paymentDto, HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<PaymentServiceDto> input(@RequestBody PaymentServiceDto orderDto){
        return new ResponseEntity<>(paymentDto, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentServiceDto> update(@RequestBody PaymentServiceDto orderDto){
        return new ResponseEntity<>(paymentDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PaymentServiceDto> delete(@PathVariable(value="id",required = true) Integer id){
        return new ResponseEntity<>(paymentDto, HttpStatus.OK);
    }

}
