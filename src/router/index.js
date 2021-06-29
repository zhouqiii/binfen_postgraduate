import { createRouter, createWebHashHistory } from "vue-router";
import Home from "../views/Home.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/PaperDetail",
    name: "PaperDetail",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "paperdetail" */ "../views/PaperDetail.vue"),
  },
  {
    path: "/about",
    name: "about",
    component: () =>
      import(/* webpackChunkName: "paperdetail" */ "../views/About.vue"),
  },
  {
    path: "/select",
    name: "select",
    component: () =>
      import(/* webpackChunkName: "paperdetail" */ "../views/quest/Select.vue"),
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
