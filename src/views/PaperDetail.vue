<template>
  <div class="home" @click="testAxios">111</div>
</template>

<script>
import { testApi1 } from "../utils/commonInterface";
export default {
  name: "PaperDetail",
  methods: {
    testAxios() {
      const data = { name: "testApi1" };
      testApi1(data)
        .then((res) => {
          console.log(res);
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>
<style lang="less" scoped></style>
