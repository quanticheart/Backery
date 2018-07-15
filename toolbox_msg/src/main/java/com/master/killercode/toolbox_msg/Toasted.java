package com.master.killercode.toolbox_msg;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toasted {

    private static Activity act;
    private static Toast toast;
    private static String message;
    private static View toastLayout;
    private static ImageView iconLeft;
    private static ImageView iconRight;
    private static TextView tvMsg;
    private static LinearLayout toastLinearLayout;
    private static GradientDrawable drawable;

    //===================================================================================================
    //
    //
    //===================================================================================================

    public static int TYPE_WARNING = 0;
    public static int TYPE_SUCCESS = 1;
    public static int TYPE_INFO = 2;
    public static int TYPE_ERROR = 3;
    public static int TYPE_NELTO = 4;
    private static int TOASTED_TYPE = -1;

    //===================================================================================================
    //
    //
    //===================================================================================================

    public static int GRAVITY_BOTTON_FILL = 0;
    public static int GRAVITY_CENTER_FILL = 1;
    public static int GRAVITY_TOP_FILL = 2;
    //=====
    public static int GRAVITY_BOTTON = 3;
    public static int GRAVITY_CENTER = 4;
    public static int GRAVITY_TOP = 5;
    public static int GRAVITY_FULL_SCREEN = 6;
    public static int GRAVITY_NORMAL = 7;
    public static int GRAVITY_HALF_BOTTON = 8;
    public static int GRAVITY_HALF_TOP = 9;
    //=====
    private static int NOGRAVITY = 7;

    //===================================================================================================
    //
    //
    //===================================================================================================

    public static int TEXT_GRAVITY_START = 0;
    public static int TEXT_GRAVITY_CENTER = 1;
    public static int TEXT_GRAVITY_END = 2;
    public static int TEXT_GRAVITY_LEFT = 0;
    public static int TEXT_GRAVITY_RIGHT = 2;
    //===================================================================================================
    //
    //
    //===================================================================================================

    public static int DURATION_LONG = 0;
    public static int DURATION_SHORT = 1;

    //===================================================================================================
    //
    //
    //===================================================================================================
    public static int ICON_NOT_SHOW = -2;
    public static int ICON_SHOW_ALL = -1;
    public static int ICON_SHOW_LEFT = 0;
    public static int ICON_SHOW_RIGHT = 1;

    //===================================================================================================
    //
    //
    //===================================================================================================
    public static void makeTextWarning(Activity activity, String msg, int duration) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_WARNING, duration);
    }

    public static void makeTextSuccess(Activity activity, String msg, int duration) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_SUCCESS, duration);
    }

    public static void makeTextError(Activity activity, String msg, int duration) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_ERROR, duration);
    }

    public static void makeTextInfo(Activity activity, String msg, int duration) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_INFO, duration);
    }

    public static void makeText(Activity activity, String msg, int duration) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_NELTO, duration);
    }

    protected static void contruct(int type, int duration) {
        initToast();
        initLayout();
        //==========
        setToastedGravity(GRAVITY_NORMAL);
        setToastedType(type);
        setDuration(duration);
        setTextGravity(TEXT_GRAVITY_CENTER);
        setIconGravity(ICON_NOT_SHOW);
        show();
    }

    //===================================================================================================
    //
    //
    //===================================================================================================
    public static void makeTextWarning(Activity activity, String msg, int duration , int iconGravity) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_WARNING, duration , iconGravity);
    }

    public static void makeTextSuccess(Activity activity, String msg, int duration , int iconGravity) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_SUCCESS, duration , iconGravity);
    }

    public static void makeTextError(Activity activity, String msg, int duration , int iconGravity) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_ERROR, duration , iconGravity);
    }

    public static void makeTextInfo(Activity activity, String msg, int duration , int iconGravity) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_INFO, duration , iconGravity);
    }

    public static void makeText(Activity activity, String msg, int duration , int iconGravity) {
        act = activity;
        toast = new Toast(activity);
        message = msg;
        contruct(TYPE_NELTO, duration , iconGravity);
    }

    protected static void contruct(int type, int duration, int iconGravity) {
        initToast();
        initLayout();
        //==========
        setToastedGravity(GRAVITY_NORMAL);
        setToastedType(type);
        setDuration(duration);
        setTextGravity(TEXT_GRAVITY_CENTER);
        setIconGravity(iconGravity);
        show();
    }


    //===================================================================================================
    //
    //
    //===================================================================================================

