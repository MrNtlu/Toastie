package com.mrntlu.toastie;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

/**
 * Created by MrNtlu on 19.05.2019.
 */

public class ToastieActivity {

    private Context context;
    private int icon=R.drawable.ic_warning_white_24dp;
    private String message="No text!";
    private int cardBackgroundColor=android.R.color.black;
    private float cardElevation=4;
    private float cardCornerRadius=8;
    private float textSize=16;
    private Typeface typeface=Typeface.DEFAULT;
    private int gravity=-91;
    private int xOffset;
    private int yOffset;

    public ToastieActivity() {
    }

    public ToastieActivity(Context context){
        this.context=context;
    }

    public ToastieActivity setIcon(int icon) {
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

    public ToastieActivity setCardElevation(float elevation){
        this.cardElevation=elevation;
        return this;
    }

    public ToastieActivity setCardRadius(float radius){
        this.cardCornerRadius=radius;
        return this;
    }

    public ToastieActivity setTextSize(float textSize){
        this.textSize=textSize;
        return this;
    }

    public ToastieActivity setTypeFace(Typeface typeface){
        this.typeface=typeface;
        return this;
    }

    public ToastieActivity setGravity(int gravity,int xOffset,int yOffset){
        this.gravity=gravity;
        this.xOffset=xOffset;
        this.yOffset=yOffset;
        return this;
    }

    /**
     * Creates the toast with initialized variables. And returns the custom toast.
     * @param duration Duration of the toast message.
     * @return Toast object.
     */
    public Toast createToast(int duration){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view=inflater.inflate(R.layout.toast_layout,null);
        CardView cardView=view.findViewById(R.id.cardView);
        ImageView toastIcon=view.findViewById(R.id.toastIcon);
        TextView toastMessage=view.findViewById(R.id.toastMessage);

        cardView.setCardBackgroundColor(context.getColor(cardBackgroundColor));
        cardView.setCardElevation(cardElevation);
        cardView.setRadius(cardCornerRadius);
        toastIcon.setImageDrawable(context.getDrawable(icon));
        toastMessage.setTextSize(textSize);
        toastMessage.setText(message);
        toastMessage.setTypeface(typeface);

        Toast toast=new Toast(context);
        toast.setView(view);
        toast.setDuration(duration);
        if (gravity!=-91) toast.setGravity(gravity,xOffset,yOffset);
        return toast;
    }

    /**
     * Pre-Set Info toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast
     */
    public static Toast infoToast(Context context, String message,int duration){
        return new ToastieActivity(context)
                .setIcon(R.drawable.ic_info_black_24dp)
                .setMessage(message)
                .setCardBackgroundColor(R.color.infoColor)
                .createToast(duration);
    }

    /**
     * Pre-Set Centered Info toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast centerInfoToast(Context context,String message,int duration){
        Toast toast=warningToast(context,message,duration);
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    /**
     * Pre-Set Top Info toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast topInfoToast(Context context,String message,int duration){
        Toast toast=warningToast(context,message,duration);
        toast.setGravity(Gravity.TOP,0,64);
        return toast;
    }

    /**
     * Pre-Set Warning toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast warningToast(Context context, String message,int duration){
        return new ToastieActivity(context)
                .setIcon(R.drawable.ic_warning_white_24dp)
                .setMessage(message)
                .setCardBackgroundColor(R.color.warningColor)
                .createToast(duration);
    }

    /**
     * Pre-Set Centered Warning toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast centerWarningToast(Context context,String message,int duration){
        Toast toast=warningToast(context,message,duration);
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    /**
     * Pre-Set Top Warning toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast topWarningToast(Context context,String message,int duration){
        Toast toast=warningToast(context,message,duration);
        toast.setGravity(Gravity.TOP,0,64);
        return toast;
    }

    /**
     * Pre-Set Error toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast errorToast(Context context, String message, int duration){
        return new ToastieActivity(context)
                .setIcon(R.drawable.ic_error_black_24dp)
                .setMessage(message)
                .setCardBackgroundColor(R.color.errorColor)
                .createToast(duration);
    }

    /**
     * Pre-Set Centered Error toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast centerErrorToast(Context context,String message,int duration){
        Toast toast=errorToast(context,message,duration);
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    /**
     * Pre-Set Top Error toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast topErrorToast(Context context,String message,int duration){
        Toast toast=errorToast(context,message,duration);
        toast.setGravity(Gravity.TOP,0,64);
        return toast;
    }

    /**
     * Pre-Set Success toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast successToast(Context context, String message, int duration){
        return new ToastieActivity(context)
                .setIcon(R.drawable.ic_check_circle_black_24dp)
                .setMessage(message)
                .setCardBackgroundColor(R.color.successColor)
                .createToast(duration);
    }

    /**
     * Pre-Set Centered Success toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast centerSuccessToast(Context context,String message,int duration){
        Toast toast=successToast(context,message,duration);
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    /**
     * Pre-Set Top Success toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast topSuccessToast(Context context,String message,int duration){
        Toast toast=successToast(context,message,duration);
        toast.setGravity(Gravity.TOP,0,64);
        return toast;
    }

    /**
     * Customizable toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param icon Icon that will be on the left side of the toast message.
     * @param cardBackgroundColor Background color of toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast makeCustomToast(Context context, String message, int icon, int cardBackgroundColor, int duration){
        return new ToastieActivity(context)
                .setIcon(icon)
                .setMessage(message)
                .setCardBackgroundColor(cardBackgroundColor)
                .createToast(duration);
    }

    /**
     * Customizable centered toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param icon Icon that will be on the left side of the toast message.
     * @param cardBackgroundColor Background color of toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast makeCustomCenterToast(Context context, String message, int icon, int cardBackgroundColor, int duration){
        Toast toast= makeCustomToast(context,message,icon,cardBackgroundColor,duration);
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    /**
     * Customizable top toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param icon Icon that will be on the left side of the toast message.
     * @param cardBackgroundColor Background color of toast.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast makeCustomTopToast(Context context, String message, int icon, int cardBackgroundColor, int duration){
        Toast toast= makeCustomToast(context,message,icon,cardBackgroundColor,duration);
        toast.setGravity(Gravity.TOP,0,64);
        return toast;
    }

    /**
     * Fully customizable toast
     * @param context Context
     * @param message Message that will be on the toast.
     * @param icon Icon that will be on the left side of the toast message.
     * @param cardBackgroundColor Background color of toast.
     * @param cornerRadius Corner radius of the toast.
     * @param elevation Elevation of the toast.
     * @param textSize Text size of the toast message.
     * @param typeface Typeface of the toast message.
     * @param gravity Gravity of the toast.
     * @param xOffset X axis offset for toast gravity.
     * @param yOffset Y axis offset for toast gravity.
     * @param duration Duration of the toast message.
     * @return Toast.
     */
    public static Toast makeAllCustomToast(Context context,String message,int icon,int cardBackgroundColor,float cornerRadius,float elevation,
                                           float textSize,Typeface typeface,int gravity,int xOffset,int yOffset,int duration){
        Toast toast=new ToastieActivity(context)
                .setIcon(icon)
                .setMessage(message)
                .setCardBackgroundColor(cardBackgroundColor)
                .setCardElevation(elevation)
                .setCardRadius(cornerRadius)
                .setTextSize(textSize)
                .setTypeFace(typeface)
                .createToast(duration);
        if (gravity!=-1) toast.setGravity(gravity,xOffset,yOffset);
        return toast;
    }

    /**
     * Simple way to create ToastieActivity. You can use it to fully customize toast.
     * @param context Context
     * @return ToastieActivity object
     */
    public static ToastieActivity makeAllCustomToast(Context context){
        return new ToastieActivity(context);
    }
}
