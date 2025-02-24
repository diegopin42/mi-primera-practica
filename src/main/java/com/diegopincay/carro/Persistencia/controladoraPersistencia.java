
package com.diegopincay.carro.Persistencia;

import com.diegopincay.carro.Logica.AutoMovil;
import com.diegopincay.carro.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class controladoraPersistencia {
    
    AutoMovilJpaController autoJpa = new AutoMovilJpaController();

    public void agregarcarro(AutoMovil auto) {
        autoJpa.create(auto);
    }

    public List<AutoMovil> traerAutos() {
        return autoJpa.findAutoMovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public AutoMovil traerAuto(int idAuto) {
        return autoJpa.findAutoMovil(idAuto);
    }

    public void modificarAuto(AutoMovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
