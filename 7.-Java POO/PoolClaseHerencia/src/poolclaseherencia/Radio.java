/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseherencia;

/**
 *
 * @author Debora
 */
public class Radio extends Electrodomestico{
    
    private boolean tieneCD;
    private boolean tieneMP3;
    private boolean tieneUSB;

    public boolean getTieneCD() {
        return tieneCD;
    }

    public void setTieneCD(boolean tieneCD) {
        this.tieneCD = tieneCD;
    }

    public boolean getTieneMP3() {
        return tieneMP3;
    }

    public void setTieneMP3(boolean tieneMP3) {
        this.tieneMP3 = tieneMP3;
    }

    public boolean getTieneUSB() {
        return tieneUSB;
    }

    public void setTieneUSB(boolean tieneUSB) {
        this.tieneUSB = tieneUSB;
    }
    
    public Radio(String marca, double precio, String color, char letraE, double peso, boolean cd, boolean mp3, boolean usb){
        super(marca, precio, color, letraE, peso);
        this.tieneCD = cd;
        this.tieneMP3 = mp3;
        this.tieneUSB = usb;
    }
    
}
