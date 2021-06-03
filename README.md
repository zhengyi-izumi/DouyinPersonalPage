# DouyinPersonalPage
个人大作业，实现一个抖音个人页

## 一个三段式页面布局示例

```xml
<RelativeLayout android:layout_width="match_parent"
                android:layout_height="match_parent">

    <RelativeLayout
        android:id="@+id/ly_top_bar"
        android:layout_width="match_parent"
        android:layout_height="48dp"> <!--48dp高度-->

        <TextView
            android:id="@+id/txt_topbar"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
        <View
            android:layout_width="match_parent"
            android:layout_height="2px"
            android:layout_alignParentBottom="true"/> <!--两个像素做一条分界线-->

    </RelativeLayout>



    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_below="@id/ly_top_bar"
        android:layout_above="@id/div_tab_bar" ≈
        android:id="@+id/ly_content"><!--设置了above 和 below的对齐，此时height属性没有用-->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Hello" />
    </FrameLayout>

    <View
        android:id="@+id/div_tab_bar"
        android:layout_width="match_parent"
        android:layout_height="2px"
        android:layout_above="@id/ly_tab_bar"/><!--设置above谁-->

    <LinearLayout
        android:id="@+id/ly_tab_bar"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:layout_alignParentBottom="true"><!--对齐父组件底部-->

        <TextView
            android:id="@+id/txt_channel"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />

        <TextView
            android:id="@+id/txt_message"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />

        <TextView
            android:id="@+id/txt_better"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />

        <TextView
            android:id="@+id/txt_setting"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"/>

    </LinearLayout>

</RelativeLayout>
```

## 知识点学习

> ### ui属性的优先级
>
> * `matchparent`并不是一定会matchparent
>
>   ```xml
>   <RelativeLayout android:layout_width="match_parent"
>       android:layout_height="match_parent">
>   
>       <TextView
>           android:layout_width="match_parent"
>           android:layout_height="56dp"/>
>   
>       <FrameLayout
>           android:layout_width="match_parent"
>           android:layout_height="match_parent"/>
>   </RelativeLayout>
>   ```
>
>   * 比如`FrameLayout`就不可能match parent，他必须让出`56dp`，因此dp的优先级更高
>
>   
