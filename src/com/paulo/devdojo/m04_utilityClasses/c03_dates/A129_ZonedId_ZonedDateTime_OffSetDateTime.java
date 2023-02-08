package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.*;
import java.util.Map;

/* As classes dessa aula permitem trabalharmos com datas e Zonas diretamente.
   São classes utilizadas em sistemas que deverão exibir a hora de acordo com sua zona. */
public class A129_ZonedId_ZonedDateTime_OffSetDateTime {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        LocalDateTime now = LocalDateTime.now();
        Instant instantNow = Instant.now();

        System.out.println("Default zone: " + ZoneId.systemDefault());
        System.out.println("--------------------------------");

        // Para recuperar uma zona específica, podemos utilizar o método of(), passando como argumento o valor exato da Zona.
        ZoneId asiaZone = ZoneId.of("Asia/Shanghai");
        ZoneId spZone = ZoneId.of("America/Sao_Paulo");
        System.out.println("Asia zone: " + asiaZone);

        /* Quando criamos um LocalDateTime a partir de uma Zona específica, ele se torna um ZonedDateTime.
           A diferença é que ele armazena também a Zona, exibindo a diferença de fuso horário entre a hora local e o ZuloTime.
           Ou seja, nos exemplos abaixo, o ZoneDateTime com a zona padrão está -03:00 do ZuloTime. Já ZoneDateTime com a zona
           Asia/Shanghai está +08:00 do ZuloTime. */
        ZonedDateTime zonedDateTimeLocalDateTime = now.atZone(asiaZone);
        System.out.println("ZuloTime with instant: " + instantNow);
        System.out.println("LocalDateTime with default ZoneId: " + now.atZone(ZoneId.systemDefault()));
        System.out.println("ZonedDateTime with Asia/Shanghai ZoneId: " + zonedDateTimeLocalDateTime);
        System.out.println("----------------------------------");

        /* Já com a classe Instant isso funciona de forma diferente. Como a classe Instant já trabalha com ZuloTime,
           ao utilizar um Instant setando uma zona específica, ele apresenta a hora já calculada, com base na diferença do fuso horário.
           Sendo assim, utilizando os mesmos exemplos utilizados para LocalDateTime, obteremos valores distintos.
           Ou seja, a hora já vai ser lançaca com base no */
        ZonedDateTime zonedDateTimeInstant = instantNow.atZone(asiaZone);
        System.out.println("ZuloTime with instant: " + instantNow);
        System.out.println("Instant with default ZoneId: " + instantNow.atZone(ZoneId.systemDefault()));
        System.out.println("zonedDateTimeInstant with Asia/Shanghai ZoneId: " + zonedDateTimeInstant);
        System.out.println("----------------------------------");

        /* Quando não sabemos a Zona que queremos trabalhar, utilizamos a classe ZoneOffset.
           Essa classe recebe como parâmetro, ao invés do nome da Zona, a diferença de tempo entre o fuso horário e o zuloTime

           A diferença é que nessa classe, não apresenta o nome da ZoneID, apenas o tempo. */
        ZoneOffset zoneOffSetSaoPaulo = ZoneOffset.of("-03:00");
        ZoneOffset zoneOffsetShanghai = ZoneOffset.of("+08:00");
;       OffsetDateTime offsetDateTimeSP = now.atOffset(zoneOffSetSaoPaulo);
        OffsetDateTime offsetDateTimeSH = now.atOffset(zoneOffsetShanghai);

        System.out.println("ZuloTime with Instant: " + instantNow);
        System.out.println("LocalDateTime with offsetDateTimeSP: " + offsetDateTimeSP);
        System.out.println("LocalDateTime with offsetDateTimeSH: " + offsetDateTimeSH);
        System.out.println("----------------------------------");

        /* A mesma coisa acontece aqui utilizamos a classe Instant. Neste caso, ela já apresentará a data e hora de acordo
           com a zona.*/
        OffsetDateTime offsetInstantSP = instantNow.atOffset(zoneOffSetSaoPaulo);
        OffsetDateTime offsetInstantSH = instantNow.atOffset(zoneOffsetShanghai);

        System.out.println("ZuloTime with Instant: " + instantNow);
        System.out.println("Instant with offsetInstantSP: " + offsetInstantSP);
        System.out.println("Instant with offsetInstantSH: " + offsetInstantSH);
        System.out.println("----------------------------------");

        System.out.println("Making direcly from OffsetDateTime and ZonedDateTime from LocalDateTime");
        OffsetDateTime offsetDateTimeFromLocalDateTimeSP = OffsetDateTime.of(now, zoneOffSetSaoPaulo);
        OffsetDateTime offsetDateTimeFromLocalDateTimeSH = OffsetDateTime.of(now, zoneOffsetShanghai);
        ZonedDateTime zonedDateTimeFromLocalDateTimeSP = ZonedDateTime.of(now, spZone);
        ZonedDateTime zonedDateTimeFromLocalDateTimeSH = ZonedDateTime.of(now, asiaZone);
        System.out.println(offsetDateTimeFromLocalDateTimeSP);
        System.out.println(offsetDateTimeFromLocalDateTimeSH);
        System.out.println(zonedDateTimeFromLocalDateTimeSP);
        System.out.println(zonedDateTimeFromLocalDateTimeSH);
        System.out.println("----------------------------------");

        System.out.println("Making direcly from OffsetDateTime and ZonedDateTime from Instant");
        OffsetDateTime offSetDateTimeFromInstantSP = OffsetDateTime.ofInstant(instantNow, spZone);
        OffsetDateTime offSetDateTimeFromInstantSH = OffsetDateTime.ofInstant(instantNow, asiaZone);
        ZonedDateTime zonedDateTimeFromInstantSP = ZonedDateTime.ofInstant(instantNow, spZone);
        ZonedDateTime zonedDateTimeFromInstantSH = ZonedDateTime.ofInstant(instantNow, asiaZone);
        System.out.println(offSetDateTimeFromInstantSP);
        System.out.println(offSetDateTimeFromInstantSH);
        System.out.println(zonedDateTimeFromInstantSP);
        System.out.println(zonedDateTimeFromInstantSH);
        System.out.println("----------------------------------");

    }
}
