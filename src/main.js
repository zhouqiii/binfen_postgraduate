import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import "./lib/rem.js";

import "./assets/style/normal.css";
import "./assets/style/common_box.less";
import "./assets/style/theme.less";

import "vant/lib/index.css";
import Icon from "vant";
createApp(App).use(Icon);
//引入公共组件
import CommonHeader from "./components/CommonHeader.vue";
createApp(App).component("common-header", CommonHeader);

createApp(App).config.productionTip = false;

createApp(App).use(store).use(router).mount("#app");
