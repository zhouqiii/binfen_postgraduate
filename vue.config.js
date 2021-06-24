module.exports = {
  // less 全局变量引入方法一
  // less此方法只支持变量key:value赋值，
  // css: {
  // loaderOptions: {
  //   less: {
  //       globalVars: {
  //         "@color": "blue"
  //       }
  //     }
  // }
  // }
// 这种方式定义全局变量我本地测试并没有成功，容易出错，所以我就不用这个了，方法二就可以
  // pluginOptions: { // 第三方插件style-resources-loader配置
  //   'style-resources-loader': {//用该style预编译器为less做预编译
  //     preProcessor: 'less',
  //     patterns: [path.resolve(__dirname, './src/assets/styles/vars.less')]//这里定义你的公共样式
  //   }
  // },
// less 全局变量引入方法二
// 使用chainWebpack
// 需要安装 style-resources-loader 插件
  chainWebpack: (config) => {
    // 需要安装 style-resources-loader 与stylus一致
    const oneOfsMap = config.module.rule('less').oneOfs.store;
    oneOfsMap.forEach((item) => {
      item
        .use('style-resources-loader')
        .loader('style-resources-loader')
        .options({
          // 需要插入的文件路径
          patterns: './src/assets/styles/vars.less',
          // 需要插入的文件路径数组
          // patterns: ["./path/to/vars.less", "./path/to/mixins.less"]
        })
        .end();
    });
  },
};
