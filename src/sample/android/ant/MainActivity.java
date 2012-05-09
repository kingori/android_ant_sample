package sample.android.ant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ((TextView)findViewById(R.id.tv_server)).setText( "target server: "+ MyApp.config.getServer().name());
        ((TextView)findViewById(R.id.tv_proxy)).setText( "use proxy: " + MyApp.config.isUseProxy() );
    }
}
