package com.example.calculatorbangun_gui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.ButtonSkin;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;


public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Aplikasi Bangun Datar dan Ruang");

        // Menu Utama
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(5);
        Button btnBangunDatar = new Button("Bangun Datar");
        Button btnBangunRuang = new Button("Bangun Ruang");
        Button btnKeluar = new Button("Keluar");
        Button btnhistory =new Button("History");

        btnBangunDatar.setOnAction(e -> menuBangunDatar());
        btnBangunRuang.setOnAction(e -> menuBangunRuang());
        btnKeluar.setOnAction(e -> primaryStage.close());
        btnhistory.setOnAction(e -> history());

        grid.add(btnBangunDatar, 1, 0);
        grid.add(btnBangunRuang, 2, 0);
        grid.add(btnKeluar, 0, 3 );
        grid.add(btnhistory, 3, 3 );

        Scene scene = new Scene(grid,325,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void menuBangunDatar() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnPersegi = new Button("Persegi");
        Button btnPersegiPanjang = new Button("Persegi Panjang");
        Button btnLingkaran = new Button("Lingkaran");
        Button btnKembali = new Button("Kembali");
        Button btnHistory = new Button("History");
        grid.setVgap(5);


        btnPersegi.setOnAction(e -> showPersegi());
        btnPersegiPanjang.setOnAction(e -> showPersegiPanjang());
        btnLingkaran.setOnAction(e -> showLingkaran());
        btnKembali.setOnAction(e -> start(primaryStage));
        btnHistory.setOnAction(e -> history());

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
        btnHistory.setOnAction(e -> history());

        grid.add(btnKubus, 1, 0);
        grid.add(btnBalok, 2, 0);
        grid.add(btnBola, 3, 0);
        grid.add(btnKembali, 0, 3 );
        grid.add(btnHistory, 4, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    private void showPersegi() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas Persegi");
        Button btnKeliling = new Button("Keliling Persegi");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    private void showPersegiPanjang() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas PersegiPanjang");
        Button btnKeliling = new Button("Keliling PersegiPanjang");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    private void showLingkaran() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnLuas = new Button("Luas Lingkaran");
        Button btnKeliling = new Button("Keliling Lingkaran");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnLuas.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunDatar());

        grid.add(btnLuas, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
    }

    private void showKubus() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnVolume = new Button("Volume Kubus");
        Button btnKeliling = new Button("Keliling Kubus");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunRuang());


        grid.add(btnVolume, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );


        Scene scene = new Scene(grid, 300, 110);
        primaryStage.setScene(scene);
    }

    private void showBalok() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));

        Button btnVolume = new Button("Volume Balok");
        Button btnKeliling = new Button("Keliling Balok");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunRuang());

        grid.add(btnVolume, 1, 0);
        grid.add(btnKeliling, 2, 0);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid, 300, 110);
        primaryStage.setScene(scene);
    }

    private void showBola() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        Button btnVolume = new Button("Volume Bola");
        Button btnKeliling = new Button("Keliling Bola");
        Button btnKembali = new Button("Kembali");

        grid.setVgap(5);


        btnVolume.setOnAction(e -> showKubus());
        btnKeliling.setOnAction(e -> showBalok());
        btnKembali.setOnAction(e -> menuBangunRuang());

        grid.add(btnVolume, 1, 1);
        grid.add(btnKeliling, 2, 1);
        grid.add(btnKembali, 0, 3 );

        Scene scene = new Scene(grid, 300, 140);
        primaryStage.setScene(scene);
    }
    private void history(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
