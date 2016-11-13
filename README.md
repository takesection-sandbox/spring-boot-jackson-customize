Spring Boot の Jackson をカスタマイズ
=============================

# JSR310

Jackson の JSR310 に対応した変換モジュールを Spring Boot で使用したいときは、
jackson-datatype-jsr310 を依存関係に追加することで可能となります。

```
compile 'com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.8.4'
```

このデモプロジェクトでは、上述のモジュールで設定されたシリアライザをさらに Jackson2ObjectMapperBuilderCustomizer を implements したクラスを作成し独自のシリアライザに置換します。
