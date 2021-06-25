import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import "./lib/rem.js";
import "./assets/style/normal.css";
import "./assets/style/common_box.less";
import "vant/lib/index.css";
import Vant from "vant";

createApp(App).use(Vant);

createApp(App).config.productionTip = false;

createApp(App).use(store).use(router).mount("#app");
