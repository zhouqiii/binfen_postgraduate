<template>
  <div class="homeH">
    <img alt="Vue logo" src="../assets/logo.png">
    <div class="homeA">
      <div class="ll">你不好</div>
    </div>
    <div class="child">你好</div>
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue';
import '../assets/styles/common_box.less';

export default {
  name: 'Home',
  components: {
    HelloWorld,
  },
};
</script>
<style lang="less" scoped>
.ll{
  background: @bgColor;//使用的是全局变量
}

</style>
