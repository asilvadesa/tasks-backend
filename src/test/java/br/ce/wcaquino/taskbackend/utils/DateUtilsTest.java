package br.ce.wcaquino.taskbackend.utils;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDataHoje(){
        LocalDate date = LocalDate.now();
        boolean resultado = DateUtils.isEqualOrFutureDate(date);
        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalseParaDataAnterior(){
        LocalDate date = LocalDate.of(2020, 10, 01);
        boolean resultado = DateUtils.isEqualOrFutureDate(date);
        assertFalse(resultado);
    }

    @Test
    public void deveRetornarTrueParaDataFutura(){
        LocalDate date = LocalDate.of(2021, 10, 01);
        boolean resultado = DateUtils.isEqualOrFutureDate(date);
        assertTrue(resultado);
    }

}
