package deqo.mkei.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.time.Clock;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.*;


public class SimpleStackImpTest {
    @Mock
    SimpleStack mock;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        //stack = new SimpleStackImp();
        System.out.println("Je laisse une trace avant chaque test");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertTrue(mock.isEmpty());
        String el = "el";
        mock.push(new Item(el));
        Assert.assertFalse(mock.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, mock.getSize());
        String el = "el";
        mock.push(new Item(el));
        mock.push(new Item(el));
        Assert.assertEquals(2, mock.getSize());
    }

    @Test
    public void push() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, mock.getSize());
        mock.push(ita);
        Assert.assertEquals(1, mock.getSize());
        Item o = mock.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void peek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, mock.getSize());
        mock.push(ita);
        Assert.assertEquals(1, mock.getSize());
        Integer integer = (Integer) ita.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void pop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, mock.getSize());
        mock.push(ita);
        Assert.assertEquals(1, mock.getSize());
        Item o = mock.pop();
        Assert.assertEquals(0, mock.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }
}