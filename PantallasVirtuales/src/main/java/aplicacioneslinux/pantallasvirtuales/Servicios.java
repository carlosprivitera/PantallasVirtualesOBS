/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioneslinux.pantallasvirtuales;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Servicios {
    private ArrayList<R> resolucion = null;

    public Servicios() {
        R r = null;
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
        r.setX(0); r.setY(0); resolucion.add(r);
    }

    public R getResolucion(int i) {
        if(resolucion.size()< i) {
            return resolucion.get(i);
        }else{
            return new R();
        }
        
    }
    
    private class  R {
      private int x = 0;
      private int y = 0;

        public R() {
            x = 0; y = 0;
        }
        
        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
