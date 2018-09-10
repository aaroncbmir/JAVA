package com.example.aaroncabrera.myapplication;

import java.util.ArrayList;

public class Polinomio implements Funcion {

    //Creamos un array

    ArrayList<Double> coef;

//Creamos un constructor

    public Polinomio () {

        coef = new ArrayList<Double>();
    }

    //Creamos el método añadir

    public void añadir (double x){
        this.coef.add(x);
        }

        //Creamos los algoritmos necesarios para calcular el polinomio

    public double calcular (double x){
        double contador = 0;
        for (int i = 0; i < coef.size(); i++){
            contador = contador + coef.get(i) * Math.pow(x, i);
        }

        return contador;
    }


}
