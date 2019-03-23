package br.com.fiap.microservicesExemplo1.microservicesEntity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;

    private String lastName;
}
