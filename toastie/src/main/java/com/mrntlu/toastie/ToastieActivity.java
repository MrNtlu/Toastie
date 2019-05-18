package com.mrntlu.toastie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class ToastieActivity {
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    private Context context;
    private Drawable icon;
    private String message;
    private int cardBackgroundColor;

    public ToastieActivity() {
    }

    public ToastieActivity(Context context){
        this.context=context;
        this.icon=context.getDrawable(R.drawable.ic_warning_white_24dp);
        this.cardBackgroundColor=android.R.color.holo_red_light;
    }

    public ToastieActivity setIcon(Drawable icon) {
        this.icon = icon;
        return this;
    }

    public ToastieActivity setMessage(String message) {
        this.message = message;
        return this;
    }

    public ToastieActivity setCardBackgroundColor(int cardBackgroundColor) {
        this.cardBackgroundColor = cardBackgroundColor;
        return this;
    }

    public Toast createToast(){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view=inflater.inflate(R.layout.toasty_layout,null);
        CardView cardView=view.findViewById(R.id.cardView);
        ImageView toastIcon=view.findViewById(R.id.toastIcon);
        TextView toastMessage=view.findViewById(R.id.toastMessage);

        cardView.setCardBackgroundColor(cardBackgroundColor);
        toastIcon.setImageDrawable(context.getDrawable(R.drawable.ic_warning_white_24dp));
        toastMessage.setText(message);

        Toast toast=new Toast(context);
        toast.setView(view);
        return toast;
    }

    public static Toast makeToast(Context context, String message, Drawable icon, int cardBackgroundColor, int duration){
        return new ToastieActivity(context)
                .setIcon(icon)
                .setMessage(message)
                .setCardBackgroundColor(cardBackgroundColor)
                .createToast();
    }
}
