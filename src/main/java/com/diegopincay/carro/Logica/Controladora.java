
package com.diegopincay.carro.Logica;

import com.diegopincay.carro.Persistencia.controladoraPersistencia;
import java.util.List;


public class Controladora {
        
    controladoraPersistencia controlPersis = new controladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
       
        AutoMovil auto = new AutoMovil();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarcarro(auto);
    }

    public List<AutoMovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        
        controlPersis.borrarAuto(idAuto);
    }

    public AutoMovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(AutoMovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {

        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMarca(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        //le digo a la persistencia que lo modifique
        controlPersis.modificarAuto(auto);
    }


    
}
