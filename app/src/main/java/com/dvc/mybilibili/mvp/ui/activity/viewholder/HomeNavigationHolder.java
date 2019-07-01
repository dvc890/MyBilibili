package com.dvc.mybilibili.mvp.ui.activity.viewholder;

import android.support.design.widget.NavigationView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvc.base.BaseMvpHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.presenter.activity.HomePresenter;
import com.dvc.mybilibili.mvp.ui.widget.PendantAvatarLayout;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;


public class HomeNavigationHolder extends BaseMvpHolder implements View.OnClickListener{

    @BindView(R.id.profile_cover_image)
    ImageView profile_cover_image;
    @BindView(R.id.avatar_layout)
    PendantAvatarLayout avatar_layout;
    @BindView(R.id.user_nick_text)
    TextView user_nick_tv;
    @BindView(R.id.level)
    TextView level;
    @BindView(R.id.vip_status)
    TextView vipStatus;
    @BindView(R.id.member_status)
    TextView memberStatus;
    @BindView(R.id.music_status)
    TextView musicStatus;
    @BindView(R.id.qrcode)
    ImageView qrcode;
    @BindView(R.id.nav_pay)
    ImageView navPay;
    @BindView(R.id.answer_entry)
    TextView answerEntry;
    @BindView(R.id.vip_entry)
    LinearLayout vipEntry;

//    @BindView(R.id.nav_settings)
//    LinearLayout navSettings;
//    @BindView(R.id.nav_theme)
//    LinearLayout navTheme;
//    @BindView(R.id.switch_night)
//    LinearLayout switchNight;

    HomePresenter presenter;

    public HomeNavigationHolder(NavigationView view, HomePresenter presenter) {
        super(view.getHeaderView(0));
        this.presenter = presenter;
        view.findViewById(R.id.nav_settings).setOnClickListener(this);
        view.findViewById(R.id.nav_theme).setOnClickListener(this);
        view.findViewById(R.id.switch_night).setOnClickListener(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void refrashAvatar(LoginInfo loginInfo) {
        if (this.presenter.isLogin()) {
            avatar_layout.setAvatarUrl(this.presenter.getAccountInfo().getAvatar());
            if(this.presenter.getAccountInfo().getPendantInfo() != null)
                avatar_layout.setPendantUrl(this.presenter.getAccountInfo().getPendantInfo().getImage());
            if(this.presenter.getAccountInfo().getVipInfo().isEffectiveYearVip())
                avatar_layout.showBigVipIcon(PendantAvatarLayout.VerifySize.LARGE);
            profile_cover_image.setImageResource(R.drawable.bili_drawerbg_logined);
            user_nick_tv.setText(this.presenter.getAccountInfo().getUserName());
        } else {
            avatar_layout.setAvatarUrl(null);
            avatar_layout.setPendantUrl(null);
            avatar_layout.hideBigVipIcon();
            profile_cover_image.setImageResource(R.drawable.bili_drawerbg_not_logined);
            user_nick_tv.setText(R.string.nav_login_click_avatar);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nav_settings:
                break;
            case R.id.nav_theme:
                break;
            case R.id.switch_night:
                break;
        }
    }
}
