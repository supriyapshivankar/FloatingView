package fr.anthonyfernandez.floatingmenu.utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import fr.anthonyfernandez.floatingmenu.R;

/**
 * Created by adube on 12/5/15.
 */
public class ChatWindow extends Activity{

    public static ChatWindow chatWindow;

    private ChatWindow() {
        startService(new Intent());

    }
    public static ChatWindow getInstance() {
        if (chatWindow == null) {
            chatWindow = new ChatWindow();
        }
        return chatWindow;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_layout);

        Button search = (Button)findViewById(R.id.SearchButton);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    @Override
    public LayoutInflater getLayoutInflater() {
        return super.getLayoutInflater();
    }

}
