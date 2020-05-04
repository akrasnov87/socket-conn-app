package pw.appcode.socketconn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ISocketNotification {
    private SocketManager socketManager;
    private String baseUrl = "http://pocker.appcode.pw";

    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // последний параметр это логин
        socketManager = SocketManager.createInstance(baseUrl, "dGVzdDp0ZXN0", "test");
        socketManager.open(this);

        tvName = findViewById(R.id.name);
    }


    @Override
    public void onNotificationMessage(String type, final String buffer) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvName.setText(buffer);
            }
        });
    }

    @Override
    public void onNotificationDelivered(String buffer) {

    }

    @Override
    public void onNotificationUnDelivered(String buffer) {

    }
}
