package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wifi extends AppCompatActivity {

    TextView txtWifiInfo;
    Button btnInfo;

    private TextView wifiSwitch;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        txtWifiInfo = (TextView) findViewById(R.id.idTxt);
        btnInfo = (Button) findViewById(R.id.idBtn);

        wifiSwitch = findViewById(R.id.wifi_switch);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(true);

    }


    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(wifiStateReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(wifiStateReceiver);
    }

    private BroadcastReceiver wifiStateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int wifiStateExtra = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
                    WifiManager.WIFI_STATE_UNKNOWN);

            switch (wifiStateExtra) {
                case WifiManager.WIFI_STATE_ENABLED:
                    wifiSwitch.setText("WiFi jest włączone, można pobrać informacje");
                    break;
                case WifiManager.WIFI_STATE_DISABLED:

                    wifiSwitch.setText("WiFi jest wyłączone, włącz aby pobrać informacje");
                    break;
            }
        }
    };


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