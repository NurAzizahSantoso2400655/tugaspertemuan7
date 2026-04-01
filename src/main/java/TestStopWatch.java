/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args){
        
        int[] data = new int[100000];
        Random rand = new Random();
        
        //isi array
        for(int i = 0; i < data.length; i++){
            data[i] = rand.nextInt(100000);
        }
        
        StopWatch sw = new StopWatch();
        
        sw.start();
        selectionSort(data);
        sw.stop();
        
        System.out.println("Waktu eksekusi: " + sw.getElapsedTime() + "ms");
        System.out.println("Start: " + sw.getStartTime());
        System.out.println("End: " + sw.getEndTime());
    }
    
    public static void selectionSort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}
