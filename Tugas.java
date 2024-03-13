public class Tugas {
    String mataKuliah;
    String tugas;
    String deadline;


    public Tugas(String mataKuliah, String tugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.deadline = deadline;
    }


    public String getTugas() {
        return tugas;
    }


    public String getMataKuliah() {
        return mataKuliah;
    }


    @Override
    public String toString() {
        return "Tugas [Mata Kuliah: " + mataKuliah + ", Tugas: " + tugas + ", Deadline: " + deadline + "]";
    }


    
    
    
}