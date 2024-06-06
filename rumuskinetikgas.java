
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class rumuskinetikgas {
    public static void main(String[] args) {
        while (true) {            
            Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================================================");
        System.out.println("======Rumus Persamaan Gas Ideal Dan Rumus Kecepatan Rata Rata Molekul Gass==========");
        System.out.println("====================================================================================");
        System.out.println("Pilihan : ");
        System.out.println("1.Rumus Persamaan Gas Ideal");
        System.out.println("2.Rumus Kecepatan Rata Rata Molekul Gass");
        System.out.print("Masukkan Pilihan :  ");
        double pilihan= scanner.nextDouble();
        
        if (pilihan == 1) {
            final double R = 8.314; 
        
        
        System.out.print("Masukkan tekanan (Pa): ");
        double tekanan = scanner.nextDouble();
        
        System.out.print("Masukkan volume (m^3): ");
        double volume = scanner.nextDouble();
        
        System.out.print("Masukkan suhu (K): ");
        double suhu = scanner.nextDouble();
        
        
        double jumlahMol = (tekanan * volume) / (R * suhu);
        
        
        System.out.println("Jumlah mol gas: " + jumlahMol);
        }else if(pilihan == 2){
            final double R = 8.314; // J/(mol·K)
        
        
        System.out.print("Masukkan suhu (K): ");
        double suhu = scanner.nextDouble();
        
        System.out.print("Masukkan massa molar gas (kg/mol): ");
        double massaMolar = scanner.nextDouble();
        
        
        double kecepatanRataRataAritmatika = Math.sqrt((8 * R * suhu) / (Math.PI * massaMolar));
        
        double kecepatanRMS = Math.sqrt((3 * R * suhu) / massaMolar);
        
        double kecepatanPalingMungkin = Math.sqrt((2 * R * suhu) / massaMolar);
        
        
        System.out.println("Kecepatan rata-rata aritmatika: " + kecepatanRataRataAritmatika + " m/s");
        System.out.println("Kecepatan RMS: " + kecepatanRMS + " m/s");
        System.out.println("Kecepatan paling mungkin: " + kecepatanPalingMungkin + " m/s");
        }else {
        }

        }
    }
}
