package com.example.cupcake.model;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.google.android.material.snackbar.Snackbar;

public class Aquarium {

    public Aquarium(final Application app, Lifecycle lifecycle) {
        // Add a new observer to the lifecycle.
        lifecycle.addObserver(new LifecycleObserver() {
            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public void aquariumOn() {
                Toast.makeText(app, "LIGHTS ON", Toast.LENGTH_SHORT).show();
                Log.i("aquarium","lights are on");
                //Snackbar.make()
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public void aquariumOff() {
                Toast.makeText(app, "LIGHTS ON", Toast.LENGTH_SHORT).show();
                Log.i("aquarium","lights are off");
                //Snackbar.make()
            }
        });
    }

}
