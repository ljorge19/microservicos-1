package br.com.fiap.paymentservice.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class PaymentServiceDto {
    private Integer idTransaction;
    private String  cardNumber;
    private String  expDate;
    private BigDecimal valuePay;
    private String  brand;

}
