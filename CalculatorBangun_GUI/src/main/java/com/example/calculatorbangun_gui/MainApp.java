package com.example.calculatorbangun_gui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.*;
import java.util.InputMismatchException;

public class MainApp extends Application {
    private ObservableList<String> historyList = FXCollections.observableArrayList();
    private TextArea historyTextArea = new TextArea();
    private Stage primaryStage;
    private TextField JarijariField;
    private TextField SisiField;
    private TextField PanjangField;
    private TextField LebarField;
    private TextField TinggiField;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Aplikasi Bangun Datar dan Ruang");

        // Menu Utama
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);

        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(5);
        Button btnBangunDatar = new Button("Bangun Datar");
        Button btnBangunRuang = new Button("Bangun Ruang");
        Button btnKeluar = new Button("Keluar");
        Button btnhistory =new Button("History");

        btnBangunDatar.setOnAction(e -> menuBangunDatar());
        btnBangunRuang.setOnAction(e -> menuBangunRuang());
        btnKeluar.setOnAction(e -> primaryStage.close());
        btnhistory.setOnAction(e -> showHistory());

        grid.add(btnBangunDatar, 1, 0);
        grid.add(btnBangunRuang, 2, 0);
        grid.add(btnKeluar, 0, 3 );
        grid.add(btnhistory, 3, 3 );

        Scene scene = new Scene(grid,325,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void menuBangunDatar() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnPersegi = new Button("Persegi");
        Button btnPersegiPanjang = new Button("Persegi Panjang");
        Button btnLingkaran = new Button("Lingkaran");
        Button btnKembali = new Button("Kembali");
        Button btnHistory = new Button("History");
        grid.setVgap(5);


        btnPersegi.setOnAction(e ->showPersegi());
        btnPersegiPanjang.setOnAction(e -> showPersegiPanjang());
        btnLingkaran.setOnAction(e -> showLingkaran());
        btnKembali.setOnAction(e -> start(primaryStage));
        btnHistory.setOnAction(e -> showHistory());

        grid.add(btnPersegi, 1, 0);
        grid.add(btnPersegiPanjang, 2, 0);
        grid.add(btnLingkaran, 3, 0);
        grid.add(btnKembali, 0, 3 );
        grid.add(btnHistory, 4, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void menuBangunRuang() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnKubus = new Button("Kubus");
        Button btnBalok = new Button("Balok");
        Button btnBola = new Button("Bola");
        Button btnKembali = new Button("Kembali");
        Button btnHistory = new Button("History");
        grid.setVgap(5);


        btnKubus.setOnAction(e -> showKubus());
        btnBalok.setOnAction(e -> showBalok());
        btnBola.setOnAction(e -> showBola());
        btnKembali.setOnAction(e -> start(primaryStage));
        btnHistory.setOnAction(e -> showHistory());

        grid.add(btnKubus, 1, 0);
        grid.add(btnBalok, 2, 0);
        grid.add(btnBola, 3, 0);
        grid.add(btnKembali, 0, 3 );
        grid.add(btnHistory, 4, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    public void showPersegi() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas Persegi");
        Button btnKeliling = new Button("Keliling Persegi");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> LuasPersegi());
        btnKeliling.setOnAction(e -> KelilingPersegi());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    private void showPersegiPanjang() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas PersegiPanjang");
        Button btnKeliling = new Button("Keliling PersegiPanjang");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> LuasPersegiPanjang());
        btnKeliling.setOnAction(e -> KelilingPersegiPanjang());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }
    private void showLingkaran() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas Lingkaran");
        Button btnKeliling = new Button("Keliling Lingkaran");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> LuasLingkaran());
        btnKeliling.setOnAction(e -> KelilingLingkaran());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }
    public void LuasPersegi(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label sisi = new Label("Sisi:");
        grid.add(sisi, 0, 1);

        SisiField = new TextField();
        grid.add(SisiField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungLuasPersegi());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showPersegi());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungLuasPersegi(){
        try {
            double sisi = Double.parseDouble(SisiField.getText());
            if (sisi <= 0 || sisi >= 10000) {
                throw new InputMismatchException("sisi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double luas = sisi * sisi;
            String result = String.format("Luas dari persegi dengan sisi %.2f is %.2f", sisi, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Luas Persegi - Sisi: " + sisi + " -> Luas: " + luas);
            // Add result to history list
            historyList.add(result);
        }catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk sisi (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingPersegi(){
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label sisi = new Label("Panjang:");
        grid.add(sisi, 0, 1);

        SisiField = new TextField();
        grid.add(SisiField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Sisi");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungKelilingPersegi());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showPersegi());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingPersegi(){
        try {
            double sisi = Double.parseDouble(SisiField.getText());
            if (sisi <= 0 || sisi >= 10000) {
                throw new InputMismatchException("sisi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double luas = (4 * sisi);
            String result = String.format("Luas dari persegi dengan sisi %.2f is %.2f", sisi, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Luas Persegi - Sisi: " + sisi + " -> Luas: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk sisi (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void LuasPersegiPanjang(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label PanjangLabel = new Label("Panjang:");
        grid.add(PanjangLabel, 0, 1);
        PanjangField = new TextField();
        grid.add(PanjangField, 1, 1);

        Label LebarLabel = new Label("lebar:");
        grid.add(LebarLabel, 0, 2);
        LebarField = new TextField();
        grid.add(LebarField, 1, 2);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Luas");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 3, 2, 1);
        grid.add(btnHistory, 1, 5);
        grid.add(btnKembali, 0, 5);


        btnHitung.setOnAction(e -> hitungLuasPersegiPanjang());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showPersegiPanjang());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungLuasPersegiPanjang(){
        try {
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            if (panjang <= 0 || panjang >= 10000) {
                throw new InputMismatchException("panjang harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (lebar <= 0 || lebar >= 10000) {
                throw new InputMismatchException("lebar harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double luas = panjang * lebar;
            String result = String.format("Volume of the sphere with lebar %.2f & panjang %.2f is %.2f", panjang,lebar, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Luas PersegiPanjang - Panjang: " + panjang + " & Luas: "+ lebar+ " -> Volume: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk panjang dan lebar (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingPersegiPanjang(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label PanjangLabel = new Label("Panjang:");
        grid.add(PanjangLabel, 0, 1);
        PanjangField = new TextField();
        grid.add(PanjangField, 1, 1);

        Label LebarLabel = new Label("lebar:");
        grid.add(LebarLabel, 0, 2);
        LebarField = new TextField();
        grid.add(LebarField, 1, 2);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Keliling");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 3, 2, 1);
        grid.add(btnHistory, 1, 5);
        grid.add(btnKembali, 0, 5);


        btnHitung.setOnAction(e -> hitungKelilingPersegiPanjang());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showPersegiPanjang());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingPersegiPanjang(){
        try {
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            if (panjang <= 0 || panjang >= 10000) {
                throw new InputMismatchException("panjang harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (lebar <= 0 || lebar >= 10000) {
                throw new InputMismatchException("lebar harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double luas = 2 * (panjang + lebar);
            String result = String.format("Volume of the sphere with radius %.2f & lebar %.2f is %.2f", panjang,lebar, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling PersegPanjang - Panjang: " + panjang + " & Luas: "+ lebar+ " -> Volume: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk panjang dan lebar (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void LuasLingkaran(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Jarijari:");
        grid.add(JarijariLabel, 0, 1);

        JarijariField = new TextField();
        grid.add(JarijariField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Luas");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungLuasLingkaran());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showLingkaran());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungLuasLingkaran(){
        try {
            double jariJari = Double.parseDouble(JarijariField.getText());
            if (jariJari <= 0 || jariJari >= 10000) {
                throw new InputMismatchException("Jarijari harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double luas = (Math.PI * jariJari * jariJari);
            String result = String.format("Luas dari Lingkaran dengan Jarijari : %.2f adalah %.2f", jariJari, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling Lingkaran - Jari-jari: " + jariJari + " -> Keliling: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk JariJari (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingLingkaran(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Jarijari:");
        grid.add(JarijariLabel, 0, 1);

        JarijariField = new TextField();
        grid.add(JarijariField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Keliling");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungKelilingLingkaran());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showLingkaran());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingLingkaran(){
        try {
            double jariJari = Double.parseDouble(JarijariField.getText());
            if (jariJari <= 0 || jariJari >= 10000) {
                throw new InputMismatchException("Jarijari harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double keliling = (2 * Math.PI * jariJari);
            String result = String.format("Keliling dari Lingkaran dengan Jarijari : %.2f adalah %.2f", jariJari, keliling);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling Lingkaran - Jari-jari: " + jariJari + " -> Keliling: " + keliling);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk JariJari (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }

    private void showKubus() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnVolume = new Button("Volume Kubus");
        Button btnKeliling = new Button("Keliling Kubus");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> VolumeKubus());
        btnKeliling.setOnAction(e -> KelilingKubus());
        btnKembali.setOnAction(e -> menuBangunRuang());


        grid.add(btnVolume, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );


        Scene scene = new Scene(grid, 300, 110);
        primaryStage.setScene(scene);
    }

    private void showBalok() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnVolume = new Button("Volume Balok");
        Button btnKeliling = new Button("Keliling Balok");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> VolumeBalok());
        btnKeliling.setOnAction(e -> KelilingBalok());
        btnKembali.setOnAction(e -> menuBangunRuang());

        grid.add(btnVolume, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid, 300, 110);
        primaryStage.setScene(scene);
    }

    private void showBola() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));
        Button btnVolume = new Button("Volume Bola");
        Button btnKeliling = new Button("Keliling Bola");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> VolumeBola());
        btnKeliling.setOnAction(e -> KelilingBola());
        btnKembali.setOnAction(e -> menuBangunRuang());

        grid.add(btnVolume, 1, 1);
        grid.add(btnKeliling, 2, 1);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid, 300, 140);
        primaryStage.setScene(scene);
    }



    private void VolumeKubus(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label SisiLabel = new Label("Sisi:");
        grid.add(SisiLabel, 0, 1);

        SisiField = new TextField();
        grid.add(SisiField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungVolumeKubus());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungVolumeKubus(){
        try {
            double sisi = Double.parseDouble(SisiField.getText());
            if (sisi <= 0 || sisi >= 10000) {
                throw new InputMismatchException("sisi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double volume = sisi*sisi*sisi;
            String result = String.format("Volume Kubus dengan Sisi %.2f Adalah %.2f", sisi, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Kubus - Sisi: " + sisi + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk sisi (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingKubus(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Sisi:");
        grid.add(JarijariLabel, 0, 1);

        SisiField = new TextField();
        grid.add(SisiField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Keliling");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungKelilingKubus());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingKubus(){
        try {
            double sisi = Double.parseDouble(SisiField.getText());
            if (sisi <= 0 || sisi >= 10000) {
                throw new InputMismatchException("sisi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }

            double keliling = 6*sisi*sisi;
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", sisi, keliling);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling Kubus - Sisi: " + sisi + " -> Keliling: " + keliling);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk sisi (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void VolumeBalok(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Tinggi:");
        grid.add(JarijariLabel, 0, 1);

        TinggiField = new TextField();
        grid.add(TinggiField, 1, 1);

        Label PanjangLabel = new Label("Panjang:");
        grid.add(PanjangLabel, 0, 2);
        PanjangField = new TextField();
        grid.add(PanjangField, 1, 2);

        Label LebarLabel = new Label("lebar:");
        grid.add(LebarLabel, 0, 3);
        LebarField = new TextField();
        grid.add(LebarField, 1, 3);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 4, 2, 1);
        grid.add(btnHistory, 1, 6);
        grid.add(btnKembali, 0, 6);


        btnHitung.setOnAction(e -> hitungVolumeBalok());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBalok());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungVolumeBalok(){
        try {
            double tinggi = Double.parseDouble(TinggiField.getText());
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            if (tinggi <= 0 || tinggi >= 10000) {
                throw new InputMismatchException("tinggi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (panjang <= 0 || panjang >= 10000) {
                throw new InputMismatchException("panjang harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (lebar <= 0 || lebar >= 10000) {
                throw new InputMismatchException("lebar harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }

            double volume = panjang*lebar*tinggi;
            String result = String.format("Volume balok dengan Tinggi %.2f ,Panjang %.2f, Lebar %.2f adalah %.2f", tinggi,panjang,lebar, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Balok - Tinggi: " + tinggi + " - Panjang: " + panjang + " - Lebar: " + tinggi + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk tinggi,panjang dan lebar (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingBalok(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Tinggi:");
        grid.add(JarijariLabel, 0, 1);

        TinggiField = new TextField();
        grid.add(TinggiField, 1, 1);

        Label PanjangLabel = new Label("Panjang:");
        grid.add(PanjangLabel, 0, 2);
        PanjangField = new TextField();
        grid.add(PanjangField, 1, 2);

        Label LebarLabel = new Label("lebar:");
        grid.add(LebarLabel, 0, 3);
        LebarField = new TextField();
        grid.add(LebarField, 1, 3);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 4, 2, 1);
        grid.add(btnHistory, 1, 6);
        grid.add(btnKembali, 0, 6);


        btnHitung.setOnAction(e -> hitungKelilingBalok());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBalok());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingBalok(){
        try {
            double tinggi = Double.parseDouble(TinggiField.getText());
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            if (tinggi <= 0 || tinggi >= 10000) {
                throw new InputMismatchException("tinggi harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (panjang <= 0 || panjang >= 10000) {
                throw new InputMismatchException("panjang harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            if (lebar <= 0 || lebar >= 10000) {
                throw new InputMismatchException("lebar harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double volume = 2*(panjang+lebar+tinggi);
            String result = String.format("Volume balok dengan Tinggi %.2f ,Panjang %.2f, Lebar %.2f adalah %.2f", tinggi,panjang,lebar, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Balok - Tinggi: " + tinggi + " - Panjang: " + panjang + " - Lebar: " + tinggi + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk tinggi,panjang dan lebar (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void VolumeBola(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Jarijari:");
        grid.add(JarijariLabel, 0, 1);

        JarijariField = new TextField();
        grid.add(JarijariField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungVolumeBola());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBola());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungVolumeBola(){
        try {
            double jarijari = Double.parseDouble(JarijariField.getText());
            if (jarijari <= 0 || jarijari >= 10000) {
                throw new InputMismatchException("Jarijari harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jarijari, 3);
            String result = String.format("Volume bola dengan radius %.2f adalah %.2f", jarijari, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - jarijari: " + jarijari + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk Jari-jari (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }
    private void KelilingBola(){

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label JarijariLabel = new Label("Jarijari:");
        grid.add(JarijariLabel, 0, 1);

        JarijariField = new TextField();
        grid.add(JarijariField, 1, 1);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Volume");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungKelilingBola());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBola());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingBola(){
        try {
            double jariJari = Double.parseDouble(JarijariField.getText());
            if (jariJari <= 0 || jariJari >= 10000) {
                throw new InputMismatchException("Jarijari harus lebih dari 0 dan tidak boleh dari 10000. Silakan coba lagi.");
            }
            double keliling = ((4 / 3) * Math.PI * (jariJari * jariJari * jariJari));
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", jariJari, keliling);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling Bola - Jarijari: " + jariJari + " -> Volume: " + keliling);
            // Add result to history list
            historyList.add(result);
        } catch (InputMismatchException | NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk JariJari (nomor tidak boleh kurang dari 0 dan tidak boleh dari 9999.");
        }
    }

    public void showHistory() {
        StringBuilder historyText = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("history.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                historyText.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        historyTextArea.setText(historyText.toString());

        Stage historyStage = new Stage();
        historyStage.setTitle("History");
        historyStage.setScene(new Scene(new ScrollPane(historyTextArea), 400, 300));
        historyStage.show();
    }
    public void saveToFile(String calculation) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("history.txt", true))) {
            writer.write(calculation + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveHistory(String calculation) {
        historyList.add(calculation);
        saveToFile(calculation);
    }

    public void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