//    public static void makeAlertFull(Activity activity , String msg){
//
//        LayoutInflater inflater = activity.getLayoutInflater();
//        View toastLayout = inflater.inflate(R.layout.toast_full, (ViewGroup) activity.findViewById(R.id.llCustom));
//        TextView textView = toastLayout.findViewById(R.id.msg);
//        textView.setText(msg);
////        Toast toast = new Toast(activity);
////        toast.setToastedGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL, 0, 0);
////        toast.setDuration(Toast.LENGTH_LONG);
////        toast.setView(toastLayout);
////        toast.show();
//
//    }

//    public static void makeText(Activity activity, String msg) {
//        act = activity;
//        toast = new Toast(activity);
//        message = msg;
//
//        initToast();
//        initLayout();
//        //=========
//        setDuration(DURATION_SHORT);
//        noGravity();
//        show();
//    }
//
//    public static void makeTextLong(Activity activity, String msg) {
//        act = activity;
//        toast = new Toast(activity);
//        message = msg;
//
//        initToast();
//        initLayout();
//        //=========
//        setDuration(DURATION_LONG);
//        noGravity();
//        show();
//    }
//

    public static void makeTextCustom(Activity activity, String msg, int duration, int gravity, int typeShow, int gravityText, int iconGravity) {

        act = activity;
        toast = new Toast(activity);
        message = msg;

        initToast();
        initLayout();
        //==========
        setToastedGravity(gravity);
        setToastedType(typeShow);
        setDuration(duration);
        setTextGravity(gravityText);
        setIconGravity(iconGravity);
        show();
    }


    //===================================================================================================
    //
    //
    //===================================================================================================

    private static void initToast() {
        toast = new Toast(act);
    }

    //===================================================================================================
    private static void initLayout() {
        LayoutInflater inflater = act.getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.toast_full, (ViewGroup) act.findViewById(R.id.llCustom));
        toastLinearLayout = toastLayout.findViewById(R.id.llCustom);
        iconLeft = toastLayout.findViewById(R.id.iconLeft);
        iconRight = toastLayout.findViewById(R.id.iconRight);
        tvMsg = toastLayout.findViewById(R.id.msg);
        tvMsg.setText(message);
        toast.setView(toastLayout);
        toastLinearLayout.setBackgroundResource(R.drawable.toasted);
        drawable = (GradientDrawable) toastLinearLayout.getBackground();
    }

    //===================================================================================================
    private static void show() {
        toast.show();
    }

    //===================================================================================================
    private static void setToastedGravity(int i) {
        switch (i) {
            case 0:
                toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
                drawable.setCornerRadius(0);
                break;
            case 1:
                toast.setGravity(Gravity.CENTER | Gravity.FILL_HORIZONTAL, 0, 0);
                drawable.setCornerRadius(0);
                break;
            case 2:
                toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0);
                drawable.setCornerRadius(0);
                break;
            case 3:
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                drawable.setCornerRadius(50);
                break;
            case 4:
                toast.setGravity(Gravity.CENTER, 0, 0);
                drawable.setCornerRadius(50);
                break;
            case 5:
                toast.setGravity(Gravity.TOP, 0, 0);
                drawable.setCornerRadius(50);
                break;
            case 6:
                toast.setGravity(Gravity.FILL, 0, 0);
                drawable.setCornerRadius(0);
                tvMsg.setGravity(Gravity.CENTER);
                break;
            case 7:
                drawable.setCornerRadius(50);
                break;
            case 8:
                toast.setGravity(Gravity.BOTTOM, 0, 50);
                drawable.setCornerRadius(50);
                break;
            case 9:
                toast.setGravity(Gravity.TOP, 0, 50);
                drawable.setCornerRadius(50);
                break;
        }
    }

    //===================================================================================================
    private static void noGravity() {
        toastLinearLayout.setBackgroundResource(R.drawable.toasted);
    }

    //===================================================================================================
    private static void setToastedType(int typeShow) {
        switch (typeShow) {
            case 0:
//                iconLeft.setBackgroundResource(R.drawable.ic_toasted_report_problem_white_24dp);
                drawable.setColor(act.getResources().getColor(R.color.amber_primary));
                break;
            case 1:
//                iconLeft.setBackgroundResource(R.drawable.ic_toasted_done_white_24dp);
                drawable.setColor(act.getResources().getColor(R.color.green_primary));
                break;
            case 2:
//                iconLeft.setBackgroundResource(R.drawable.ic_toasted_info_outline_white_24dp);
                drawable.setColor(act.getResources().getColor(R.color.light_blue_primary));
                break;
            case 3:
//                iconLeft.setBackgroundResource(R.drawable.ic_toasted_clear_white_24dp);
                drawable.setColor(act.getResources().getColor(R.color.red_primary));
                break;
            case 4:
//                iconLeft.setBackgroundResource(R.drawable.ic_toasted_chevron_right_white_24dp);
                drawable.setColor(act.getResources().getColor(R.color.grey_primary));
                break;
        }
        TOASTED_TYPE = typeShow;
    }

    //===================================================================================================
    private static void setDuration(int i) {
        switch (i) {
            case 0:
                toast.setDuration(Toast.LENGTH_LONG);
                break;
            case 1:
                toast.setDuration(Toast.LENGTH_SHORT);
                break;
        }
    }

    //===================================================================================================
    private static void setTextGravity(int gravityText) {
        switch (gravityText) {
            case 0:
                tvMsg.setGravity(Gravity.START);
                break;
            case 1:
                tvMsg.setGravity(Gravity.CENTER);
                break;
            case 2:
                tvMsg.setGravity(Gravity.END);
                break;
            case 3:
                tvMsg.setGravity(Gravity.LEFT);
                break;
            case 4:
                tvMsg.setGravity(Gravity.RIGHT);
                break;
        }
    }

    //===================================================================================================
    private static void setIconGravity(int iconGravity) {

        switch (TOASTED_TYPE) {
            case 0:
                iconLeft.setBackgroundResource(R.drawable.ic_toasted_report_problem_white_24dp);
                iconRight.setBackgroundResource(R.drawable.ic_toasted_report_problem_white_24dp);
                break;
            case 1:
                iconLeft.setBackgroundResource(R.drawable.ic_toasted_done_white_24dp);
                iconRight.setBackgroundResource(R.drawable.ic_toasted_done_white_24dp);
                break;
            case 2:
                iconLeft.setBackgroundResource(R.drawable.ic_toasted_info_outline_white_24dp);
                iconRight.setBackgroundResource(R.drawable.ic_toasted_info_outline_white_24dp);
                break;
            case 3:
                iconLeft.setBackgroundResource(R.drawable.ic_toasted_clear_white_24dp);
                iconRight.setBackgroundResource(R.drawable.ic_toasted_clear_white_24dp);
                break;
            case 4:
                iconLeft.setBackgroundResource(R.drawable.ic_toasted_chevron_right_white_24dp);
                iconRight.setBackgroundResource(R.drawable.ic_toasted_chevron_left_white_24dp);
                break;
        }

        switch (iconGravity) {
            case -2:
                iconLeft.setVisibility(View.GONE);
                iconRight.setVisibility(View.GONE);
                break;
            case -1:
                iconLeft.setVisibility(View.VISIBLE);
                iconRight.setVisibility(View.VISIBLE);
                break;
            case 0:
                iconLeft.setVisibility(View.VISIBLE);
                break;
            case 1:
                iconRight.setVisibility(View.VISIBLE);
                break;
        }
    }


//    private static void addIcon() {
//        ImageView icon = new ImageView(act);
//        icon.setBackgroundResource(R.drawable.ic_toasted_report_problem_white_24dp);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.gravity = Gravity.RIGHT;
//        icon.setLayoutParams(params);
//        toastLinearLayout.addView(icon);
//    }


}
