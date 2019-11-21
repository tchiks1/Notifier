package be.com.notifier;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NotifierMessage extends AppCompatActivity {

    private final static NotifierMessage INSTANCE = new NotifierMessage();
    static LayoutInflater inflater;
    static Toast toast;
    static TextView text;

    public static void s(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_LONG).show();
    }

    public static NotifierMessage success(Activity activity, String message){

        inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) activity.findViewById(R.id.custom_toast_layout));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.colorAccent));

        text = layout.findViewById(R.id.text);
        text.setText(message);

        toast = new Toast(activity);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        return INSTANCE;
        
    }

}




