<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <div class="homeA">
      <div class="ll"><span class="ll_testless">1111111</span>你不好</div>
    </div>
    <div class="child">你好</div>
    <HelloWorld msg="Welcome to Your Vue.js App" />
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";
// import "../assets/style/common_box.less";
export default {
  name: "Home",
  components: {
    HelloWorld,
  },
};
</script>
<style lang="less" scoped>
.ll {
  background: @bgColor;
}
</style>
