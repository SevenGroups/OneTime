package tuijian.presenter;

import tuijian.Bean.Shipin;
import tuijian.model.Gmodel;
import tuijian.view.Gview;

/**
 * Created by Lenovo on 2018/4/27.
 */

public class Gpresenter {
    Gview gview;
     Gmodel gmodel;

    public Gpresenter(Gview gview) {
        this.gview = gview;
           gmodel=new Gmodel();
    }
     public void guanS( String s,String A,int type,int page){
         gmodel.Shipin(s, A, type, page, new Gmodel.OnGetListener() {
             @Override
             public void OnGetSuccessM(Shipin shipin) {
                 gview.guna(shipin);
             }
         });


     }
}
