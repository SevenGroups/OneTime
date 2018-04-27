package tuijian.presenter;

import tuijian.Bean.Shipin;
import tuijian.model.Smodel;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/27.
 */

public class Spresenter {
      Tview tview;
      Smodel smodel;

    public Spresenter(Tview tview) {
        this.tview = tview;
        smodel=new Smodel();
    }
     public void guanS( String s,String A,int type,int page){
         smodel.Shipin(s,A,type, page, new Smodel.OnGetListener() {
             @Override
             public void OnGetSuccessM(Shipin shipin) {
                  tview.Shipin(shipin);
             }
         });

     }
}
