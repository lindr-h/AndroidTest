package cn.hbu.cs.maingrid;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class DialogMy extends Dialog {
    private Window mWindow;
    public DialogMy(Context context) {
        super(context);
        mWindow = this.getWindow();
        mWindow.setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams lp = mWindow.getAttributes();
        //lp.gravity = Gravity.TOP;
        setCanceledOnTouchOutside(true);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        mWindow.setContentView(R.layout.dialog_my);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){ //Bundle savedInstanceState
        super.onCreate(savedInstanceState);
        Button mConfirm=  findViewById(R.id.button666);
        //设置事件
        mConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
}