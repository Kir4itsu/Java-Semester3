class Bulan
{
public static void main(String[] args)
{
// Langkah 1: deklarasi variabel aray
int monthDays[];

// Langkah 2: penciptaan array bilangan int dengan 12 elemen
monthDays = new int[12];
monthDays[0] = 31;

monthDays[1] = 29;

monthDays[2] = 31;

monthDays[3] = 30;

monthDays[4] = 31;

monthDays[5] = 30;

monthDays[6] = 31;

monthDays[7] = 31;

monthDays[8] = 30;

monthDays[9] = 31;

monthDays[10] = 30;

monthDays[11] = 31;
System.out.println("Agustus mempunyai "+monthDays[7]+"hari");
}
}