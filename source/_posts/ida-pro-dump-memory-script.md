title: "IDA Pro内存dump脚本"
date: 2015-08-02 18:37:33
categories: 调试逆向
tags: [IDA Pro,奇淫技巧]
description:
---
使用IDA Pro调试程序时偶尔会遇到dump内存的需求，IDA Pro并没有直接提供内存dump的功能，但可以通过其提供的接口用脚本来实现相关功能。

<!--more-->

#IDC脚本
``` c
auto i,fp;
fp = fopen("d:\\dump.dex","wb");
for (i = start_address; end_address; i++)
     fputc(Byte(i),fp);
```

#IDA Python脚本
``` python
import idaapi

data = idaapi.dbg_read_memory(start_address, data_length)
fp = open('d:\\dump.dex', 'wb')
fp.write(data)
fp.close()

```