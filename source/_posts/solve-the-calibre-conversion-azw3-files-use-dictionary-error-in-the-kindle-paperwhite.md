title: "解决Calibre转换的.azw3文件在Kindle中取词错误"
date: 2015-07-05 02:04:52
categories: 问题记录
tags: Kindle
description:
---

最近购买了Amazon新版的Kindle PaperWhite阅读器，在使用时发现azw3格式的电子书排版要比mobi格式更加精致，于是将已有的mobi电子书转换成了azw3格式，但发现通过Calibre转换的azw3格式电子书在Kindle中阅读时对中文的取词会出现问题，具体表现为长按取词时会选中整句。
本文记录了解决该问题的方法。
<!-- more -->
##问题现象
![](http://7xicmh.com1.z0.glb.clouddn.com/blog/solve-the-calibre-conversion-azw3-files-use-dictionary-error-in-the-kindle-paperwhite/error.png)

##解决思路
发现该问题时第一反应是认为Calibre的设置不对，但在多次更改转换参数后始终未能解决该问题，后来发现一些无损mobi在推送到Amazon云端的时候，Amazon的服务器会将其中的KF8格式文件从中提取出来重新生成azw3文件，并且该azw3文件在Kindle中阅读时对中文取词并不会出现问题，于是便有了解决该问题的思路。

##解决方案
###将azw3文件无损转换为mobi文件
转换方法可参考以下文章
[\[将 azw3 格式转换为 mobi 格式并保持原有排版格式\]](http://kindlefere.com/post/102.html)
或使用以下工具进行转换
[\[无损转换为mobi\]](http://yun.baidu.com/s/1o6r76GU)

###将mobi格式推送到Amazon云端服务器
可直接使用Amazon注册邮箱发送至Kindle邮箱，然后等待Amazon服务器将推送的mobi文件提取转换为azw3文件。

###下载并阅读转换后的文件
当Amazon完成转换后，会自动将书籍同步到Kindle中，但是Amazon服务器生成的azw3文件会带有PDOC标签，在阅读器中会显示为个人文档，且不会显示封面，有强迫症的同学可自行从Amazon的云端下载转换后的文件进行编辑，然后再次通过Calibre发送到设备即可。

##成果展示
![](http://7xicmh.com1.z0.glb.clouddn.com/blog/solve-the-calibre-conversion-azw3-files-use-dictionary-error-in-the-kindle-paperwhite/normal.png)