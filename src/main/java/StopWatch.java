/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class StopWatch {
    //ini atribut enkapsulasi
    private long startTime;
    private long endTime;
    
    //ini konstruktor
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    
    //getter
    public long getStartTime(){
        return startTime;
    }
    
    public long getEndTime(){
        return endTime;
    }
    
    //method start
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    //method stop
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    //untuk menghitung selisih waktu
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
