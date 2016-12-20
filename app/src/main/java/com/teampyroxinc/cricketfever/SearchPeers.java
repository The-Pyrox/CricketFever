package com.teampyroxinc.cricketfever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchPeers extends AppCompatActivity implements DeviceListFragment.DeviceActionListener,WifiP2pManager.ConnectionInfoListener{
    WifiP2pManager mManager;
    WifiP2pManager.Channel mChannel;
    BroadcastReceiver mReceiver;
    IntentFilter mIntentFilter;
    private List<WifiP2pDevice> peers = new ArrayList<WifiP2pDevice>();
    private WifiP2pDevice device;
    private WifiP2pManager.ConnectionInfoListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_peers);

        listener = new WifiP2pManager.ConnectionInfoListener() {
            @Override
            public void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                if (wifiP2pInfo.groupFormed && wifiP2pInfo.isGroupOwner){
                    Intent i = new Intent(SearchPeers.this,Server_batting_first.class);
                    startActivity(i);
                }
                else if (wifiP2pInfo.groupFormed){
                    Intent j = new Intent(SearchPeers.this,Server_bowling_first.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Host",wifiP2pInfo.groupOwnerAddress.getHostAddress());
                    j.putExtras(bundle);
                    startActivity(j);
                }
            }
        };

        mManager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);
        mChannel = mManager.initialize(this, getMainLooper(), null);
        mReceiver = new WifiBroadcastReciever(mManager, mChannel, this);

        mIntentFilter = new IntentFilter();
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);
    }

    @Override
    public void onConnectionInfoAvailable(WifiP2pInfo info) {

    }

    @Override
    public void connect(WifiP2pConfig config) {
        mManager.connect(mChannel, config, new WifiP2pManager.ActionListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(SearchPeers.this, "Connection Successful", Toast.LENGTH_SHORT).show();
                mManager.requestConnectionInfo(mChannel,listener);
            }

            @Override
            public void onFailure(int i) {
                Toast.makeText(SearchPeers.this,"Connection Failed",Toast.LENGTH_LONG).show();
            }
        });

    }
}
