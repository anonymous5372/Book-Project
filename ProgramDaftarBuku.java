import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
     ArrayList<String> ListBuku = new ArrayList();
     Scanner Input = new Scanner(System.in);
     
     while (true) {
     	System.out.println(" Selamat datang di toko Buku Dimas \n Berikut daftar Nama Buku dibawah : ");
     	int i = 0;
     
     	for (String Buku : ListBuku) {
     		  i++;
     		  System.out.println(" "+i+" "+Buku);
     	}
     	String Data = Input.nextLine();
     	ListBuku.add(Data);
     	System.out.println("\t");
     }
     	
		
	}
}