package com.example.netocaz.cardiapp;

/**
 * Created by NeToCaZ on 20/09/2015.
 */
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;



public class EjercicioMainActivity extends Activity {

    ListView listView;

    private ArrayList<String> mItems;
    private ArrayList<String> mItemsdesc;
    private ArrayList<Integer> mItemsima;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainejercicios);


        listView = (ListView) findViewById(R.id.listView1);

        mItems = new ArrayList<String>();
        mItems.add("Ejercicio 1");
        mItems.add("Ejercicio 2");
        mItems.add("Ejercicio 3");
        mItems.add("Ejercicio 4");
        mItems.add("Ejercicio 5");
        mItems.add("Ejercicio 6");
        mItems.add("Ejercicio 7");
        mItems.add("Ejercicio 8");
        mItems.add("Ejercicio 9");
        mItems.add("Ejercicio 10");
        mItems.add("Ejercicio 11");
        mItems.add("Ejercicio 12");
        mItems.add("Ejercicio 13");
        mItems.add("Ejercicio 14");
        mItems.add("Ejercicio 15");
        mItems.add("Ejercicio 16");

        mItemsdesc = new ArrayList<String>();
        mItemsdesc.add("Recargado en una pared, realizar elevación de pierna extendida desde el soporte hasta la altura de la cadera aproximadamente.\n Teniendo atención en que la pierna de soporte no se flexione o se eleve a puntas, realizar 15 elevaciones con una pierna y después realizar con la otra pierna.");
        mItemsdesc.add("De manera lateral a la pared o bien con ayuda de una silla de igual apoyo lateral; se realiza una elevación lateral con giro de rodilla hacia arriba aproximadamente a la altura de la cadera y girar a la posición inicial al momento de bajar para columpiar por enfrente de la de soporte en forma de péndulo. El movimiento se realiza 15 veces con cada pierna.");
        mItemsdesc.add("De frente a la pared se realiza una flexión de rodilla elevando a la altura de la cadera, para continuar con una extensión de la pierna hacia atrás sin flexionar la rodilla al momento de elevar el talón debe de llegar a la altura de la rodilla de la pierna de soporte. Se realizan 15 elevaciones con cada pierna.");
        mItemsdesc.add("Con ayuda de un cajón o bien un escalón de aproximadamente 20 cm. Se apoya un pie sobre el y el otro quedando apoyado sobre el piso se realiza una elevación del pie apoyado sobre el cajón y de la pierna de abajo se realiza una patada por enfrente hacia arriba. Para luego bajar a la posición inicial de ambas piernas. Se realizan 10 elevaciones con cada pierna.");
        mItemsdesc.add("Tumbado sobre el piso y manteniendo las piernas flexionadas apoyadas sobre el piso, las rodillas deben de tener una separación aproximada de los hombros se realiza una elevación del tronco hasta donde las manos puedan tocar las rodillas de manera cruzada se eleva y se baja al hacer cada toque. Se realizan 10 toques a cada pierna.");
        mItemsdesc.add("Tumbado sobre el piso apoyando los brazos en los laterales se elevan las piernas a 90 grados para realizar flexión-extensión por enfrente del pecho o estomago. Se reaizan 15 elevación/flexión.");
        mItemsdesc.add("Tumbado sobre el piso apoyando las piernas en los laterales se elevan las piernas a 90 grados extendidas para abrir y cerrar las piernas aproximadamente la separación de los hombros. Se realizan 20 separaciones.");
        mItemsdesc.add("Tumbado sobre el piso apoyando las manos sobre los laterales se elevan las piernas aproximadamente 20 cm del piso y se realizan patadas de manera alternada simulando la patada de natación se realizan 15 patadas.");
        mItemsdesc.add("Tumbado sobre el piso de forma lateral se flexiona el brazo mas cercano al piso poniendo la mano cerca del oído y el codo por el frente al nivel de los ojos y la otra mano se apoya en el piso por enfrente a la altura del pecho para que sirva de apoyo se eleva el tronco de forma lateral sin ayuda del brazo cercano del piso. Se realizan 15 elevaciones de cada lado.");
        mItemsdesc.add("Tumbado sobre el piso boca abajo se realizan elevaciones de pierna por atrás hasta donde se pueda elevar sin flexionar la rodilla se realizan 30 elevaciones de cada pierna por separado.");
        mItemsdesc.add("En posición de gato eleva la pierna con la mano contraria y manteniendo la vista al frente es importante mantener el estomago contraído para evitar que se arqueé y lastime la espalda. Se realiazan 10 elevaciones de manera alternada con cada pierna/mano.");
        mItemsdesc.add("Tumbado sobre el piso y mateniendo las piernas siempre flexionadas se suben los brazos por enfrente a la altura del pecho para luego pasar extendidas por atrás de los oídos y regresar por enfrente hasta las rodillas. Este ejercicio se realiza con una mancuerna de 1 hasta 3 libras para evitar esfuerzo. Se reaizan 15 movimientos.");
        mItemsdesc.add("Tumbado sobre el piso y manteniendo las piernas flexionadas se abren los brazos a nivel de peco, para luego subirlos por enfrente-arriba al nivel del pecho. Este ejercicio se realiza con una mancuerna de 1 hasta 3 libras para evitar esfuerzos. Se realizan 15 movimientos de abrir cerrar.");
        mItemsdesc.add("Sentado en una silla con las piernas abiertas y pies apoyados sobre el piso y la espalda recta se eleva un brazo por arriba de la cabeza para luego flexionarlo por atrás de la cabeza y luego extenderlo de nuevo. Se realiza con mancuerna de 1 hasta 3 libras para evitar esfuerzo. El movimiento se realiza 20 veces con cada brazo por separado.");
        mItemsdesc.add("Sentado sobre una silla con las piernas abiertas y pies apoyados sobre el piso se flexionan los brazos con las palmas hacia arriba quedando ya flexionados al nivel del pecho y las palmas pegadas al cuerpo se extienden hasta un ángulo de aproximadamente 160 grados para luego flexionar de nuevo el movimiento se realiza con mancuernas hasta de 1kg. Y se realizan 20 flexiones.");
        mItemsdesc.add("De pie apoyando las manos sobre el respaldo de una silla o bien en la pared con el estomago contaído, se realizan elevaciones de punta de los pies hasta llegar a la máxima altura posible y se bajan los talones para luego repetir el movimiento. Se realizan 30 elevaciones.");

        mItemsima = new ArrayList<>();
        mItemsima.add(R.drawable.e01);
        mItemsima.add(R.drawable.e02);
        mItemsima.add(R.drawable.e03);
        mItemsima.add(R.drawable.e04);
        mItemsima.add(R.drawable.e05);
        mItemsima.add(R.drawable.e06);
        mItemsima.add(R.drawable.e07);
        mItemsima.add(R.drawable.e08);
        mItemsima.add(R.drawable.e09);
        mItemsima.add(R.drawable.e10);
        mItemsima.add(R.drawable.e11);
        mItemsima.add(R.drawable.e12);
        mItemsima.add(R.drawable.e13);
        mItemsima.add(R.drawable.e14);
        mItemsima.add(R.drawable.e15);
        mItemsima.add(R.drawable.e16);



        listView.setAdapter(new EjercicioCustomeArrayAdapter(EjercicioMainActivity.this, mItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(EjercicioMainActivity.this, EjercicioSubActivity.class);
                intent.putExtra("thanhcs", mItems.get(position));


                intent.putExtra("HOL", mItemsdesc.get(position));
                intent.putExtra("valor", position);

                intent.putIntegerArrayListExtra("IMA", mItemsima);
                startActivity(intent); //when you click,
                //open new activity and intent text
            }


        });

    }
}

