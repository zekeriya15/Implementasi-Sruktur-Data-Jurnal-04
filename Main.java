import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Tugas> listTugas = new LinkedList<Tugas>();
        ListIterator<Tugas> it = listTugas.listIterator();

        Scanner s = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("Pilih operasi: \n1. Input Tugas \n2. Delete Tugas \n3. Lihat List Tugas \n4. Keluar");

            int pilihan = s.nextInt();
            s.nextLine();       // solusi biar si inputnya tetep sebaris dengan print statement kalo gapake ini si bakal berantakan

            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mataKuliah = s.nextLine();         // biar si var bisa input yg ada space nya kalo next() aja dia cuma bisa input 1 kata
                    
                    System.out.print("Masukkan nama tugas: ");  
                    String tugas = s.nextLine();      
                    
                    System.out.print("Masukkan tanggal deadline: ");
                    String dealdine = s.nextLine();


                    listTugas.addFirst(new Tugas(mataKuliah, tugas, dealdine));
                    System.out.println("Data berhasil diinput");
                break;
                case 2:
                    System.out.println("Pilih: \n1. Hapus belakang \n2. Hapus depan \n3. Hapus berdasarkan nama mata kuliah \n4. Hapus berdasarkan nama tugas");
                    int pil = s.nextInt();
                    switch(pil) {
                        case 1:
                            listTugas.removeLast();
                            System.out.println("Data di belakang list berhasil dihapus");
                        break;
                        case 2:
                            listTugas.removeFirst();
                            System.out.println("Data di depan list berhasil dihapus");
                        break;
                        case 3:
                            it = listTugas.listIterator();  // reset it

                            System.out.print("Masukkan nama  mata kuliah: ");
                            String matkul = s.next(); s.nextLine();

                            while (it.hasNext()) {
                                Tugas hapus = it.next();
                                if(hapus.getMataKuliah().equals(matkul)) {
                                    it.remove();
                                }
                            }
                            System.out.println("Tugas mata kuliah " + "\"" + matkul + "\"" + " berhasil dihapus dari list");
                        break;
                        case 4:
                            it = listTugas.listIterator();  //reset it biar gaperlu pake it baru, cukup di reset

                            System.out.print("Masukkan nama tugas: ");
                            String nmTugas = s.next(); s.nextLine();

                            while (it.hasNext()) {
                                Tugas hapus = it.next();
                                if(hapus.getTugas().equals(nmTugas)) {
                                    it.remove();
                                }
                            }
                            System.out.println("Tugas berjudul " + "\"" + nmTugas + "\"" + " berhasil dihapus dari list");
                        break;

                 
                    }
                break;
                case 3:
                    for (Tugas i : listTugas) {
                        System.out.println(i);
                        
                    }
                break;
                case 4:
                    s.close();
                    run = false;
                break;
                    
            }

        }


    }
}
