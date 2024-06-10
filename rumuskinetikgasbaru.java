import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class rumuskinetikgasbaru {
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

        // Konstanta gas ideal
        if (pilihan == 1) {
            final double R = 0.0821; // L·atm/(mol·K)

        // Input dari pengguna
        System.out.print("Masukkan tekanan gas (P) dalam atmosfir: ");
        double P = scanner.nextDouble();

        System.out.print("Masukkan volume gas (V) dalam liter: ");
        double V = scanner.nextDouble();

        System.out.print("Masukkan jumlah mol gas (n): ");
        double n = scanner.nextDouble();

        System.out.print("Masukkan suhu gas (T) dalam Kelvin: ");
        double T = scanner.nextDouble();

        // Menghitung menggunakan persamaan gas ideal
        double PV = P * V;
        double nRT = n * R * T;

        // Menampilkan hasil perhitungan
        System.out.println("Hasil perhitungan PV: " + PV);
        System.out.println("Hasil perhitungan nRT: " + nRT);

        if (PV == nRT) {
            System.out.println("Persamaan gas ideal terpenuhi: PV = nRT");
        } else {
            System.out.println("Persamaan gas ideal tidak terpenuhi.");
        }

        
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
