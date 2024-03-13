/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Almacen {

    private static Almacen instance;

    public ArrayList<Persona> persona = new ArrayList<>();
    public ArrayList<calificaciones> califica = new ArrayList<>();
    private Almacen() {
    }

    public static Almacen getInstance() {
        if (instance == null) {
            instance = new Almacen();
        }
        return instance;
    }
}
