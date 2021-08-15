学习点击事件传递过程
学到的知识点总结：
1、已学习从ViewGroup到View的过程，主要有分发、拦截、处理三个过程，其中view没有拦截；
2、onTouch在前，onTouchEvent在后
3、View的dispatchTouchEvent只有返回为true，才会有接下来的Action
4、有的控件是不可点击的，比如ImageView，对它点击走后onTouchEvent（onTouch不消费的话）和dispatchTouchEvent会分别返回false，也就不会有UP和MOVE等相关action
5、学习资料：
https://blog.csdn.net/guolin_blog/article/details/9097463
https://blog.csdn.net/guolin_blog/article/details/9153747
https://blog.csdn.net/qq475703980/article/details/92385368?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&dist_request_id=&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control
Sequence图片

下一步学习计划：
学习全流程的时间传递，最好是从底层socket、handler到主线程、Activity到View
