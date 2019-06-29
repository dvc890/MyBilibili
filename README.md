# MyBilibili
一款基于 MVP+RxJava2+Retrofit+Dagger2+Butterknife+Glide的个人Bilibili（哔哩哔哩）客户端

项目的网络请求接口bilibili-api采用官方版本541000的，版本相对较新，不过仍然和最新版本的api有小部分区别。

[Demo下载](https://github.com/dvc890/MyBilibili/raw/master/MyBiliBili_demo.apk)

这个项目源自于个人爱好，随着哔哩哔哩客户端的不断臃肿，希望能有个简洁的版本，但网络上并没能找到功能较为完善的版本，要么版本太旧无法使用，要么完成度还不高，因而萌生了自己动手的想法。过程中也遇到了不少问题，中途发现[FakeBilibli](https://github.com/TeamNB/FakeBiliBili)这个开源项目，给我很大的帮助，感谢作者。

因为是个人兴趣项目，所以是不定期更新～有什么建议或者疑问欢迎大家提Issues交流。觉得不错就给个星星吧~

### 本项目预计支持的功能 [MyBilibili for Android](https://github.com/dvc890/MyBilibili)
- [x] 完整的bilibili-Api（采用java编写）【自己弄完才发现有人有现成的[来自czp3009的bilibili-api kotlin版本](https://github.com/czp3009/bilibili-api)】
- [x] 开屏页面（广告倒计时）
- [x] 主页-推荐页面（天马推荐系统页面）
- [x] 主页-直播页面
- [x] 登录-登录页面（可登陆）
- [x] 破解Libbilid（官方的一些sign算法和appkey的工具类，之前测试的时候直接引用，然后被坑了，一气之下决定破解它）
- [x] 播放器，修改自[GSYVideoPlayer](https://github.com/CarGuo/GSYVideoPlayer)（[ijkplayer](https://github.com/Bilibili/ijkplayer)），支持bilibili特殊的dash音视频文件分离形式，quic协议
- [x] 观看直播，支持实时评论弹幕
- [x] 推荐视频页面，支持查看评论和观看视频
- [ ] 点赞功能
- [ ] 评论功能
- [ ] 弹幕功能（支持直播页面和视频页面，暂时还没做发弹幕功能）
- [ ] 直播推流（界面还没有做，仅进行了功能初步测试）
- [ ] 主页-侧栏（暂时仅支持预览和点击头像登录，其他功能推迟实现）
- [ ] 番剧页面
- [ ] 影剧页面
- [ ] 动态页面-兴趣圈
- [ ] 个人中心
- [ ] 分区
- [ ] 搜索
- [ ] 频道
- [ ] 私信系统

### 不打算支持的功能
 - ~~注册功能~~
 - ~~音乐功能~~
 - ~~游戏区~~
 - ~~会员购功能~~
 - ~~下载功能~~
 - ~~直播礼物功能~~
 - ~~其他业务性质的功能~~

### 鸣谢项目
- butterknife
- fastjson
- Plain MVP
- dagger2
- Rxjava
- Glide
- Retrofit
- RxCache
- okhttp
- BaseRecyclerViewAdapterHelper
- AgentWebView
- RxTool
- lottie
- DanmakuFlameMaster
...

### Demo截图
<table>
	<tr>
		<th>主页-直播</th>
		<th>主页-推荐</th>
		<th>主页-侧滑</th>
	</tr>
	<tr>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/livehome.png"/>
		  </td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/homepage.png"/>
		  </td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/homepage_drawer.png"/>
      </td>
	</tr>
</table>
<table>
	<tr>
		<th>视频-直播</th>
		<th>视频-点播-信息</th>
		<th>视频-点播-评论</th>
	</tr>
	<tr>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/livepage.png"/>
      </td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/video_infopage.png"/>
		  </td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/video_replypage.png"/>
		  </td>
	</tr>
</table>

### Demo动态图
<table>
	<tr>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/splash.gif"/>
		</td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/video.gif"/>
		</td>
		  <td>
			  <img src="https://github.com/dvc890/MyBilibili/raw/master/screenshot/live.gif"/>
		</td>
	</tr>
</table>
