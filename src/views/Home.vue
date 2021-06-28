<template>
  <div>
    <common-header :type="type" :title="title"></common-header>
    <grid-card></grid-card>
  </div>
</template>
<script>
import CommonHeader from "../components/CommonHeader.vue";
import GridCard from "../components/GridCard.vue";
export default {
  components: { GridCard, CommonHeader },
  name: "Home",
  data() {
    return {
      type: "0",
      title: "首页",
    };
  },
};
</script>
