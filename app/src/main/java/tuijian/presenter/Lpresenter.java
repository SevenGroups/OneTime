package tuijian.presenter;

import tuijian.Bean.Lunbo;
import tuijian.model.Lmodel;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/26.
 */

public class Lpresenter {
    Lmodel lmodel;
    Tview tview;

    public Lpresenter(Tview tview) {
          lmodel=new Lmodel();
        this.tview = tview;
    }
    public  void Lguan(){
        lmodel.getdata(new Lmodel.OnGetListener() {
            @Override
            public void OnGetSuccessM(Lunbo lunbo) {
                tview.Success(lunbo);
            }
        });
    }
}
