package base;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.zhy.autolayout.AutoLayoutActivity;

import butterknife.ButterKnife;

/**
 * Created by dell on 2018/3/10.
 */

public abstract class BaseActivity extends AutoLayoutActivity {
    private boolean isstatus=false;//沉浸式透明状态栏标识
    private boolean showActionBar=true;//是否显示标题栏ActionBar
    private boolean isFullScreen=false;//隐藏状态栏

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(bindLayout());
        ButterKnife.bind(this);
        //设置状态栏沉浸式
       // setStatus(true);
        //是否显示actionbar 标题栏
        setAction(false);
        initData();
    }

    //初始化布局文件
    public abstract int bindLayout();
    //初始化数据
    public abstract void initData();
    ////透明状态栏方法
    public void setStatus(boolean isstatus) {
        this.isstatus = isstatus;
        if (isstatus) {
            //判断当前设备的版本号大于等于19,走这个代码,用于代码适配
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                //透明状态栏
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }
        }
    }
    //隐藏显示标题栏
    public void setAction(boolean showActionBar) {
        this.showActionBar=showActionBar;
        //显示
        if(showActionBar){
            getSupportActionBar().show();
        }else{
            //隐藏
            getSupportActionBar().hide();
        }
    }
    //设置是否隐藏状态栏,显示全屏
    public void setFullScreen(boolean fullScreen){
        this.isFullScreen=isstatus;
        if(isFullScreen){
            //是全屏的时候
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }

    //跳转传值
    public void startActivity(Class<?> clz){
        Intent intent=new Intent(this,clz);
        startActivity(intent);
    }

    //Toast
    public void showToats(String msg){
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}
