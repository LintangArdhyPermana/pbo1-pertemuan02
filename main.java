import koneksi.Database;
import model.dosen;
import model.mahasiswa;
import model.matakuliah;

public class Main{
public static void main(String[]args){
system.out.println("ini program main");
Database.hubungkan();
dosen.tampilanInfo();
mahasiswa.tampilanInfo();
matakuliah.tampilanInfo();

}
}