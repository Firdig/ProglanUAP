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

public class MainApp extends Application {
    private ObservableList<String> historyList = FXCollections.observableArrayList();
    private TextArea historyTextArea = new TextArea();
    private Stage primaryStage;
    private TextField JarijariField;
    private TextField SisiField;
    private TextField PanjangField;
    private TextField LebarField;

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
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk Sisi.");
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
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk Sisi.");
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
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungLuasPersegiPanjang(){
        try {
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            double luas = panjang * lebar;
            String result = String.format("Volume of the sphere with lebar %.2f & panjang %.2f is %.2f", panjang,lebar, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Luas PersegiPanjang - Panjang: " + panjang + "& Luas: "+ lebar+ " -> Volume: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk Sisi.");
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
        JarijariField = new TextField();
        grid.add(JarijariField, 1, 1);

        Label LebarLabel = new Label("lebar:");
        grid.add(LebarLabel, 0, 2);
        JarijariField = new TextField();
        grid.add(JarijariField, 1, 2);

        Button btnKembali = new Button("Kembali");
        Button btnHitung = new Button("Hitung Keliling");
        Button btnHistory = new Button("Show History");

        grid.add(btnHitung, 0, 2, 2, 1);
        grid.add(btnHistory, 1, 4);
        grid.add(btnKembali, 0, 4);


        btnHitung.setOnAction(e -> hitungKelilingPersegiPanjang());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingPersegiPanjang(){
        try {
            double panjang = Double.parseDouble(PanjangField.getText());
            double lebar = Double.parseDouble(LebarField.getText());
            double luas = 2 * (panjang + lebar);
            String result = String.format("Volume of the sphere with radius %.2f & lebar %.2f is %.2f", panjang,lebar, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Keliling PersegPanjang - Panjang: " + panjang + "& Luas: "+ lebar+ " -> Volume: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "mohon masukkan nomor yang valid untuk Sisi.");
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
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungLuasLingkaran(){
        try {
            double jariJari = Double.parseDouble(JarijariField.getText());
            double luas = (2 * Math.PI * jariJari);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", jariJari, luas);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + jariJari + " -> Volume: " + luas);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
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
        Button btnHitung = new Button("Hitung Volume");
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
    public void hitungKelilingLingkaran(){
        try {
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
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


        btnVolume.setOnAction(e -> hitungVolumeKubus());
        btnKeliling.setOnAction(e -> hitungKelilingKubus());
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


        btnVolume.setOnAction(e -> hitungVolumeBalok());
        btnKeliling.setOnAction(e -> hitungKelilingBalok());
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


        btnHitung.setOnAction(e -> hitungVolumeKubus());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungVolumeKubus(){
        try {
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
        }
    }
    private void KelilingKubus(){

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


        btnHitung.setOnAction(e -> hitungKelilingKubus());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showKubus());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingKubus(){
        try {
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
        }
    }
    private void VolumeBalok(){

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


        btnHitung.setOnAction(e -> hitungVolumeBalok());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBola());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungVolumeBalok(){
        try {
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
        }
    }
    private void KelilingBalok(){

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


        btnHitung.setOnAction(e -> hitungKelilingBalok());
        btnHistory.setOnAction(e -> showHistory());
        btnKembali.setOnAction(e -> showBola());

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
    }
    public void hitungKelilingBalok(){
        try {
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
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
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
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
            double radius = Double.parseDouble(JarijariField.getText());
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            String result = String.format("Volume of the sphere with radius %.2f is %.2f", radius, volume);

            // Display the result
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            alert.setContentText(result);
            alert.show();
            saveHistory("Volume Bola - Radius: " + radius + " -> Volume: " + volume);
            // Add result to history list
            historyList.add(result);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid number for the radius.");
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
