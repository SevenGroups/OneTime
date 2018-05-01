package shiping.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bw.com.onetimedemo.R;
import com.bw.com.onetimedemo.ShiPinZuoPinActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class KanShiPinActivity extends BaseActivity implements View.OnClickListener{

    @BindView(R.id.fanhui)
    ImageView fanhui;
    @BindView(R.id.xihuan)
    ImageView xihuan;
    @BindView(R.id.noxh)
    ImageView noxh;
    @BindView(R.id.fenxiang)
    ImageView fenxiang;
    @BindView(R.id.w)
    LinearLayout w;
    @BindView(R.id.sdv_22)
    SimpleDraweeView sdv22;
    @BindView(R.id.shiping)
    JCVideoPlayerStandard shiping;
    @BindView(R.id.xq)
    TextView xq;
    private String uid;
    private String icon;


    @Override
    public int bindLayout() {
        return R.layout.activity_kan_shi_pin;
    }

    @Override
    public void initData() {
        fanhui.setOnClickListener(this);
        xihuan.setOnClickListener(this);
        noxh.setOnClickListener(this);
        fenxiang.setOnClickListener(this);
        sdv22.setOnClickListener(this);
        shiping.setOnClickListener(this);

        Intent intent = getIntent();
        uid = intent.getStringExtra("uid");
        icon = intent.getStringExtra("icon");
        String mp4 = intent.getStringExtra("mp4");
        String cover = intent.getStringExtra("cover");

        Uri uri = Uri.parse(icon);
        sdv22.setImageURI(uri);
        shiping.TOOL_BAR_EXIST = false;
        shiping.setUp(mp4,JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL);
        Picasso.with(KanShiPinActivity.this).load(cover).into(shiping.thumbImageView);
        shiping.widthRatio = 4;//播放比例
        shiping.heightRatio = 3;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fanhui:
                //返回
                finish();
                break;
            case R.id.xihuan:
                //喜欢
                break;
            case R.id.noxh:
                //不喜欢
                break;
            case R.id.fenxiang:
                //分享
                break;
            case R.id.sdv_22:
                //头像
                Intent intent=new Intent(KanShiPinActivity.this,ShiPinZuoPinActivity.class);
                intent.putExtra("uid", uid);
                intent.putExtra("icon",icon);
                startActivity(intent);
                break;
            case R.id.shiping:
                //视频
                break;
        }
    }
}
