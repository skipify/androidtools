类库来源于  http://blog.csdn.net/lmj623565791/article/details/38965311

源码下载直接放在 项目源码中

初始化

```
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Kudo.setContext(this);
    }
}

```