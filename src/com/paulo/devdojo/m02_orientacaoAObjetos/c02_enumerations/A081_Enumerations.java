package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.PaymentMethodEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee.Seller;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee.Waiter;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;

/* As enumerações são compostas por constantes e essas constantes podem ter valores predefinidos, passados para os atributos
   da enumeração, pelo construtor.
   Através dos atritutos, é possível retornar valores recuperados pela enumeração, como um código ou uma descrição.
 */
public class A081_Enumerations {
    public static void main(String[] args) {
        Client client = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);


        System.out.println(client);
    }
}
