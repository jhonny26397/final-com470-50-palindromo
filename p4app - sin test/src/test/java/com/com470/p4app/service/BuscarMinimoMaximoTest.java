/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import net.bytebuddy.matcher.ElementMatcher;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Jhon
 */
public class BuscarMinimoMaximoTest {
    
    BuscarMinimoMaximo utils = new BuscarMinimoMaximo();
    public BuscarMinimoMaximoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        utils = new BuscarMinimoMaximo();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void testBuscarMinimoMaximoUno(){
        List<Integer> lista;
        lista = Arrays.asList(3,2,1,55,2,4,8,20);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        //assertEquals(esperado,resultado);
        test(esperado,lista);
    }
    @Test
    public void testBuscarMinimoMaximoDos(){
        List<Integer> lista = Arrays.asList(3,2,1,-55,2,4,-8,200);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(-55,200);
        test(esperado,lista);
        
    }
    @Test
    public void testBuscarMinimoMaximoThatUno(){
        List<Integer> lista = Arrays.asList(3,2,1,-55,2,4,-8,200);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(-55,200);
        test2(esperado,lista);
    
    }@Test
     public void testBuscarMinimoMaximoThatDos(){
        List<Integer> lista = Arrays.asList(33,2,1,55,2,4,8,20);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        test2(esperado,lista);
    
    }@Test
      public void testBuscarMinimoMaximoThatTres(){
        List<Integer> lista = Arrays.asList(30,20,10,-550,2,40,-80,2000);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(-550,2000);
        test2(esperado,lista);
    
    }
      public void test(MinimoMaximo esperado,List<Integer> lista){
        assertEquals(esperado,utils.buscaMinimoMaximo(lista));
    }
      public void test2(MinimoMaximo esperado,List<Integer> lista){
        assertThat(utils.buscaMinimoMaximo(lista),Matchers.is(esperado));
        assertThat(utils.buscaMinimoMaximo(lista),Matchers.equalTo(esperado));
        //assertThat(utils.buscaMinimoMaximo(lista),is(equalTo(esperado)));
        //assertThat(utils.buscaMinimoMaximo(lista),is(not(equalTo(esperado))));
    }
    
}
