/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author pcbox
 */
public class Reloj {
    private byte hora;
    private byte minutos;
    private byte segundos;

    public Reloj(byte hora, byte minutos, byte segundos) {
        valida(hora, minutos, segundos);
    }

    public Reloj() {
        this((byte) 0, (byte) 0, (byte) 0);
    }
    

    public void setHora(byte hora) {
        this.hora = hora;
    }

    public void setMinutos(byte minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(byte segundos) {
        this.segundos = segundos;
    }

    public byte getHora() {
        return hora;
    }

    public byte getMinutos() {
        return minutos;
    }

    public byte getSegundos() {
        return segundos;
    }
    
    public Reloj copia(){
        Reloj copia = new Reloj(getHora(), getMinutos(), getSegundos());
        return copia;   
    }
    
    
    
    public void leer(){
        Scanner sc = new Scanner (System.in);
        byte h, m, s;
        
        System.out.print("Hora: ");
        h=sc.nextByte();
        System.out.print("Minutos: ");
        m=sc.nextByte();
        System.out.print("Segundos: ");
        s = sc.nextByte();
        
        valida(h,m,s);
        
        
    }
    
    public int aSegundos(){
        int sTotales=0;
        
        sTotales = getHora()*3600;
        sTotales = sTotales + (getMinutos()*60);
        sTotales = sTotales + (getSegundos());
        
        return sTotales;
    }
    
    public void deSegundos(int segundos){
        byte sTotal, mTotal, hTotal;
        sTotal = (byte) (segundos % 60);
        mTotal = (byte) ((byte) (segundos / 60) % 60);
        hTotal = (byte) ((byte) (segundos /3600) % 24);
        
        setHora(hTotal);
        setMinutos(mTotal);
        setSegundos(sTotal);
    }
    
    public void siguiente (int segundos){
        int sHora, sSuma=segundos, sTotales;
        
        sHora = aSegundos();
        sTotales =sHora + sSuma;
        
        deSegundos(sTotales);
        
    }
    
    public void anterior(int segundos){
        int sHora, sResta=segundos, sTotales, sFin=86399;
        
        sHora = aSegundos();
        
        if(sResta>sHora){
            sTotales= sFin-(sResta-sHora);
        }else{
           sTotales =sHora - sResta; 
        }
        
        
        deSegundos(sTotales);
    }
    
    public boolean equals(Reloj b){
        int sHora1, sHora2;
        sHora1 = aSegundos();
        sHora2 = b.aSegundos();
        
        if(sHora1 == sHora2){
            return true;
        }else 
            return false;
    }

    @Override
    public String toString() {
        return  hora + ":" + minutos + ":" + segundos;
    }
    
    public boolean menorQue(Reloj b){
        int sHora1, sHora2;
        sHora1 = aSegundos();
        sHora2 = b.aSegundos();
        
        if(sHora1<sHora2){
            return true;
        }else 
            return false;
        
    }
    
    public boolean mayorQue(Reloj b){
        int sHora1, sHora2;
        sHora1 = aSegundos();
        sHora2 = b.aSegundos();
        
        if(sHora1>sHora2){
            return true;
        }else 
            return false;  
    }
    
    private void valida(byte h, byte m, byte s){
        byte sh, sm;
        
        sm = (byte) (s/60);
        s = (byte) (s%60);
        sh = (byte) ((m+sm)/60);
        m = (byte) ((m+sm)%60);
        h = (byte) ((h+sh)%24);
        
        setHora(h);
        setMinutos(m);
        setSegundos(s);   
    }
    
    
    
    
}
