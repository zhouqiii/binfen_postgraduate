import axios from "axios";
//import qs from "qs";
//创建axios实例
const instance = axios.create({
  baseURL: process.env.NODE_ENV === "development" ? "" : "http://baidu.com",
  timeout: 15000,
  //这个是用来配合axios的qs模块使用的，是es6的特性
  //配合qs把json数据序列化，拼在url后面形成？ &的格式发送请求
  //因为post一般是json格式上送参数，这个配合qs可以避免手动的一个一个拼
  //headers: { 'content-type': 'application/x-www-form-urlencoded' },
});
// 添加请求拦截器
instance.interceptors.request.use(
  (config) => {
    // 在发送请求之前做些什么,也可以在这里设置headers：
    //config.headers['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
    return config;
  },
  (error) => {
    // 对请求错误做些什么
    return Promise.reject(error);
  }
);

// 添加响应拦截器
instance.interceptors.response.use(
  (response) => {
    //返回response.data/status/config/headers等有用信息
    // 对响应数据做点什么
    if (response.status === 200) {
      return response.data;
    }
    return response;
  },
  (error) => {
    // 对响应错误做点什么
    console.log(error);
    return Promise.reject(error);
  }
);
const request = ({ url = "", data = {}, params = {}, method = "post" } = {}) =>
  instance({
    url,
    data, //qs.stringify(data),
    params,
    method,
  });
export default request;
