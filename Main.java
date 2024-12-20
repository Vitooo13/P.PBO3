public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan ridho = new Karyawan("12345", "Ridho");

        ridho.getInfo();
        ridho.absenPagi();
        ridho.kerja();
        ridho.absenPulang();

        Karyawan melan = new Karyawan("12346", "Melan");

        melan.getInfo();
        melan.absenPagi();
        melan.kerja();
        melan.absenPulang();

        Dosen andiani = new Dosen("23455", "332211", "Andiani");

        andiani.getInfo();
        andiani.absenPagi();
        andiani.ngajar();
        andiani.absenPulang();

        Dosen ionia = new Dosen("23456", "332212", "Ionia");

        ionia.getInfo();
        ionia.absenPagi();
        ionia.ngajar();
        ionia.absenPulang();
    }
}