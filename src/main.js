import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";

//rem.js是一个固定html根font-size大小的函数
import "./lib/rem.js";
//引入公共样式
//normal——浏览器适配 common_box——复用的样式 theme——vant主题样式定制
import "./assets/style/normal.css";
import "./assets/style/common_box.less";
import "./assets/style/theme.less";
//引入vant
import "vant/lib/index.css";
import Icon from "vant";
createApp(App).use(Icon);
//引入公共组件
import CommonHeader from "./components/CommonHeader.vue";
createApp(App).component("common-header", CommonHeader);

createApp(App).config.productionTip = false;

createApp(App).use(store).use(router).mount("#app");
