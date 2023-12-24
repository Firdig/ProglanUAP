package org.example;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BangunDatarRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuAwal, menuBangunDatar, menuBangunRuang, menuPersegi, menuPersegiPanjang, menuLingkaran, menuKubus, menuBalok,menuBola;
        double hasil ;
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("history.txt", true));
            do {
                System.out.println("Menu Awal");
                System.out.println("1. Bangun Datar");
                System.out.println("2. Bangun Ruang");
                System.out.println("3. Keluar");
                menuAwal = input.nextInt();

                switch (menuAwal) {
                    case 1:
                        do {
                            System.out.println("Menu Bangun Datar");
                            System.out.println("1. Persegi");
                            System.out.println("2. Persegi Panjang");
                            System.out.println("3. Lingkaran");
                            System.out.println("4. Kembali");
                            menuBangunDatar = input.nextInt();

                            switch (menuBangunDatar) {
                                case 1:
                                    do {
                                        System.out.println("Menu Persegi");
                                        System.out.println("1. Menghitung Luas");
                                        System.out.println("2. Menghitung Keliling");
                                        System.out.println("3. Kembali");
                                        menuPersegi = input.nextInt();

                                        if (menuPersegi == 1) {
                                            try {
                                                System.out.println("Masukkan sisi persegi: ");
                                                double sisi = input.nextDouble();
                                                if (sisi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (sisi * sisi);
                                                System.out.println("Luas persegi adalah: " + hasil);
                                                writer.write("Bangundatar, Persegi, Luas, " + hasil + "\n");
                                                writer.flush();
                                            }catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }

                                        } else if (menuPersegi == 2) {
                                            try {
                                                System.out.println("Masukkan sisi persegi: ");
                                                double sisi = input.nextDouble();
                                                if (sisi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (4 * sisi);
                                                System.out.println("Luas persegi adalah: " + hasil);
                                                writer.write("Bangundatar, Persegi, Luas, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }
                                        }
                                    } while (menuPersegi != 3);
                                    break;

                                case 2:
                                    do {
                                        System.out.println("Menu Persegi Panjang");
                                        System.out.println("1. Menghitung Luas");
                                        System.out.println("2. Menghitung Keliling");
                                        System.out.println("3. Kembali");
                                        menuPersegiPanjang = input.nextInt();

                                        if (menuPersegiPanjang == 1) {
                                            try {
                                                System.out.println("Masukkan panjang persegi panjang: ");
                                                double panjang = input.nextDouble();
                                                System.out.println("Masukkan lebar persegi panjang: ");
                                                double lebar = input.nextDouble();
                                                if (panjang <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                if (lebar <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (panjang * lebar);
                                                System.out.println("Luas persegi panjang adalah: " + hasil);
                                                writer.write("Bangundatar, PersegiPanjang, Keliling, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }


                                        } else if (menuPersegiPanjang == 2) {try {
                                            System.out.println("Masukkan panjang persegi panjang: ");
                                            double panjang = input.nextDouble();
                                            System.out.println("Masukkan lebar persegi panjang: ");
                                            double lebar = input.nextDouble();
                                            if (panjang <= 0) {
                                                throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                            }
                                            if (lebar <= 0) {
                                                throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                            }
                                            hasil = (2 * (panjang + lebar));
                                            System.out.println("Keliling persegi panjang adalah: " + hasil);
                                            writer.write("Bangundatar, PersegiPanjang, Keliling, " + hasil + "\n");
                                            writer.flush();
                                        } catch (InputMismatchException | IOException e) {
                                            System.out.println(e.getMessage());
                                            input.nextLine(); // Clear the buffer
                                        }

                                        }
                                    } while (menuPersegiPanjang != 3);
                                    break;

                                case 3:
                                    do {
                                        System.out.println("Menu Lingkaran");
                                        System.out.println("1. Menghitung Luas");
                                        System.out.println("2. Menghitung Keliling");
                                        System.out.println("3. Kembali");
                                        menuLingkaran = input.nextInt();

                                        if (menuLingkaran == 1) {
                                            try {
                                                System.out.println("Masukkan jari-jari lingkaran: ");
                                                double jariJari = input.nextDouble();
                                                if (jariJari <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (Math.PI * jariJari * jariJari);
                                                System.out.println("Luas lingkaran adalah: " + hasil);
                                                writer.write("Bangundatar, PersegiPanjang, Keliling, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }


                                        } else if (menuLingkaran == 2) {
                                            try {
                                                System.out.println("Masukkan jari-jari lingkaran: ");
                                                double jariJari = input.nextDouble();
                                                if (jariJari <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (2 * Math.PI * jariJari);
                                                System.out.println("Keliling lingkaran adalah: " + hasil);
                                                writer.write("Bangundatar, PersegiPanjang, Keliling, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }
                                        }
                                    } while (menuLingkaran != 3);
                                    break;
                            }
                        } while (menuBangunDatar != 4);
                        break;

                    case 2:
                        do {
                            System.out.println("Menu Bangun Ruang");
                            System.out.println("1. Kubus");
                            System.out.println("2. Balok");
                            System.out.println("3. Bola");
                            System.out.println("4. kembali");
                            menuBangunRuang = input.nextInt();

                            switch (menuBangunRuang) {
                                case 1:
                                    do {
                                        System.out.println("Menu Kubus");
                                        System.out.println("1. Menghitung Volume");
                                        System.out.println("2. Menghitung Keliling Luas");
                                        System.out.println("3. Kembali");
                                        menuKubus = input.nextInt();

                                        if (menuKubus == 1) {
                                            try {
                                                System.out.println("Masukkan sisi kubus: ");
                                                double sisi = input.nextDouble();
                                                if (sisi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil= (sisi * sisi * sisi);
                                                System.out.println("Volume kubus adalah: " + hasil);
                                                writer.write("BangunRuang, Kubus, Volume, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }


                                        } else if (menuKubus == 2) {
                                            try {
                                                System.out.println("Masukkan sisi kubus: ");
                                                double sisi = input.nextDouble();
                                                if (sisi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (6 * sisi * sisi);
                                                System.out.println("Keliling luas kubus adalah: " + hasil);
                                                writer.write("BangunRuang, Kubus, Keliling, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }
                                        }
                                    } while (menuKubus != 3);
                                    break;

                                case 2:
                                    do {
                                        System.out.println("Menu Balok");
                                        System.out.println("1. Menghitung Volume");
                                        System.out.println("2. Menghitung Keliling Luas");
                                        System.out.println("3. Kembali");
                                        menuBalok = input.nextInt();

                                        if (menuBalok == 1) {
                                            try {
                                                System.out.println("Masukkan panjang balok: ");
                                                double panjang = input.nextDouble();
                                                System.out.println("Masukkan lebar balok: ");
                                                double lebar = input.nextDouble();
                                                System.out.println("Masukkan tinggi balok: ");
                                                double tinggi = input.nextDouble();
                                                if (panjang <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                if (lebar <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                if (tinggi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (panjang * lebar * tinggi);
                                                System.out.println("Volume balok adalah: " + hasil);
                                                writer.write("BangunRuang, Balok, Volume, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }


                                        } else if (menuBalok == 2) {
                                            try {
                                                System.out.println("Masukkan panjang balok: ");
                                                double panjang = input.nextDouble();
                                                System.out.println("Masukkan lebar balok: ");
                                                double lebar = input.nextDouble();
                                                System.out.println("Masukkan tinggi balok: ");
                                                double tinggi = input.nextDouble();
                                                if (panjang <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                if (lebar <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                if (tinggi <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil= 2 * (panjang + lebar + tinggi );
                                                System.out.println("Keliling luas balok adalah: " + hasil );
                                                writer.write("BangunRuang, balok, Keliling, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }
                                        }
                                    } while (menuBalok != 3);
                                    break;
                                case 3:
                                    do {
                                        System.out.println("Menu bola");
                                        System.out.println("1. Menghitung Volume");
                                        System.out.println("2. Menghitung Keliling ");
                                        System.out.println("3. Kembali");
                                        menuBola = input.nextInt();

                                        if (menuBola == 1) {
                                            try {
                                                System.out.println("Masukkan Jari-Jari bola: ");
                                                double jariJari = input.nextDouble();
                                                if (jariJari <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = (2 * Math.PI * jariJari);
                                                System.out.println("Volume bola adalah: " + hasil);
                                                writer.write("BangunRuang, Bola, Volume, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }


                                        } else if (menuBola == 2) {
                                            try {
                                                System.out.println("Masukkan Jari-Jari bola: ");
                                                double jariJari = input.nextDouble();
                                                if (jariJari <= 0) {
                                                    throw new InputMismatchException("Sisi harus lebih dari 0. Silakan coba lagi.");
                                                }
                                                hasil = ((4 / 3) * Math.PI * (jariJari * jariJari * jariJari));
                                                System.out.println("Keliling  bola adalah: " + hasil);
                                                writer.write("BangunRuang, Bola, Volume, " + hasil + "\n");
                                                writer.flush();
                                            } catch (InputMismatchException | IOException e) {
                                                System.out.println(e.getMessage());
                                                input.nextLine(); // Clear the buffer
                                            }

                                        }
                                    } while (menuBola != 3);
                                    break;
                            }
                        } while (menuBangunRuang != 3);
                        break;
                }
            }
            while (menuAwal != 3);
        } catch (IOException e) {
            System.out.println("Error writing to history file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the writer: " + e.getMessage());
            }
        }
    }
}