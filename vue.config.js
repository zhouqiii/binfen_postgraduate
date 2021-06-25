module.exports = {
  chainWebpack: (config) => {
    // 需要安装 style-resources-loader 与stylus一致
    const oneOfsMap = config.module.rule("less").oneOfs.store;
    oneOfsMap.forEach((item) => {
      item
        .use("style-resources-loader")
        .loader("style-resources-loader")
        .options({
          // 需要插入的文件路径
          patterns: "./src/assets/style/vars.less",
          // 需要插入的文件路径数组
          // patterns: ["./path/to/vars.less", "./path/to/mixins.less"]
        })
        .end();
    });
  },
};
