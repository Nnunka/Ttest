package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.List;

public class wifi extends AppCompatActivity {

    TextView txtWifiInfo;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        txtWifiInfo = (TextView) findViewById(R.id.idTxt);
        btnInfo = (Button) findViewById(R.id.idBtn);

    }

    public void getWifiInformation(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();

        int ip = wifiInfo.getIpAddress();
        String ipAddress = Formatter.formatIpAddress(ip);
        String bssid = wifiInfo.getBSSID();
        String ssid = wifiInfo.getSSID();
        int rssi = wifiInfo.getRssi();


        String info =
                "\n Adres IP: " + ipAddress +
                "\n Adres MAC Routera: " + bssid +
                "\n SSID: " + ssid +
                "\n Wskaźnik mocy: " + rssi;

        txtWifiInfo.setText(info);

    }
}