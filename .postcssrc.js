module.exports = {
  plugins: {
    'postcss-pxtorem': {
      rootValue: 32, //根目录的字体大小设为32px
      propList: ['*', '!font-size', '!border', 'border-radius', '!box-shadow', '!text-shadow'],//proplist:是那些属性需要转换成rem，全部
      minPixelValue: 10, //最小转换单位.2px
      unitPrecision: 5,//是转换成rem后保留的小数点位数
    }
  }
};