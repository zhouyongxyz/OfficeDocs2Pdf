# OfficeDocs2Pdf
Office world，ppt，excel convert to pdf

  项目提供两种方式转换office 文件到pdf 格式，一种使用libreoffice 支持多平台，但是有个问题转换效果不太好。另外一种使用jacob 方式调用系统office 或者 wps
来实现转换，效果比较好，但是只支持windows。

  1. 需要解压jacob-1.19.zip 文件，并且拷贝jacob-1.19-x64.dll 发到JDK 所在目录bin 目录，并且导入jacob.jar 就可以工作了。
  2. libreoffice 需要启动libreoffice 服务soffice -headless -accept="socket,host=127.0.0.1,port=8100;urp;"
  
  
