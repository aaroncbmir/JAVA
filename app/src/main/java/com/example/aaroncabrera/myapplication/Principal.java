package com.example.aaroncabrera.myapplication;

import java.util.ArrayList;

public class Principal {


    public static void main (String arg[])

    {

Funcion f = new Seno();
Funcion g = new Logaritmo();
System.out.println(f.calcular(1.0));
System.out.println(g.calcular(5.0));


        ArrayList<Funcion> fun =
                new ArrayList<Funcion>();
        fun.add(new Seno());
        fun.add(new Logaritmo());

        for (int i = 0; i < fun.size(); i++) {
            Funcion t = fun.get(i);
            System.out.println(t.calcular(1.0));
        }

    }
}

